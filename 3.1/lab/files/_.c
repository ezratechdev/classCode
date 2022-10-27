#include <stdio.h>
#include <string.h>

// there is no hoisting in c
// functions have to be top level

/* FUNCTIONS
*/

/*
fopen() -> takes in two arguments : the file path and the operation
*/

/*
fclose() -> takes in one argument : the file path
*/

/*
fgets() -> takes in three arguments : the string variable , the length of string , the file path
*/
void read_file_func(FILE *text_file){
    char data[1000];

    text_file = fopen("test.txt" , "r");

    if(text_file == NULL){
        printf("Unable to fetch file contents \n");
    }
    else{
        printf("File is now open \n");
        while( fgets(data , 1000 , text_file)){
            printf("%s \n" , data);
        }
        fclose(text_file);
        printf("File has been read and closed \n");
    }
}

void write_to_file(FILE *text_file){

    char data[1000];

    text_file = fopen("test.txt" , "w");
    char string_to_write[1000];
    printf("Input string to write to file\n");
    scanf("%s" , string_to_write);
    if(!(strlen(string_to_write) > 0)){
        printf("Cannot write null data to the file\n");
    }else{
        fputs(string_to_write , text_file );
        fputs("\n" ,text_file);
        printf("File has been written");
        // read_file_func(text_file);
    }
    fclose(text_file);
}

void append_to_file(FILE *text_file){
    char data[1000];

    text_file = fopen("test.txt" , "a");
    char string_to_write[1000];
    printf("Input string to append to file\n");
    scanf("%s" , string_to_write);
    if(!(strlen(string_to_write) > 0)){
        printf("Cannot append null data to the file\n");
    }else{
        fputs(string_to_write , text_file );
        fputs("\n" ,text_file);
        printf("File has been updated");
    }
    fclose(text_file);
}
void delete_file(FILE *text_file){
    // 
}



void main(){
    FILE *test_file_pointer;
    int options;
    printf("Choose an option to perform\n1:Read\n2:Write\n3:Append\n");
    scanf("%d",&options);
    if(options == 1){
        read_file_func(test_file_pointer);
        // read file content
    } else if( options == 2){
        write_to_file(test_file_pointer);
        // write content to file
    } else if(options == 3){
        // append data to a file
        append_to_file(test_file_pointer);
    }
}


