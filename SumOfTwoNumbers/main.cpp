#include <iostream>

using namespace std;

int sum(int a, int b);
int main()
{

   int n1,n2,s;

   cout<< " Enter 1st number : "<<endl;

   cin>>n1;

   cout<< " Enter 2nd number : "<<endl;

   cin>>n2;

   s=sum(n1,n2);

   cout<< " The sum is  = "<<s;
}
int sum(int a, int b)
{
    return(a+b);
}
