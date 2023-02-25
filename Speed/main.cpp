#include <iostream>

using namespace std;

int main()
{
    cout << "Enter Speed" << endl;

    int speed ;
    cin>>speed;

    if(speed<20){
        cout<< " Too slow ";
    }
    else if(speed>=20 && speed<=79){
        cout<<"just right";
    }
    else{
        cout<< " Too speed ";
    }
}
