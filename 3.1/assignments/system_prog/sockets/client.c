#include <string.h>
#include <stdio.h>
#include <arpa/inet.h>
#include <sys/socket.h>
#include <unistd.h>

int main(int argc, char const* argv[])
{
  const int port = 3400;
  const char *host_service = "127.0.0.1";
	int socket_sock_cn = 0, value_read, client_instance;
	struct sockaddr_in serv_addr;
	char* hello = "This is the message from the client";
	char buffer[1024] = { 0 };
	if ((socket_sock_cn = socket(AF_INET, SOCK_STREAM, 0)) < 0) {
		printf("\n Could not create the socket connection\n");
		return -1;
	}

	serv_addr.sin_family = AF_INET;
	serv_addr.sin_port = htons(port);

	// Convert IPv4 and IPv6 addresses from text to binary
	if (inet_pton(AF_INET, host_service, &serv_addr.sin_addr)
		<= 0) {
		printf(
			"\n The address format passed is not supported \n");
		return -1;
	}

	if ((client_instance
		= connect(socket_sock_cn, (struct sockaddr*)&serv_addr,
				sizeof(serv_addr)))
		< 0) {
		printf("\nConnection Failed \n");
		return -1;
	}
	send(socket_sock_cn , hello, strlen(hello), 0);
	printf("Message from the client has been sent to the server\n");
	value_read = read(socket_sock_cn, buffer, 1024);
	printf("%s\n", buffer);

	// closing the connected socket
	close(client_instance);
   // return an integer value as the function is of type integer
  return 5;
}