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
struct cabecera{
    int long1;
    int long2;
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

// operaciones que implementan la funcionalidad del proyecto
int begin_clnt(void){
    if((client_socket = socket(PF_INET, SOCK_STREAM, IPPROTO_TCP)) < 0){
        perror("Error al crear el socket\n");
        return -1;
    }
    char * port = getenv("BROKER_PORT");
    char * maquina = getenv("BROKER_HOST");
    printf("Puerto: %s\n", port);
    printf("Maquina: %s\n", maquina);
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
    UUID_t uuid_cliente;
    generate_UUID(uuid_cliente);
    send(client_socket, uuid_cliente, sizeof(uuid_cliente), 0);
    int res;
    if(recv(client_socket, &res, sizeof(res), MSG_WAITALL)>0)
        return res;
    printf("Se ha creado la conexión");
    return 0;
}
int end_clnt(void){
    char *str= "B";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return 1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    printf("RECIBIDO");
    //close(client_socket);
    return res;
}
int subscribe(const char *tema){
    int res;
    int escrito;
    struct cabecera cab;
    char str[strlen(tema)+1];
    for(int i=0; i<strlen(tema)+1; i++){
        if(i==0)str[i]='S';
        else str[i]=tema[i-1];
    }   
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return 1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int unsubscribe(const char *tema){
    int res;
    int escrito;
    struct cabecera cab;
    char str[strlen(tema)+1];
    for(int i=0; i<strlen(tema)+1; i++){
        if(i==0)str[i]='U';
        else str[i]=tema[i-1];
    }
    printf("%s\n", str);
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return 1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int publish(const char *tema, const void *evento, uint32_t tam_evento){
    int escrito;
    struct cabecera cab;
    char str[strlen(tema)+1];
    for(int i=0; i<strlen(tema)+1; i++){
        if(i==0)str[i]='P';
        else str[i]=tema[i-1];
    }
    printf("%s\n", str);
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(tam_evento);
    printf("tamaño antes de enviar: %d\n", tam_evento);
    struct iovec iov[3];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    iov[2].iov_base=evento;
    iov[2].iov_len=tam_evento;
    if((escrito=writev(client_socket,iov,3))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return 1;
    }
    int res;
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int get(char **tema, void **evento, uint32_t *tam_evento){
    char * str = "G";
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    printf("Enviado\n");
	recv(client_socket, &cab, sizeof(cab), MSG_WAITALL);
	int tam1=ntohl(cab.long1);
    printf("tamaño1 CAB: %d\n", cab.long1);
	int tam2=ntohl(cab.long2);
	char *dato1 = malloc(tam1+1);
	char *dato2 = malloc(tam2+1);
	recv(client_socket, dato1, tam1, MSG_WAITALL);
	recv(client_socket, dato2, tam2, MSG_WAITALL);
	dato1[tam1]='\0';
	dato2[tam2]='\0';
    if(strcmp(dato1,"0\0")==0){
        printf("No hay ningun evento pendiente");
        return -1;
    }
    printf("Dato1: %s\n", dato1);
    printf("Tam1: %d\n", tam1);
    printf("Dato2: %s\n", dato2);
    printf("Tam2: %d\n", tam2);
    tema[0] = dato1;
    evento[0] = dato2;
    tam_evento[0] = tam2;
    printf("Tema: %s\n", tema[0]);
    printf("Tam evento: %d\n", tam_evento[0]);
    printf("Evento: %s\n", (char*)evento[0]);
    return 0;
}

// operaciones que facilitan la depuración y la evaluación
int topics(){ // cuántos temas existen en el sistema
    char *str= "T";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int clients(){ // cuántos clientes existen en el sistema
    char *str= "C";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int subscribers(const char *tema){ // cuántos subscriptores tiene este tema
    int res;
    int escrito;
    struct cabecera cab;
    char str[strlen(tema)+1];
    for(int i=0; i<strlen(tema)+1; i++){
        if(i==0)str[i]='N';
        else str[i]=tema[i-1];
    }
    printf("%s\n", str);
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}
int events() { // nº eventos pendientes de recoger por este cliente
    char *str= "E";
    int res=0;
    int escrito;
    struct cabecera cab;
    cab.long1=htonl(strlen(str));
    cab.long2=htonl(0);
    struct iovec iov[2];
    iov[0].iov_base=&cab;
    iov[0].iov_len=sizeof(cab);
    iov[1].iov_base=str;
    iov[1].iov_len=strlen(str);
    if((escrito=writev(client_socket,iov,2))<0){
        perror("Error en el writev\n");
        close(client_socket);
        return -1;
    }
    recv(client_socket, &res, sizeof(res), MSG_WAITALL);
    return res;
}


