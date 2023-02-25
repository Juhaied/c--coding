#include <iostream>

using namespace std;

int main()
{
    double tution = 10000;
    int year = 1;

    while(tution<20000){
        tution = tution * 1.07;
        year++;
    }

    cout<< "tution will be doubled after "<<year<< " years"<<endl<< " and the amount is "<<tution<<endl;
}
