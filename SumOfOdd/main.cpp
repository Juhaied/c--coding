#include <iostream>

using namespace std;

int main()
{
    int count = 0;
    int sum = 0;
    for(int i = 1 ; i<= 100 ; i++){
        if(i%2 != 0){
            sum = sum + i;
            count ++;
        }
        if (count == 10)
            break;
    }
    cout << " sum = " <<sum;
}
