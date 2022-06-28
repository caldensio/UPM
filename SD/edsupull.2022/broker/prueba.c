#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <unistd.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>


int main(int argc, char*argv[]){
    char * oper = "S";
    char selector = oper[0];
    if (selector == 'S')
        printf("char normal");
    else
        printf("string");
}