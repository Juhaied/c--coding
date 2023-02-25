#include <iostream>
#include<string>

using namespace std;

bool hasSpace(string str);

int main()
{
    cout<< "Enter a string : "<<endl;
    string s;
    getline(cin,s);

    bool ans = hasSpace(s);

    if(ans == 1){
        cout<< "True";
    }
    else{
        cout<< "False";
    }
}
bool hasSpace(string str)
{
    for(int i = 0;i<str.length(); i++){
        if(str[i] == ' '){
            return true;
        }

    }
    return false;
}
