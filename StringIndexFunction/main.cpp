#include <iostream>
#include<vector>
#include<string>




using namespace std;

int findIndex(vector<string> str , string s);
int main()
{
    vector<string> str = {"abc" , "def" , "ghi" , "ijk " , "nabid"};

    cout<<"ENter a string : "<<endl;
    string s;
    cin>>s;

    int index = findIndex(str , s);
    cout<<index;
}
int findIndex(vector<string> str , string s)
{


    for(int i = 0;i<str.size();i++){
        if(str[i] == s){
         return i;
        }
    }

}
