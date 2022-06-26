#include <stdio.h>
#include <stdlib.h>
#include <stdint.h>
#include <unistd.h>
#include <sys/mman.h>
#include <sys/stat.h>
#include <fcntl.h>
#include <string.h>


int main(int argc, char*argv[]){
    char * dest = "dest";
    char * src = "src";
    char buf[strlen(dest)+strlen(src)];
    strcat(buf,dest);
    strcat(buf,src);
    printf("%s\n",buf);
    return 0;
}