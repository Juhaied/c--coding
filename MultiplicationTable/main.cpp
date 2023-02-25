#include <iostream>

using namespace std;

int main()
{
    cout << "Enter the number which you want a multiplicationTable :  " << endl;
    int num;
    cin>> num;

    cout << "Multiplication of number " <<num << " is below"<<endl;

    for(int i = 1; i<= 10;i++){
        cout<< num << " X " << i << " = " << (num * i)<<endl;
    }
    return 0;
}
