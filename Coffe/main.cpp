#include <iostream>

using namespace std;
int totalCups(int coffee);


int main()
{
    cout<< "Enter how many coffee : "<<endl;
    int n;
    cin>>n;

    int total = totalCups(n);
    cout<< "Total coffee = "<<total;

}
int totalCups(int coffee)
{
    if(coffee % 6 == 0){
        int a = coffee / 6;

        return coffee + a;
    }
    else if(coffee % 6 != 0){

        int b = coffee / 6;
        return coffee  + b;
    }

}
