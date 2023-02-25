#include <stdio.h>
#include <stdlib.h>

int main()
{
   int number ;
   printf("Enter a number : ");
   scanf("%d",&number);
   if(number % 2 == 1){
    printf("%d is odd ",number);
   }
   else{
    printf("%d is even ",number);
   }
}
