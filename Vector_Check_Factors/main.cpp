#include <iostream>
#include<vector>

using namespace std;
bool check_Factor(vector<int> arr , int num);
int main()
{

    vector<int> val = { 1, 2 ,3, 8};

    cout<< "Enter a num : "<<endl;
    int num ;
    cin>>num;

    bool ans = check_Factor(val,num);

    if(ans == 1){
        cout<< "True";

    }
    else{
        cout<< "False";
    }
}
bool check_Factor(vector<int> arr , int num)
{
    for(int i = 0;i<arr.size();i++){
        if(num % arr[i] != 0){
            return false;
        }
    }
    return true;
}
