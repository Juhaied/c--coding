#include <iostream>

using namespace std;

int main()
{
   cout << "Enter your score : ";

   int score;
   cin>>score;

   double pay = 100;

   if(score>=90){
    pay =pay + pay * 0.03;

    cout<< " Pay = "<<pay;

   }
   else{
    cout<<" Word hard to score more"<<endl;
    cout<<" pay = "<< pay;
   }
}
