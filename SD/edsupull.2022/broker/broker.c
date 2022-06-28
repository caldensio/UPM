#include <sys/socket.h>
#include <netinet/in.h>
#include <sys/uio.h>
#include <stdio.h>
#include <unistd.h>
#include <stdlib.h>
#include <fcntl.h>
#include <pthread.h>
#include <string.h>
#include "comun.h"
#include "util/map.h"
#include "util/set.h"
#include "util/queue.h"



map * mapa_cliente;
map * mapa_temas;

struct cabecera{
    int long1;
    int long2;
    int long3;
};

typedef struct cliente{
    char * uuid;
    set * set_temas;
    queue * cola_eventos;
} cliente;

typedef struct tema{
    char * id_tema;
    set * set_suscriptores;
} tema;

typedef struct evento{
    char * id_tema;
    char * evento;
    uint32_t *tam_evento;
    int n_subs;
}evento;

cliente* nuevo_cliente(char * uuid_cliente){
    int error;
    if(map_size(mapa_cliente)>0){
        cliente *c = map_get(mapa_cliente, (const void*)uuid_cliente, &error);
        if(error==0){
            printf("Usuario ya registrado en el sistema. Recuperando informacion...\n");
            return c;
        }
    }
    cliente *c = malloc(sizeof(cliente));
    c->uuid = uuid_cliente;
    c->set_temas=set_create(1);
    c->cola_eventos=queue_create(1);
    map_put(mapa_cliente, c->uuid, c);
    return c;
    
}

int borrar_cliente(cliente* c){
    //Dar de baja de todos los temas suscritos
    printf("Entra\n");
    set_iter *iter=set_iter_init(c->set_temas);
    for(;set_iter_has_next(iter); set_iter_next(iter)){
        tema * t = (tema *)set_iter_value(iter);
        set_remove(t->set_suscriptores, c, NULL);
    }
    set_iter_exit(iter);
    set_destroy(c->set_temas, NULL);
    queue_destroy(c->cola_eventos, NULL);
    int res=map_remove_entry(mapa_cliente, (const void*)c->uuid, 0);
    free(c);
    printf("usuario borrado\n");
    return res;
}

tema* nuevo_tema(char * id_tema){
    tema *t = malloc(sizeof(tema));
    t->id_tema = id_tema;
    t->set_suscriptores=set_create(1);
    map_put(mapa_temas, t->id_tema, t);
    return t;
}

evento* nuevo_evento(char * id_tema, char * ev, uint32_t *tam_evento){
    evento *e = malloc(sizeof(evento));
    e->id_tema = id_tema;
    e->evento=ev;
    e->tam_evento=tam_evento;
    e->n_subs=0;
    return e;
}

int suscribirse(cliente *c, char * id_tema){
    int error;
    tema *t=map_get(mapa_temas,(const void*)id_tema,&error);
    if(error==-1){
        return error;
    }
    else{
        if(set_contains(c->set_temas, t)) return -1;
        set_add(c->set_temas, t);
        set_add(t->set_suscriptores, c);
        printf("Cliente suscrito\n");
        return error;
    }
}

int desuscribirse(cliente * c, char * id_tema){
    int error;
    tema *t=map_get(mapa_temas,(const void*)id_tema,&error);
    if(error==-1){
        return -1;
    }
    else{
        error = set_remove(c->set_temas,t, NULL);
        if(error==-1) return error;
        set_remove(t->set_suscriptores,c, NULL);
        if(error==-1) return error;
        return error;
    }
}

int publicar(char * id_tema, char * evnt, uint32_t *tam_evento){
    int error;
    tema *t = map_get(mapa_temas,(const void*)id_tema, &error);
    if(error==-1){
        return error;
    }
    else{
        evento * e = nuevo_evento(id_tema, evnt, tam_evento);
        set *subs = t->set_suscriptores;
        set_iter *iter =set_iter_init(subs);
        int contador=0;
        for(;set_iter_has_next(iter); set_iter_next(iter)){
            cliente * c = (cliente *)set_iter_value(iter);
            error = queue_push_back(c->cola_eventos, e);
            contador++;
        }
        set_iter_exit(iter);
        e->n_subs=contador;
        return error;
    }
}

