#include <iostream>

using namespace std;
int addition(int n);
int main()
{
    cout << "Enter a number : " << endl;
    int num,result;
    cin>>num;

    result = addition(num);
    cout<< "The next of "<<num<<" is "<<result;
}

int addition(int n)
{
    return n + 1;
}
