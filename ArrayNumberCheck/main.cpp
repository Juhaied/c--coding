#include <iostream>

using namespace std;
void checkArray(int a[], int s,int num);
int main()
{
    cout<< "Enter array elements: "<<endl;

    int ara[5];

    for(int i = 0;i<5 ;i++){
        cin>>ara[i];
    }

    int sizeofA = sizeof(ara) / sizeof(int);

    cout<<"enter a number : "<<endl;
    int num;
    cin>>num;

    checkArray(ara,sizeofA,num);

}
void checkArray(int a[], int s,int num)
{
    for(int i = 0;i<s;i++){
        if(a[i] == num){
            cout<< "Number found"<<endl;
            break;
        }
        else{
            cout<< "Not found";
            break;
        }
    }
}
