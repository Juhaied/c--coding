#include <iostream>

using namespace std;

int main()
{
    cout<< " enter first & last point : "<<endl;

    int i1,i2;

    cin>>i1>>i2;

    for(int i = i1 ; i<= i2 ;i++){
        if(i % 2 != 0){
            cout<<i<<endl;
        }
    }
}
