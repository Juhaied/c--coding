#include <iostream>
#include<string>

using namespace std;

int length(string str);
int main()
{
    cout<< "Enter a string : ";
    string s;
    cin>>s;
    int len = length(s);
    cout<< "String length : "<<len;
}
int length(string str)
{
    if(str.length()== 0){
        return 0;
    }
    else{
        return 1 + length(str.substr(1));
    }
}
