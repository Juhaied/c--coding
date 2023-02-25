#include <iostream>
#include <ctime>
#include<cstdlib>
using namespace std;

int main()
{
    cout<< " Enter x and y : ";
    double x2,y2;

    cin>>x2>>y2;
    double radius = 10;
    double x1= 0 ;
    double y1= 0;
    double dis = ((x2 - x1) * (x2 - x1)) + ((y2 - y1) * (y2 - y1));

    cout<<dis;
   double distance = pow(dis,.5);

   if(radius>= distance){
    cout<< x2 << " and "<< y2 << " are in the circle ";
   }
   else{
    cout<< x2 << " and "<< y2 << " are in outside the circle ";
   }

}
