#include <iostream>

using namespace std;

int main()
{
    int mini;
    int sec;
    cout << " Enter seconds : ";

    cin>> sec;

    mini = sec / 60 ;
   int remsec = sec % 60 ;

    cout << sec << " second is " << mini << " minitues and " << remsec << " Seconds";
}
