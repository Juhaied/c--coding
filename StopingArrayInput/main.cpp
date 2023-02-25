#include <iostream>

using namespace std;
void Show_Array(int arr[], int s);
int main()
{
    const int SIZE= 100;;

    int guesses[SIZE];
    int counter = 0;
    cout<< " Enter your input : "<<endl;
    for(int i = 0;i<SIZE;i++){
        if(cin>>guesses[i]){
            //input worked
            counter++;
        }
        else{
            //invalid character
            break;
        }
    }
    Show_Array(guesses, counter);
}
void Show_Array(int arr[], int s)
{
    cout<< "Showing Input "<<endl;
    for(int i = 0;i<s;i++){
        cout<< arr[i]<<endl;
    }
}
