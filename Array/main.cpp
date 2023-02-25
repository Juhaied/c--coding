#include <iostream>

using namespace std;

int main()
{
   int arr[] = {1,2,3,4,5,6};

   int size = sizeof(arr) /sizeof(int);

   cout<<size<<endl;

   for(int i = 0;i<size;i++){
    cout<<arr[i]<<endl;
   }
}
