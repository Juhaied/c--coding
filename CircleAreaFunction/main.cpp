#include <iostream>

using namespace std;
double area(double rad);
void print_result(double rad);
int main()
{
    cout<< "Enter radius of a circle : "<<endl;

    double radius;
    cin>>radius;
    print_result(radius);

    print_result(5);
}
double area(double rad)
{
    return rad * rad * 3.1416;
}
void print_result(double rad)
{
    double a = area(rad);

    cout<<a<<endl;
}
