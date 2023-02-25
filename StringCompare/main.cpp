#include <iostream>
#include<string>
using namespace std;
string Compare(string p,string q);
int main()
{
   cout<< "Enter a string: "<<endl;
   string s1,s2;
   getline(cin,s1);

   cout<< "Enter 2nd string : "<<endl;
   getline(cin,s2);

   string c = Compare(s1,s2);
   cout<<c;

}
string Compare(string p,string q)
{
    if(p.length() == q.length()){
        return "Equal";
    }
    else{
        return "not Equal";
    }
}
