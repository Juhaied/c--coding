#include <iostream>

using namespace std;
int factorial(int n);
void print_result(int n);
int main()
{
   int num;

   cout<< " Enter the number : ";
   cin>>num;

   print_result(num);
}
int factorial(int n)
{
    int fact = 1;

    for(int i = 1; i<=n ; i++)
        {
            fact = fact * i;
        }
    return fact;
}
void print_result(int n)
{
    int ans = factorial(n);

    cout<< " Fcatorial is = "<<ans;
}
