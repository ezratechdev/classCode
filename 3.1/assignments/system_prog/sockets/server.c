#include <stdio.h>
#include <sys/types.h>
#include <sys/socket.h>
#include <netdb.h>
#include <string.h>

const char message[] = "hello, world\n";

void main()
{
  int sock = 0;
  int port = 0;
  sock = socket(AF_INET, SOCK_STREAM, 0);

  if (sock == -1)
    fprintf(stderr, "failed\n");
  else
    printf("connection is establisshed\n");

  struct sockaddr_in server;
  server.sin_family = AF_INET;
  server.sin_addr.s_addr = htonl(INADDR_ANY );
  server.sin_port = htons(3500);

  int status = bind(sock, (struct sockaddr*) &server, sizeof(server));
  if (status == 0)
    printf("connection completed\n");
  else
    printf("problem is encountered\n");

  status = listen(sock, 5);
  if (status == 0)
    printf("app is ready to work\n");
  else
  {
    printf("connection is failed\n");
    return 0;
  }

  while (1)
  {
    struct sockaddr_in client = { 0 };
    int sclient = 0;
    // int len = sizeof(client);
    socklen_t len = sizeof client;
    int childSocket = accept(sock, (struct sockaddr*) &client, &len);
    if (childSocket == -1)
    {
      printf("cannot accept connection\n");
      close(sock);
      break;
    }

    write(childSocket, message, strlen(message));

    close(childSocket);
  }

}