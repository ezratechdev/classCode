#include <stdio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <stdlib.h>
#include <unistd.h>
#include <arpa/inet.h>

void main(int argc, char* argv[])
{
  int sock = 0;
  int port = 0;
  struct sockaddr_in servaddr;
  sock = socket(AF_INET, SOCK_STREAM, 0);
  int status = 0;
  char buffer[256] = "";
  if (sock == -1)
  {
    printf("could not establish connection\n");
    exit(1);
  }

  port = 3500;
  servaddr.sin_family = AF_INET;
  servaddr.sin_addr.s_addr = inet_addr(argv[1]);
  servaddr.sin_port = htons(port);
  status = connect(sock, (struct sockaddr*) &servaddr, sizeof(servaddr));
  if (status == 0)
    printf("connection is established successfully\n");
  else
  {
    printf("could not run the app\n");
    exit(1);
  }

  status = read(sock, buffer, sizeof(buffer));
  if (status > 0)
    printf("%d: %s", status, buffer);

  close(sock);

}