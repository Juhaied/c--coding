#include <iostream>
#include<vector>
using namespace std;
int findIndex(vector<int> item, int num);

int main()
{
    vector<int> value = {1,2,3,4,5};

    cout<< "Enter a number you want to search in array : ";
    int num;
    cin>>num;

    int index = findIndex(value,num);

    cout<<index;

}

int findIndex(vector<int> item, int num)
{
    for(int i = 0;i,item.size();i++){
        if(item[i] == num){
            return i;
            break;
        }
    }
    return -1;
}
