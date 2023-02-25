#include <iostream>
#include<vector>
#include<string>


using namespace std;

vector<std::string> repeat(string str, int time);

int main()
{
   cout<< "Enter a string : "<<endl;
   string s;
   cin>>s;

   cout<< "How many times repeating : "<<endl;
   int n;
   cin>>n;

   vector<string> rep = repeat(s,n);

   for(int i = 0;i< rep.size();i++){
    cout<<rep[i]<<",";
   }
}
vector<std::string> repeat(string str, int time)
{
    vector<string> s ;
    for(int i = 0;i<time;i++){
        s.push_back(str);
    }
    return s;
}
