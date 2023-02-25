#include <iostream>

using namespace std;

int main()
{
   int answer = 11;

   cout<< "Enter your guess : "<<endl;

   int guess;

   cin>>guess;

   guess==answer ? cout<< "Good job\n" : cout<< "bad job\n";
}
