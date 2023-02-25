#include <iostream>

using namespace std;

string helloWorld(int n);
int main()
{
   cout<< "Enter a number : "<<endl;
   int n1;
   cin>>n1;
   string s1 = helloWorld(n1);
   cout<<s1;
}
string helloWorld(int n)
{
    if((n % 3 == 0) && (n % 5 == 0)){
        return "Hello, World!";
    }
    else if(n % 3 == 0){
        return "Hello";
    }
    else if(n % 5 == 0){
        return "World";
    }

}
