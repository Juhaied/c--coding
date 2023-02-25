#include <iostream>

using namespace std;

int main()
{
    cout << " Enter a three digit number : ";

    int num;
    cin>>num;
    int sum = 0;

    while(num != 0){
        sum = sum + (num % 10);

        num = num / 10;
    }
    cout<<sum;
}
