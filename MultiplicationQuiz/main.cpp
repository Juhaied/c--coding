#include <iostream>
#include <cstdlib>
#include <ctime>
using namespace std;

int main()
{
    srand(time(0));
    int num1  = rand() /500;
    int num2 = rand() / 500;

    cout<< " What is " << num1 << " X " << num2 << " = ?";
    int answer;
    cin>>answer;

    if(num1 * num2 == answer){
        cout<< " Your answer is right " << num1 << " X " << num2 << " is " << answer;
    }
    else{
         cout<< " Your answer is wrong " << num1 << " X " << num2 << " is " << (num1 * num2);
    }

}
