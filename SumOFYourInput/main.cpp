#include <iostream>

using namespace std;

int main()
{
   cout<<"Enter how many number you want to sum : "<<endl;
   int num;
   cin>>num;

   int sum = 0;

   while(num != 0){
    sum = sum + num;

    cout<< " Enter your values,if you give 0 then taking input will be stop: "<<endl;

    cin>>num;
   }
   cout<< " sum is = "<<sum;
}
