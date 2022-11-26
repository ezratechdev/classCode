#include <stdio.h>
// #include <stalibe.h>
struct Student
{
    char *name;
    int age;
};





void main()
{
    struct Student ezra = { "Ezra" , 20}  , *ezra_p;
    ezra_p = &ezra;
    // 

    printf("My name is %s" , ezra_p->name);
    printf("My age is %d" , ezra_p->age);
    explain();
}



