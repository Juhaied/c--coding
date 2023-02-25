#include <iostream>
#include <cmath>
using namespace std;

int main()
{
    cout<<" Enter a,b,c : ";
    int a,b,c;

    cin>>a>>b>>c;

    double dis = b * b - 4 * a * c;

    double r1,r2;
    if(dis>0){

        double x = pow(dis,0.5);

        r1 = (-b + x)/(2 * a);

        r2 = (-b - x)/(2 * a);

        cout<<r1<< " , "<<r2;
    }
    else if( dis == 0){
        r1 = -b/ 2 * a;
        cout<<r1;
    }
    else{
        cout<<" The equation has no real roots";
    }
}
