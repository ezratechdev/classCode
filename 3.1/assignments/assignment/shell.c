#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <unistd.h>
#include <sys/wait.h>

char *in_built_string[] = {
    "help",
    "cd",
    "pwd",
    "history",
    "!!"
    "exit",
};

int number_build_in = sizeof(in_built_string) / sizeof(char *);

int my_cd(char **args) {
    chdir( args[1] );
    
    return 1;
}

int my_exit() {
    return 0;
}

int my_help() {
    int i = 0;
    
    printf("\n");
    printf("This is our custom shell\n");
    printf("The shell commands are defined internally.\n");
    printf("\n");
    
    for (i=0; i < number_build_in; i++) {
        printf("%s\n",in_built_string[i]);
    }
    
    printf("\n");
    
    return 1;
}

int my_pwd() {
    char cwd[1024];
    
    if (getcwd(cwd, sizeof(cwd)) != NULL){
        fprintf(stdout, "%s\n", cwd);
    }
    else {
        printf("getcwd() error!\n");
    }
    
    return 1;
}

int my_history(char **history, int count) {
    int i;
    
    if(count == 1) {
        printf("history is empty!\n");
        return 1;
    }
    
    for (i=0; i < count-1; i++) {
        printf("%s\n",history[i]);
    }
    
    return 1;
}

int my_exclamation(char **history, int count, char **args) {
    
    if (count == 0) {
        printf("no previous command!\n");
        return 1;
    } else {
        if (strcmp(history[count-1], in_built_string[0]) == 0) {
            my_cd(args);
        }
        if (strcmp(history[count-1], in_built_string[1]) == 0) {
            my_help();
        }
        if (strcmp(history[count-1], in_built_string[2]) == 0) {
            my_exit();
        }
        if (strcmp(history[count-1], in_built_string[3]) == 0) {
            my_pwd();
        }
        if (strcmp(history[count-1], in_built_string[4]) == 0) {
            my_history(history, count);
        }
    }
    return 1;
}

int check_built_in_command(char **args) {
    int i;
    
    if ( args[0] == NULL ) {
        return 0;
    }
    
    for (i=0; i < number_build_in; i++) {
        if (strcmp(args[0], in_built_string[i]) == 0) {
            return 1;
        }
    }
    
    return 0;
}

int execute_built_in_command(char **args, char **history, int count) {
    int flag;
    
    if (strcmp(args[0], in_built_string[0]) == 0) {
        flag = my_cd(args);
    }
    
    if (strcmp(args[0], in_built_string[1]) == 0) {
        flag = my_help();
    }
    
    if (strcmp(args[0], in_built_string[2]) == 0) {
        flag = my_exit();
    }
    
    if (strcmp(args[0], in_built_string[3]) == 0) {
        flag = my_pwd();
    }
    
    if (strcmp(args[0], in_built_string[4]) == 0) {
        flag = my_history(history, count);
    }
    
    if (strcmp(args[0], in_built_string[5]) == 0) {
        flag = my_exclamation(history, count, args);
    }
    
    return flag;
}
char **command_parser(char *my_line) {
    int buffer_size = 64;
    int i = 0;
    char *arg;
    char **args = malloc(buffer_size * sizeof(char*));
    
    arg = strtok(my_line, " \t\r\n\a");
    while (arg != NULL) {
        args[i] = arg;
        i++;
        arg = strtok(NULL, " \t\r\n\a");
    }
    
    args[i] = NULL;
    
    return args;
}
char *read_from_commandLine(void) {
    int bufsize = 1024;
    char *buffer = malloc(sizeof(char) * bufsize);
    int c;
    int i = 0;
    
    while ( c != '\n' ) {
        c = getchar();
        buffer[i] = c;
        i++;
    }
    
    return buffer;
}
void printPrompt() {
    printf(">> ");
}
int main(int argc, char **arg) {
    char *my_line;
    char **my_command;
    int bufsize = 1024;
    char **history = malloc(sizeof(char) * bufsize);
    int child_pid;
    int count = 0;
    int flag = 1;
    int status; 
    while(flag) {
        printPrompt();
        my_line = read_from_commandLine();
        my_command = command_parser(my_line);
        
        if (my_command[0] != NULL) {
            if ( check_built_in_command(my_command) ) {
                if (my_command[0][0] != '!') {
                    history[count] = my_command[0];
                    count++;
                }
                flag = execute_built_in_command(my_command, history, count);
            }
            else {
                history[count] = my_command[0];
                count++;
                child_pid = fork();
                if (child_pid == 0) {
                    execvp(my_command[0], my_command);
                }
                else {
                    do {
                        waitpid(child_pid, &status, WUNTRACED);
                    } while (!WIFEXITED(status) && !WIFSIGNALED(status));
                }
            }
        }
    }   
    return 0;
}