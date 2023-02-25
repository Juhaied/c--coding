#include <iostream>
#include<string>
using namespace std;

int main()
{
    string s1,s2;
    cin>>s1;
    cin>>s2;

    int c = 0;

    for(int i = 0,j=0;i<s1.length(),j<s2.length();i++,j++){
        if(s1[i] != s2[j]){
            c++;
        }
    }
    cout<<c;
}
