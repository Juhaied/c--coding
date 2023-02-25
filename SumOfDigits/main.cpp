#include <iostream>

using namespace std;

int main()
{

    cout << " Enter an digit : " << endl;

    int dig ;

    cin>> dig;

    int sum = 0;

    while (dig != 0){
         double rem= dig % 10;
        sum = sum + rem;
        dig = dig/10;
    }
    cout<< " sum = "<<sum;
}
