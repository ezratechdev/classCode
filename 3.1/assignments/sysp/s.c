#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
#include <string.h>

#define MAX_LINE 80

int main(void)
{
    char args[MAX_LINE/2 + 1]; /* command line arguments */
    int should_run = 1;         /* flag to determine when to exit program */

    while (should_run) {
        printf("osh> ");
        fflush(stdout);

        /**
         * After reading user input, the steps are:
         * (1) fork a child process
         * (2) the child process will invoke execvp()
         * (3) if command included &, parent will not invoke wait()
         **/
    }

    return 0;
}