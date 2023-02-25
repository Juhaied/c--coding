#include <iostream>

using namespace std;
void print_Array(int ara[], int size);
int main()
{
    int array[] = {1,2,3,4,5,6};

    int size = sizeof(array) / sizeof(int);

    print_Array(array, size);


}
void print_Array(int ara[], int size)
{
   for(int i = 0;i<size;i++){
    cout<<ara[i]<<endl;
   }
}
