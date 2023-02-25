#include <iostream>

using namespace std;

int main()
{
    const double PI = 3.1416;
    cout << " Enter the radius and length of a cylinder : ";
    double radius,length;

    cin>>radius>>length;

    double area = radius * radius * PI;

    cout << " The area is " << area <<endl;

    double volume = area * length ;

    cout << " the volume is "<< volume <<endl;
}
