#include <iostream>

using namespace std;

int main()
{
   cout<< "Enter a number : "<<endl;
   int number,sum = 0,rem = 0, val;

   cin>>number;

   val = number;

   while(number != 0){
    rem = number % 10;
    sum = sum + (rem *rem *rem);
    number = number/10;
   }

   if(val == sum){
    cout<<val << " is a armstrong number "<<endl;
   }
   else{
    cout<< val<< " is not a armstrong number"<<endl;
   }
}
