#include <stdio.h>
#include <stdlib.h>

int main()
{
   const double PI = 3.1416;

   double area,radius;
   printf(" Enter radius : ");
   scanf("%lf",&radius);

   area = radius * radius * PI;

   printf(" The area is : %lf",area);
}
