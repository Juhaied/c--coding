#include <iostream>
#include<string>
using namespace std;

int main()
{
    cout<< "Enter a string : ";
    string s;

    cin>>s;

    if(s.length() == 0){
        cout<< "Empty"<<endl;
    }
    else{
        cout<< "Length is "<<s.length()<<endl;
    }
}
