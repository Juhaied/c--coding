#include <iostream>
#include<string>
using namespace std;
void compare(string s1 , string s2);
int main()
{
    cout<< "Enter 1st and 2nd string : "<<endl;
    string s1,s2;
    cin>>s1>>s2;

     compare(s1,s2);


}
void compare(string s1 , string s2)
{
    for(int i = 0;i<s1.size() ;i++){
        for(int j = 0;j<s2.size();j++){
            if(s1[0] == s2[s2.size()-1]){
               cout<< "True";

            }
            else{
                cout<< "false";
                break;
            }
        }
    }
}
