#include <iostream>

using namespace std;

int cubeOfDigits(int num);
void isArmstrong(int number , int sum);
int main()
{
   cout<< "Enter a number : "<<endl;

   int number;
   cin>>number;

   int sum = cubeOfDigits(number);

   isArmstrong(number, sum);

}

int cubeOfDigits(int num)
{
    int s = 0,r = 0;

    while(num != 0){
        r = num % 10;
        s = s + (r * r * r);
        num = num /10;
    }
    return s;
}
void isArmstrong(int number , int sum)
{
    if(number == sum){
        cout<< number<< " is a Armstrong number "<<endl;
    }
    else{
        cout<< number<<" is Not a strong number"<<endl;
    }
}
