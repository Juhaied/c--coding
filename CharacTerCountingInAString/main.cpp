#include <iostream>
#include<string>
using namespace std;
int counter(char ch , string str);
int main()
{
   cout<< "Enter a string : "<<endl;
   string s;
   getline(cin,s);

   cout<< "Enter a character : "<<endl;
   char c;
   cin>>c;

   int chaInS = counter(c,s);
   cout<<"in string "<<s << " we have total "<<c<< " = "<<chaInS;
}
int counter(char ch , string str)
{
    int c = 0;
 for(int i = 0;i<=str.size() ;i++){
    if(str[i] == ch)
        c++;
 }
 return c;
}
