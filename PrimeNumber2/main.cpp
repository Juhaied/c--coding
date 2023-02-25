#include <iostream>

using namespace std;

int main()
{
    cout << " Enter a number : " ;

    int num;

    cin >>num;


    for(int i = 2;i<=num/2 ;i++){
        if(num % i == 0){
            cout<<num <<" is not aprime number ";
        }
        else{
            cout<<num << " is a prime number ";
        }
    }
}