int get(int socket_con, cliente *c){
    int error;
    if(queue_length(c->cola_eventos)>0){ 
        evento * e = queue_pop_front(c->cola_eventos, &error);
        int escrito;
        struct cabecera cab;
        cab.long1=htonl(strlen(e->id_tema));
        cab.long2=htonl(e->tam_evento);
        struct iovec iov[3];
        iov[0].iov_base=&cab;
        iov[0].iov_len=sizeof(cab);
        iov[1].iov_base=e->id_tema;
        iov[1].iov_len=strlen(e->id_tema);
        iov[2].iov_base=e->evento;
        iov[2].iov_len=e->tam_evento;
        if((escrito=writev(socket_con,iov,3))<0){
            perror("Error en el writev\n");
            close(socket_con);
            return 1;
        }
        e->n_subs--;
        if(e->n_subs<1){
            printf("No quedan clientes por recibir este evento, liberando memoria...\n");
            free(e);
        }
        return 0; 
    }
    else{
        printf("No habia ningun evento pendiente");
        int escrito;
        struct cabecera cab;
        cab.long1=htonl(strlen("0"));
        cab.long2=htonl(strlen("0"));
        struct iovec iov[3];
        iov[0].iov_base=&cab;
        iov[0].iov_len=sizeof(cab);
        iov[1].iov_base="0";
        iov[1].iov_len=strlen("0");
        iov[2].iov_base="0";
        iov[2].iov_len=strlen("0");
        if((escrito=writev(socket_con,iov,3))<0){
            perror("Error en el writev\n");
            close(socket_con);
            return 1;
        }
    }
} 


void check_msg(char * oper, char * buf, int socket_con, cliente* c){
    char selector=oper[0];
    if(selector=='C'){
        int n_clientes=map_size(mapa_cliente);
        send(socket_con, &n_clientes, sizeof(n_clientes), MSG_WAITALL);
    }
    else if(selector=='B'){
        int res=borrar_cliente(c);
        send(socket_con, &res, sizeof(res), MSG_WAITALL);
        close(socket_con);
    } 
    else if(selector=='S'){
        int res=suscribirse(c,buf);
        send(socket_con, &res, sizeof(res), MSG_WAITALL);
    }
    else if(selector=='U'){
        int res=desuscribirse(c,buf);
        send(socket_con, &res, sizeof(res), MSG_WAITALL);
    }
    else if(selector=='T'){
        int n_temas=map_size(mapa_temas);
        send(socket_con, &n_temas, sizeof(n_temas), MSG_WAITALL);
    }
    else if(selector=='E'){
        int n_eventos_pend=queue_length(c->cola_eventos);
        send(socket_con, &n_eventos_pend, sizeof(n_eventos_pend), MSG_WAITALL);
    }
    else if(selector=='G'){
        get(socket_con, c);
    }
    else if(selector=='N'){
        int error;
        tema *t = map_get(mapa_temas, (const void*)buf, &error);
        if(error==0){ 
            int size=set_size(t->set_suscriptores);
            send(socket_con, &size, sizeof(size),MSG_WAITALL);
        }
        else{ 
            send(socket_con, &error, sizeof(error),MSG_WAITALL);
        }
    }
    
}

void check_dbl_msg(char * oper, char * tema, char* evento, uint32_t *tam_evento, int socket_con, cliente *c){
    char selector=oper[0];
    if(selector=='P'){
        int res = publicar(tema,evento, tam_evento);
        send(socket_con, &res, sizeof(res), MSG_WAITALL);

    }
}

