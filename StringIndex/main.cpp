#include <iostream>
#include<vector>
#include<string>

using namespace std;

int main()
{
   vector<string> str = {"abc" , "def" , "fgh"};

   cout<< "Enter a string : "<<endl;
   string s;
   cin>>s;

   int index = 0;

   for(int i = 0; i<str.size();i++){
    if(str[i] == s){
        index = i;
    }
   }

   cout<<index;
}
