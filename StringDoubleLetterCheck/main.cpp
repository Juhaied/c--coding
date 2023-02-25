#include <iostream>
#include<string>

using namespace std;
bool doubleCheck(string str);


int main()
{
   cout<< "Enter a string : ";
   string str ;
   cin>>str;

   bool x = doubleCheck(str);
   if(x == 1){
    cout<< "True";
   }
   else{
    cout<< "False";
   }
}

bool doubleCheck(string str)
{
    for(int i = 0;i<str.length() ;i++){
        if(str[i] == str[i+1] ){
            return true;
        }
    }
    return false;
}
