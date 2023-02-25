#include <iostream>

using namespace std;

int main()
{
  cout<< " Enter a number : ";

  int num,n;


  cin>>num;
n= num;
  int rem,reverse1 = 0;

  while(num != 0){
    rem = num % 10;

    reverse1 = (reverse1 * 10 )+ rem;

    num = num / 10 ;
  }
  if(n == reverse1){
    cout<< reverse1 << " is palindrome ";
  }
  else{
    cout<<reverse1<< " is not palllindrome";
  }
}
