#include <iostream>
#include<cctype>

using namespace std;

int main()
{
   char ch;

   cout<< " Enter a character : "<<endl;
   cin>>ch;

   cout<< "You entered the character \" "<<ch << " \" "<<endl;

   if(islower(ch)){
    cout<< "You entered a lowercase letter and it is "<<ch<<endl;
    cout<< "Its equivalent uppercase letter is "<<static_cast<char>(toupper(ch))<<endl;
   }
   else if(isupper(ch)){
    cout<< "You entered a uppercase letter and it is "<<ch<<endl;
    cout<< "Its equivalent lowercase letter is "<<static_cast<char>(tolower(ch))<<endl;
   }
   else{
    cout<< "You entered a digit";
   }
}
