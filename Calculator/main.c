#include <stdio.h>
#include <stdlib.h>

int main()
{
    int a ,b,value;
    char sign;

    printf("Enter two number : ");
    scanf("%d %d ",&a, &b);


    value = a + b;
sign = '+';
    printf("\n %d %c %d = %d\n",a,sign,b,value);

     value = a - b;
sign = '-';
    printf("%d %c %d = %d",a,sign,b,value);
}
