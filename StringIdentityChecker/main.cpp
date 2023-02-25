#include <iostream>
#include<string>

using namespace std;

bool Identity_Check(string s);
bool Identity_Checker2(string s);

int main()
{
    cout<< "Enter a string : "<<endl;
    string str;
    cin>>str;

    bool check1= Identity_Check(str);

    if(check1 == 1){
        cout<< "True"<<endl;
    }
    else{
        cout<< "False"<<endl;
    }

    cout<< "Another function call"<<endl;

    bool check2= Identity_Checker2(str);

    if(check2 == 1){
        cout<< "True";
    }
    else{
        cout<< "False";
    }

}
bool Identity_Check(string s)
{
    for(int i = 0;i<s.length();i++){
        if(s[0] != s[i]){
            return false;
        }

    }
          return true;
}
//another way

bool Identity_Checker2(string s)
{
    int count  = 0;

    char ch = s[0];

    for(int i = 0;i<s.length();i++){
        if(ch == s[i]){
            count++;
        }
    }
    if(count == s.size()){
        return true;
    }
    else{
        return false;
    }
}
