#include <iostream>

using namespace std;

int main()
{
    cout<< "Enter array Inputs: "<<endl;
    int arr[5];

    for(int i = 0;i<5;i++){
        cin>>arr[i];
    }
    cout<< "Your inputs"<<endl;
    for(int i = 0;i<5;i++){
        cout<<arr[i]<<endl;
    }
    int min1 = arr[0];

    for(int i = 0;i<5;i++){
       if(arr[i]<min1){

       min1= arr[i];
       }
    }
    cout<<"Minimum is = "<<min1;
}