void *servicio(void *arg){
        int socket_con;
        socket_con=(long) arg;
        struct cabecera cab;
        printf("Nuevo cliente\n");
        UUID_t uuid_cliente;
        recv(socket_con, uuid_cliente, sizeof(uuid_cliente), MSG_WAITALL);
        cliente* c=nuevo_cliente(uuid_cliente);
        int conf = 0;
        send(socket_con, &conf, sizeof(conf), MSG_WAITALL);
        while(!fcntl(socket_con,F_GETFD)){
        recv(socket_con,&cab,sizeof(cab),MSG_WAITALL);
        int tam1=ntohl(cab.long1);
        int tam2=ntohl(cab.long2);
        int tam3=ntohl(cab.long3);
        char * oper = malloc(tam1+1);
        char * dato1 = NULL;
        char * dato2 = NULL;
        if (tam2 > 0) dato1 = malloc(tam2+1);
        if (tam3 > 0) dato2 = malloc(tam3+1);
        recv(socket_con, oper, tam1, MSG_WAITALL);
            if (tam1>0){
                oper[tam1]='\0';
                if(dato2==NULL){
                    if(dato1==NULL){
                        check_msg(oper, dato1,socket_con,c);
                    }
                    else{
                        recv(socket_con, dato1, tam2, MSG_WAITALL);
                        dato1[tam2]='\0';
                        check_msg(oper,dato1,socket_con,c);
                    }
                }
                else{
                    recv(socket_con, dato1, tam2, MSG_WAITALL);
                    dato1[tam2]='\0';
                    recv(socket_con, dato2, tam3, MSG_WAITALL);
                    dato2[tam3]='\0';
                    check_dbl_msg(oper,dato1,dato2,tam3,socket_con,c);

                }

            }
            /* if(oper[tam1-1]!=0){    
                oper[tam1]='\0';
                if (tam2!=0){ 
                    char * dato2 = malloc(tam2+1);
                    recv(socket_con, dato2, tam2, MSG_WAITALL);
                    dato2[tam2]='\0';
                    check_dbl_msg(oper,dato2,tam2,socket_con,c);
                    }
                else{ 
                    check_msg(oper, socket_con, c);
                }
            } */     
        }
        printf("Cliente desconectado\n");
        close(socket_con);
	return NULL;
}
int main(int argc, char *argv[]) {
    int server_socket, socket_conection;
    unsigned int tam_dir;
    struct sockaddr_in dir, dir_cliente;
    int opcion=1;

    mapa_cliente=map_create(key_string, 1);
    mapa_temas=map_create(key_string,1);

    FILE *fich;
    char *buf;

    
    if (argc!=3) {
        fprintf(stderr, "Uso: %s puerto\n", argv[0]);
        return 1;
    }

    fich = fopen(argv[2], "r");
    int n;
    int i=1;
    while((n=fscanf(fich,"%ms", &buf))>0){
        char * id_tema=buf;
        nuevo_tema(id_tema);
        i++;
    }

    if ((server_socket=socket(PF_INET, SOCK_STREAM, IPPROTO_TCP)) < 0) {
        perror("error creando socket");
        return 1;
    }
    /* Para reutilizar puerto inmediatamente */
    if (setsockopt(server_socket, SOL_SOCKET, SO_REUSEADDR, &opcion, sizeof(opcion))<0){
        perror("error en setsockopt");
        return 1;
    }
    dir.sin_addr.s_addr=INADDR_ANY;
    dir.sin_port=htons(atoi(argv[1]));
    dir.sin_family=PF_INET;
    if (bind(server_socket, (struct sockaddr *)&dir, sizeof(dir)) < 0) {
        perror("error en bind");
        close(server_socket);
        return 1;
    }
    if (listen(server_socket, 5) < 0) {
        perror("error en listen");
        close(server_socket);
        return 1;
    }
    pthread_t thid;
    pthread_attr_t atrib_th;
    pthread_attr_init(&atrib_th); // evita pthread_join
    pthread_attr_setdetachstate(&atrib_th, PTHREAD_CREATE_DETACHED);
    while(1) {
        tam_dir=sizeof(dir_cliente);
        if ((socket_conection=accept(server_socket, (struct sockaddr *)&dir_cliente, &tam_dir))<0){
            perror("error en accept");
            close(server_socket);
            return 1;
        }
        else
	        pthread_create(&thid, &atrib_th, servicio, (void *)(long)socket_conection);
    }
    close(server_socket);
    return 0;
}
