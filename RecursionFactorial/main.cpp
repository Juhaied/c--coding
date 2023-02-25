#include <iostream>

using namespace std;
int fact(int n);
int main()
{
   cout<< "Enter a number : ";
   int n;
   cin>>n;

   int f = fact(n);
   cout<< "Factorial is = "<<f;
}

int fact(int n)
{
    if(n==0||n == 1){
        return 1;
    }
    else{
        return n * fact(n-1);
        }
}
