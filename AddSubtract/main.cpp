#include <iostream>
#include<string>

using namespace std;

string operation(int n1,int n2);
int main()
{
    cout<< "Enter two number : ";
    int num1,num2;
    cin>>num1>>num2;

    string oper = operation(num1,num2);
    cout<<oper;

}
string operation(int n1,int n2)
{
    if(n1 + n2 == 24){
        return "Added";
    }
    else if(n1 - n2 == 24){
        return "Subtracted";
    }
    else if(n1 * n2 == 24){
        return "Multiplied";
    }
    else if(n1/n2 == 24){
        return "Divided";
    }
    else{
        return "Invalid";
    }
}
