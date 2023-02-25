#include <iostream>

using namespace std;

int main()
{
   enum season{summer, winter, fall, spring};

   season now = spring;

   switch(now){

   case summer:
       cout<< "Summer"<<endl;
       break;

   case winter:
       cout<< "Winter";
       break;
   case spring:
       cout<< " Spring ";
       break;
   }
}
