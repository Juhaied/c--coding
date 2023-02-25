#include <iostream>
#include <cmath>
using namespace std;


int power(double a, int b)
{

int res = 1;
   for(int i = 1; i<=b ;i++){
    res = res * a ;
   }
   return res;
}
void print_pow(double a, int b)
{
    double myPower = power(a,b);

    cout<< a << " raised to power " << b << " is = " <<myPower<<endl;
}
int main()
{
    double n1;
    int n2;
   cout<< " Enter the number  & the power : ";

   cin>>n1>>n2;

print_pow(n1, n2);
print_pow(4,3);
}
