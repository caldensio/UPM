#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include "edsu.h"
#include "comun.h"
#include <arpa/inet.h>
#include <string.h>
#include <sys/socket.h>
#include <netinet/in.h>
#include <netdb.h>
#include <sys/uio.h>


int client_socket;
UUID_t uuid;
struct cabecera{
    int long1;
    int long2;
    int long3;
    int long4;
};


// se ejecuta antes que el main de la aplicación
__attribute__((constructor)) void inicio(void){
    if (begin_clnt()<0) {
        fprintf(stderr, "Error al iniciarse aplicación\n");
        // terminamos con error la aplicación antes de que se inicie
	// en el resto de la biblioteca solo usaremos return
        _exit(1);
    }
}

// se ejecuta después del exit de la aplicación
__attribute__((destructor)) void fin(void){
    if (end_clnt()<0) {
        fprintf(stderr, "Error al terminar la aplicación\n");
        // terminamos con error la aplicación
	// en el resto de la biblioteca solo usaremos return
        _exit(1);
    }
}


int crear_y_conectar(){
    if((client_socket = socket(PF_INET, SOCK_STREAM, IPPROTO_TCP)) < 0){
        perror("Error al crear el socket\n");
        return -1;
    }
    char * port = getenv("BROKER_PORT");
    char * maquina = getenv("BROKER_HOST");
    struct addrinfo* serv_addr;
    if (getaddrinfo(maquina, port, NULL, &serv_addr)!=0) {
        printf("Invalid address. Address not supported \n");
        close(client_socket);
        return -1;
    }
    if(connect(client_socket, serv_addr->ai_addr, serv_addr->ai_addrlen) < 0){
        close(client_socket);
        perror("Error al crear la conexion, revise la IP designada\n");
        return -1;
    }
    return client_socket;
}

// operaciones que implementan la funcionalidad del proyecto
int begin_clnt(void){

    client_socket = crear_y_conectar();

    if(strlen(uuid)==0){ 
        generate_UUID(uuid);
    }
    int escrito;
    struct cabecera cab;
    char * oper = "R"; 
    cab.long1=htonl(strlen(oper));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=oper;
    iov[1].iov_len=strlen(oper);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    int res;
    if(recv(client_socket, &res, sizeof(res), MSG_WAITALL)>0)
        return res;
    printf("Se ha creado la conexión");
    //close(client_socket);
    return 0;
}
int end_clnt(void){

    //client_socket = crear_y_conectar();

    char *str= "B";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    close(client_socket);
    return res;
}
int subscribe(const char *tema){

    //client_socket=crear_y_conectar();

    int res;
    int escrito;
    struct cabecera cab;

    char * oper = "S"; 
    cab.long1=htonl(strlen(oper));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(strlen(tema));
    cab.long4=htonl(0);
    struct iovec iov[4];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=oper;
    iov[1].iov_len=strlen(oper);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    iov[3].iov_base=tema;
    iov[3].iov_len=strlen(tema);

    if((escrito=writev(client_socket,iov,4))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int unsubscribe(const char *tema){

    //client_socket = crear_y_conectar();

    int res;
    int escrito;
    struct cabecera cab;
    char * oper = "U";
    cab.long1=htonl(strlen(oper));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(strlen(tema));
    cab.long4=htonl(0);
    struct iovec iov[4];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=oper;
    iov[1].iov_len=strlen(oper);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    iov[3].iov_base=tema;
    iov[3].iov_len=strlen(tema);
    if((escrito=writev(client_socket,iov,4))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int publish(const char *tema, const void *evento, uint32_t tam_evento){

    //client_socket = crear_y_conectar();

    int escrito;
    struct cabecera cab;
    char * oper = "P";
    cab.long1=htonl(strlen(oper));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(strlen(tema));
    cab.long4=htonl(tam_evento);

    struct iovec iov[5];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=oper;
    iov[1].iov_len=strlen(oper);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    iov[3].iov_base=tema;
    iov[3].iov_len=strlen(tema);
    iov[4].iov_base=evento;
    iov[4].iov_len=tam_evento;
    if((escrito=writev(client_socket,iov,5))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    int res;
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int get(char **tema, void **evento, uint32_t *tam_evento){

    //client_socket = crear_y_conectar();

    char * str = "G";
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
	recv(client_socket, &cab, sizeof(cab), MSG_WAITALL);
	int tam1=ntohl(cab.long1);
	int tam2=ntohl(cab.long2);
	char *dato1 = malloc(tam1+1);
	char *dato2 = malloc(tam2+1);
	recv(client_socket, dato1, tam1, MSG_WAITALL);
	recv(client_socket, dato2, tam2, MSG_WAITALL);
	dato1[tam1]='\0';
	dato2[tam2]='\0';
    if(strcmp(dato1,"0\0")==0){
        return -1;
    }
    tema[0] = dato1;
    evento[0] = dato2;
    tam_evento[0] = tam2;
    
    //close(client_socket);
    return 0;
}

// operaciones que facilitan la depuración y la evaluación
int topics(){ // cuántos temas existen en el sistema
    
    //client_socket = crear_y_conectar();

    char *str= "T";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int clients(){ // cuántos clientes existen en el sistema
    
    //client_socket = crear_y_conectar();

    char *str= "C";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int subscribers(const char *tema){ // cuántos subscriptores tiene este tema
    
    //client_socket = crear_y_conectar();

    int res;
    int escrito;
    struct cabecera cab;

    char * oper = "N";
    cab.long1=htonl(strlen(oper));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(strlen(tema));
    cab.long4=htonl(0);
    struct iovec iov[4];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=oper;
    iov[1].iov_len=strlen(oper);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    iov[3].iov_base=tema;
    iov[3].iov_len=strlen(tema);
    
    if((escrito=writev(client_socket,iov,4))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}
int events() { // nº eventos pendientes de recoger por este cliente
    
    //client_socket = crear_y_conectar();

    char *str= "E";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(strlen(uuid));
    cab.long3=htonl(0);
    cab.long4=htonl(0);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=uuid;
    iov[2].iov_len=strlen(uuid);
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    //close(client_socket);
    return res;
}


