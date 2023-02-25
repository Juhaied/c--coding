#include <iostream>

using namespace std;
bool isValid(double s1,double s2,double s3);
double Perimeter(double s1, double s2, double s3);
int main()
{
    double side1,side2,side3;
    cout<< "Enter side1,side2,side3 : ";
    cin>>side1>>side2>>side3;
    bool equal = isValid(side1,side2, side3);
    cout<<equal;

    double p = Perimeter(side1,side2,side3);
    cout<< "Perimeter = "<<p;
}
bool isValid(double s1,double s2,double s3)
{
    if(s1 == s2 && s2 == s3 && s1==s3){
        return true;
    }
    else{
        return false;
    }
}
double Perimeter(double s1, double s2, double s3)
{
    bool res = isValid();

    if(res == 1){
        return (3 * s1 * s2 * s3);
    }
    else{
            cout<< "Invalid";
        return -1;
    }
}
