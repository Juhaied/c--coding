#include <iostream>

using namespace std;

int main()
{
    cout << "Enter a number : " << endl;
    int num;
    cin>>num;
    int fact = 1;

    for(int i = 1; i<=num ; i++){
        fact = fact * i;
    }
    cout << " Factoral of number "<<num << " is " << fact;

}
