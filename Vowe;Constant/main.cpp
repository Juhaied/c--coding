#include <iostream>

using namespace std;

int main()
{

   cout << "Enter a character : "<<endl;

   char ch ;
   cin>> ch;

   if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
    cout << ch << " is a vowel ";
   }
   else {
    cout << ch << " is a consonant ";
   }
}
