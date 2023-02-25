#include <iostream>

using namespace std;

int main()
{
    const int YEAR = 5;
    double rent = 1000;
    int year = 0;
    while(year<YEAR){
        rent = rent + (rent * (3/100.0));
        year++;
    }

    cout<<rent;
}
