#include <iostream>

using namespace std;

int main()
{
   int num= 0;
   int sum = 0;

   while(num<20){


    sum = sum + num;

    if(sum>=100){
        break;
    }
    num++;
   }
   cout<< "NUmber is = "<<num<<endl<< "Sum is = "<<sum<<endl;
}
