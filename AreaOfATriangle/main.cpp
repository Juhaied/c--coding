#include <iostream>

using namespace std;
double Area_Triangle(double h, double b);
int main()
{
   double height ,base,area;

   cout<< "Enter height and base : "<<endl;
   cin>>height>>base;

   area = Area_Triangle(height, base);

   cout<< "Area of triangle is = "<<area;
}
double Area_Triangle(double h, double b)
{
    return (h * b)/2.0;
}
