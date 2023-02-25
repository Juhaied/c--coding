#include <iostream>

using namespace std;
string Name_Print(string s1,string s2);
int main()
{
    cout<< "Enter first & last name : "<<endl;
    string s1,s2;
    cin>>s1>>s2;

    string revName = Name_Print(s1,s2);
    cout<<revName;
}
string Name_Print(string s1,string s2)
{

 return "\"" + s2 + ", " + s1 + "\"";
}
