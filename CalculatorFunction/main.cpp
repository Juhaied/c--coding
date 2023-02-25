#include <iostream>

using namespace std;

double summation(int a, int b);
double subtraction(int a, int b);
double multiplication(int a , int b);
double division(int a, int b);
double remainder(int a, int b);
double maxNumber( int a, int b);
int main()
{

   int n1,n2;

   cout<< " Enter number1 & number2 : ";
   cin>>n1>>n2;

   int resSum = summation(n1 , n2);
   cout<< " Sum is = "<<resSum<<endl;

   int resSub = subtraction(n1, n2);
   cout<< " Subtraction is = "<<resSub<<endl;

   int resMul = multiplication(n1, n2);

   cout<< " Multlipication is = "<<resMul<<endl;

   int resDiv = division(n1,n2);

   cout<< " Division is = "<<resDiv<<endl;

   int resRem = remainder(n1,n2);

   cout<< " Remainder is = "<<resRem<<endl;

   int resMax = maxNumber(n1, n2);

   cout<< " Max number is = "<<resMax<<endl;
}
double summation(int a, int b)
{
    return (a + b);
}
double subtraction(int a, int b)
{
    double temp;

    if(a<b){
        temp = a;
        a = b;
        b = temp;

        return ( a - b);
    }
    else{
        return (a - b);
    }
}
double multiplication(int a, int b)
{

    return (a * b);
}
double division(int a, int b)
{

    double temp;

    if(a<b){
        temp = a;
        a = b;
        b = temp;

        return (a/b);
    }
    else{
        return (a/b);
    }
}
double remainder(int a, int b)
{

     double temp;

    if(a<b){
        temp = a;
        a = b;
        b = temp;

        return (a%b);
    }
    else{
        return (a%b);
    }
}
double maxNumber(int a, int b)
{
    if(a<b){
        return b;
    }
    else{
        return a;
    }
}
