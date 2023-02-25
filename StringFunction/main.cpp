#include <iostream>
#include<string>
using namespace std;
string Print_Name(string str);
int main()
{
    cout<< "Enter your name : ";
    string name;

    getline(cin,name);

    string s = Print_Name(name);

    cout<<s;

}
string Print_Name(string str)
{
    return "Hello " + str ;
}
