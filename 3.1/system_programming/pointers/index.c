#include <stdio.h>

void main(){
    int x = 45 , *y , **z;
    y = &x;
    z = &y;
    printf("Address of x is %p \n" , y);
    printf("Address of y is %p \n" , z);
    printf("Value of y is %d \n" , x);
    printf("Value of y from y is %d \n" , *y);
    printf("Value of y from z is %d \n" , **z);
    printf("Value of y is %d" , x);
    printf("\n");
    printf("\n");
    printf("Increament x\n");
    **z  = ++**z;
    printf("Address of x is %p \n" , y);
    printf("Address of y is %p \n" , z);
    printf("Value of y is %d \n" , x);
    printf("Value of y from y is %d \n" , *y);
    printf("Value of y from z is %d \n" , **z);
    printf("Value of y is %d" , x);
}