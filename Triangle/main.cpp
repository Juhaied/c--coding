#include <iostream>

using namespace std;

int main()
{
    cout << " Enter three sides of triangle : " << endl;
    int a,b,c;

    cin>>a>>b>>c;

    if(a==b && a == c && b == c){
        cout<< " Equilateral triangle ";
    }
    else if(a== b || a == c || b == c){
        cout << " Isosceles Triangle  ";
    }
    else{
        cout << " Scalene triangle ";
    }
}
