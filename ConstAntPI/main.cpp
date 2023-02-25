#include <iostream>

using namespace std;

int main()
{
    const double PI = 3.1416;

    double radius,area;

    cout<< " Enter a radius : ";
    cin>>radius;

    area = PI *radius *radius ;

    cout << " The area of radius " << radius << " is " << area;
}
