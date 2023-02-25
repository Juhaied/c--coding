#include <iostream>
#include<string>
using namespace std;
void isPlural(string s);
int main()
{
    cout<< "Enter a string : "<<endl;
    string str;
    cin>>str;

    isPlural(str);
}
void isPlural(string s)
{
  if(s[(s.size() - 1)]=='s'){
  cout<< "Plural";
  }
  else{
    cout<<"Singular";
  }

}

