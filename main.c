/*-
 * main.c
 * Minishell C source
 * Shows how to use "obtain_order" input interface function.
 *
 * Copyright (c) 1993-2002-2019, Francisco Rosales <frosal@fi.upm.es>
 * Todos los derechos reservados.
 *
 * Publicado bajo Licencia de Proyecto Educativo Práctico
 * <http://laurel.datsi.fi.upm.es/~ssoo/LICENCIA/LPEP>
 *
 * Queda prohibida la difusión total o parcial por cualquier
 * medio del material entregado al alumno para la realización
 * de este proyecto o de cualquier material derivado de este,
 * incluyendo la solución particular que desarrolle el alumno.
 *
 * DO NOT MODIFY ANYTHING OVER THIS LINE
 * THIS FILE IS TO BE MODIFIED
 */

#include <stddef.h>                     /* NULL */
#include <stdio.h>                      /* setbuf, printf */
#include <stdlib.h>
#include <string.h>
#include <sys/types.h>
#include <sys/stat.h>
#include <unistd.h>
#include <signal.h>

extern int obtain_order();              /* See parser.y for description */


int check_order(char ** argv){
        if(strcmp(argv[0], "cd")==0){
                return 0;
        }
        else if(strcmp(argv[0],"umask")==0){
                return 1;
        }
        else if(strcmp(argv[0], "time")==0){
                return 2;
        }
        else if(strcmp(argv[0],"read")==0){
                return 3;
        }
        else{
                return -1;
        }
}

int cd(char* path, int argc){
        if(argc>2){
                fprintf(stderr, "Uso: cd [path]\n");
                return 1;
        }
        else{
        char cwd[128];
        getcwd(cwd, 128);
        int res;
        if(path==NULL){
                res=chdir(getenv("HOME"));
        }
        else{
                if(path[0]=='/'){
						printf("compruebo primer if\n");
                        res=chdir(path);
                }
                else{
						printf("compruebo primer else\n");
                        strcat(cwd, "/");
                        strcat(cwd, path);
                        res=chdir(cwd);
                }
        }
        if (res!=0){
                        printf("El directorio o archivo especificado no existe\n");
                        return 1;
                }
        getcwd(cwd,128);
        setenv("PWD", cwd, 1);
        fprintf(stdout,"%s\n",cwd);
        return res;
        }
}

int msh_umask(mode_t mask){
        int new_mask=0666;
        return new_mask;
}

int main(void){
char ***argvv = NULL;
int argvc;
char **argv = NULL;
int argc;
char *filev[3] = {NULL, NULL, NULL};
int bg;
int ret;
pid_t ppid = getpid();

setbuf(stdout, NULL); /* Unbuffered */
setbuf(stdin, NULL);

sigset_t signals;
sigemptyset(&signals);
sigaddset(&signals, SIGINT);
sigaddset(&signals, SIGQUIT);
sigprocmask(SIG_BLOCK, &signals, NULL);

while (1)
{
	fprintf(stderr, "%s", "msh> "); /* Prompt */
	ret = obtain_order(&argvv, filev, &bg);
	if (ret == 0)
		break; /* EOF */
	if (ret == -1)
		continue;	 /* Syntax error */
	argvc = ret - 1; /* Line */
	if (argvc == 0)
		continue; /* Empty line */

	int aux_argvc = argvc;
	pid_t children_pid[aux_argvc];
	pid_t pid;
	for (argvc = 0; (argv = argvv[argvc]); argvc++)
	{
		for (argc = 0; argv[argc]; argc++){}

		int order = check_order(argv);
		switch (order)
		{
		case 0:
			if (bg == 1 || argvc < aux_argvc - 1)
			{ //CASE 0 -> CD
				pid = fork();
				children_pid[argvc] = pid;
				if (pid == 0)
				{
					execlp(cd(argv[1], argc), &cd);
					perror("Falla exec al invocar a cd");
				}
				break;
			}
			else
			{
				cd(argv[1], argc);
				break;
			}
                case 1:
                        if (bg == 1 || argvc < aux_argvc - 1)
			{ //CASE 1 -> umask
				pid = fork();
				children_pid[argvc] = pid;
				if (pid == 0)
				{
					execlp(msh_umask(argv[1]), &msh_umask);
					perror("Falla exec al invocar a umask");
				}
				break;
			}
			else
			{
				msh_umask(argv[1]);
				break;
			}
                
                case 2:
                        if (bg == 1 || argvc < aux_argvc - 1)
			{ //CASE 1 -> umask
				pid = fork();
				children_pid[argvc] = pid;
				if (pid == 0)
				{
					execlp(msh_umask(argv[1]), &msh_umask);
					perror("Falla exec al invocar a umask");
				}
				break;
			}
			else
			{
				msh_umask(argv[1]);
				break;
			}

		default:
			pid = fork();
			children_pid[argvc] = pid;
			if (pid == 0)
			{
				execvp(argv[0], argv);
				perror("fallo en el exec del mandato");
			}
			break;
		}
	}
	if (getpid() == ppid)
	{
		waitpid(children_pid[argvc - 1], NULL, 0);
	}

#if 0
/*
 *  *  * LAS LINEAS QUE A CONTINUACION SE PRESENTAN SON SOLO
 *   *   * PARA DAR UNA IDEA DE COMO UTILIZAR LAS ESTRUCTURAS
 *    *    * argvv Y filev. ESTAS LINEAS DEBERAN SER ELIMINADAS.
 *     *     */
                for (argvc = 0; (argv = argvv[argvc]); argvc++) {
                        for (argc = 0; argv[argc]; argc++)
                                printf("%s ", argv[argc]);
                        printf("\n");
                }
                if (filev[0]) printf("< %s\n", filev[0]);/* IN */
                if (filev[1]) printf("> %s\n", filev[1]);/* OUT */
                if (filev[2]) printf(">& %s\n", filev[2]);/* ERR */
                if (bg) printf("&\n");
/*
 *  *  * FIN DE LA PARTE A ELIMINAR
 *   *   */
#endif

        }
        exit(0);
        return 0;
}
