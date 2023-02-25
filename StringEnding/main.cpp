#include <iostream>
#include<vector>
#include<string>


using namespace std;

vector<std::string> concat(vector<string> str, string s);

int main()
{
    vector<string> str = {"clever" , "new" , "love" , "bad"};

    cout<<"Enter a string : "<<endl;
    string s;
    cin>>s;

    vector<string> t = concat(str,s);


    for(int i = 0;i<t.size();i++){
        cout<<t[i]<< ", ";
    }

}


 vector<std::string> concat(vector<string> str, string s)
{


    for(int i =0;i<str.size();i++){
    str[i] += s;
   }

   return str;
}
