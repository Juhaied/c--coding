#include <iostream>

using namespace std;
void Sum_Array(int ara[] , int s);
int main()
{
   const int SIZE = 100;

   int counter = 0;

   int array[SIZE];
   cout<< "Enter your values : "<<endl;
   for(int i = 0;i<SIZE;i++){
    if(cin>>array[i]){
        counter++;
    }
    else{
        break;
    }
   }
   Sum_Array(array, counter);

}
void Sum_Array(int ara[] , int s)
{
    int sum = 0;

    for(int i = 0;i<s;i++){
        sum = sum + ara[i];
    }
    cout<< "Sum of your input : "<<sum<<endl;
}
