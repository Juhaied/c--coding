#include <iostream>

using namespace std;

int main()
{
    cout<< " Enter two number : ";

    int n1,n2;

    cin>>n1>>n2;

    if(n1>n2){
        if(n1 % n2 == 0){
            cout<<n1 << " is divisble by "<<n2 << " and the answer is "<<(n1/n2);
        }
        else{
            cout<<n1 << " is not divisble by "<<n2;
        }
    }
    else{
        cout<< " Fraction!!! Cant divisible ";
    }
}
