#include <stdio.h>
#include <stdlib.h>
#include <unistd.h>
int main()
{
    int file_data[2], n;
    char buffer_data[100];
    pid_t p;
    pipe(file_data);
    p = fork();
    if (p > 0) // This is the parent process
    {
        close(file_data[0]);
        printf("Passing the value from the parent to the child\n");
        write(file_data[1], "Hello\n", 6);
        wait();
    }
    else // This is the child process
    {
        close(file_data[1]);
        n = read(file_data[0], buffer_data, 100);
        write(1, buffer_data, n);
    }
}