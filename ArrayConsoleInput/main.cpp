#include <iostream>

using namespace std;

void print_Array(int arr[], int s);
int main()
{

    const int SIZE = 10;

    int guesses[SIZE];

    cout<< " Enter input : "<<endl;
    for(int i = 0;i<SIZE;i++){
        cin>>guesses[i];
    }
    print_Array(guesses, SIZE);
}
void print_Array(int arr[], int s)
{

    cout<< " Showing output "<<endl;
    for(int i = 0;i<s ;i++){
        cout<<arr[i]<<endl;
    }

}
