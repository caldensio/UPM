#include <stdio.h>
#include <stdlib.h>
#include <string.h> 
#include "auxiliar.h"

int procesar_ficheros(char **, char *);
int entrada_estandar(char *);
void ayuda();

int main(int argc, char *argv[]){
    argv0 = "bocabajo";
    char lines[2049];      // +1 por ultimo null
    if(argc < 2){
        if(entrada_estandar(lines)){     // Devuelve algo distinto a 0
            exit(1);
        }
    }
    else if(argc==2 && (!strcmp(argv[1], "-h") || !strcmp(argv[1], "--help"))){
        ayuda();
    }
    if(procesar_ficheros(argv, lines)){
        exit(2);
    }
}

int procesar_ficheros(char **files, char lines[]){
    int i = 0;
    int args = 1;
    char **new;
    new = (char **)malloc(sizeof(char *));
    while(files[args]){
        FILE *p;
        if((p = fopen(files[args], "r"))){
            while(fgets(lines, 2049, p)){
                i++;
                new = (char **)realloc(new, (sizeof(char *))*(i+1));
                if(new){
                    new[i] = strdup(lines);
                } else {
                    Error(EX_OSERR, "No se pudo ubicar la memoria dinámica necesaria.");
                }
            }
            fclose(p);
            args++;
        }
        else{
            Error(EX_NOINPUT, "El fichero \"%s\" no puede ser leido.", files[args]);
        }
    }
    while(i >= 1){
        fprintf(stdout, "%s", new[i]);
        if(new[i][strlen(new[i])-1] != '\n'){
            fprintf(stdout, "\n");
        }
        i--;
    }
    free(new);
    exit(0);
}

int entrada_estandar(char lines[]){
    int i = 0;
    char **new;
    new = (char **)malloc(sizeof(char *));
    while(fgets(lines, 2049, stdin)){
        i++;
        new = (char **)realloc(new, (sizeof(char *))*(i+1));
        if(new){
            new[i] = strdup(lines);
        } else {
            Error(EX_OSERR, "No se pudo ubicar la memoria dinámica necesaria.");
        }
    }
    while(i >= 1){
        fprintf(stdout, "%s", new[i]);
        i--;
    }
    free(new);
    return 0;
}

void ayuda(){
    fputs("bocabajo: Uso: bocabajo [ fichero... ]\n", stdout);
    fputs("bocabajo: Invierte el orden de las lı́neas de los ficheros (o de la entrada).\n", stdout);
    exit(0);
}
