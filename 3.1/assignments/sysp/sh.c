#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>
#include <sys/wait.h>
#define MAX_LINE_LEN 100

int main() {

while (1) {
printf("My Shell>> ");
char input[MAX_LINE_LEN];
fgets(input, MAX_LINE_LEN, stdin);

    // Parse command and arguments
    char *command = strtok(input, " \n");
    char *args[MAX_LINE_LEN];
    args[0] = command;
    int i = 1;

    while ((args[i] = strtok(NULL, " \n")) != NULL) {
        i++;
    }
    // Check for exit command
    if (strcmp(command, "exit") == 0) {
        exit(0);
    }
    pid_t pid = fork();
    if (pid == 0) {
        // Child process
        execvp(command, args);
        perror("error ");
        exit(1);
    } else if (pid > 0) {
        // Parent process
        wait(NULL);

    } else {
        // Error
        perror("fork");
    }
}

return 0;
}