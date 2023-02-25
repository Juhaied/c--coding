#include <iostream>

using namespace std;
int Recursion_Sum(int n);
int main()
{
    cout<< "Enter a number : ";
    int num;
    cin>>num;

    int sum = Recursion_Sum(num);

    cout<< "Sum is = "<<sum;
}
int Recursion_Sum(int n)
{
    if(n == 0){
        return 0;
    }
    else{
        return n + Recursion_Sum(n-1);
    }
}
