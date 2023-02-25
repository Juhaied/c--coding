#include <iostream>

using namespace std;
int checkPrime(int n);
int main()
{
   cout<< "Enter two positive integers : "<<endl;
   int n1,n2;
   cin>>n1>>n2;
   bool flag;

   cout<< "Prime numbers between "<<n1 << " and "<<n2 << " are "<<endl;

   for(int i = n1 + 1;i<n2;i++){
    flag = checkPrime(i);

    if(flag){
        cout<<i<< " ";
    }
   }
}
int checkPrime(int n)
{
    bool flag = true;

    for(int j = 2;j<=n/2;j++){
        if(n % j == 0){
            flag = false;
            break;
        }
    }
    return flag;
}
