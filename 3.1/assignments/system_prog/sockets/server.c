#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <netinet/in.h>
#include <sys/socket.h>
#include <unistd.h>


int main(int argc, char const *argv[])
{
  const int port = 3400;
  int server_intance, new_socket, value_read;
  struct sockaddr_in address;
  int opt = 1;
  int addrlen = sizeof(address);
  char buffer[1024] = {0};
  char *hello = "Hello from the server :)";

  // Creating socket file
  if ((server_intance = socket(AF_INET, SOCK_STREAM, 0)) < 0)
  {
    perror("socket failed");
    exit(EXIT_FAILURE);
  }

  // Forcefully attaching socket to the port 3400
  if (setsockopt(server_intance, SOL_SOCKET,
                 SO_REUSEADDR | SO_REUSEPORT, &opt,
                 sizeof(opt)))
  {
    perror("setsockopt");
    exit(EXIT_FAILURE);
  }
  address.sin_family = AF_INET;
  address.sin_addr.s_addr = INADDR_ANY;
  address.sin_port = htons(port);

  // Forcefully attaching socket to the port 3400
  if (bind(server_intance, (struct sockaddr *)&address,
           sizeof(address)) < 0)
  {
    perror("bind failed");
    exit(EXIT_FAILURE);
  }
  if (listen(server_intance, 3) < 0)
  {
    perror("listen");
    exit(EXIT_FAILURE);
  }
  if ((new_socket = accept(server_intance, (struct sockaddr *)&address,
                           (socklen_t *)&addrlen)) < 0)
  {
    perror("accept");
    exit(EXIT_FAILURE);
  }
  value_read = read(new_socket, buffer, 1024);
  printf("%s\n", buffer);
  send(new_socket, hello, strlen(hello), 0);
  printf("Hello message sent\n");

  // closing the connected socket
  close(new_socket);
  // closing the listening socket
  shutdown(server_intance, SHUT_RDWR);

  // return an integer value as the function is of type integer
  return 5;
}
