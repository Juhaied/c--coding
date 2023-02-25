#include <iostream>
#include<vector>
using namespace std;

vector<int> transformation(vector<int>item);
int main()
{
    vector<int> val = {3,3,4,3};

    vector<int> tran = transformation(val);

    for(int i = 0;i<tran.size();i++){
        cout<<tran[i]<< ", ";
    }
}
vector<int> transformation(vector<int> item)
{


    for(int i = 0;i<item.size();i++){
        if(item[i] % 2 == 0){
            item[i] = item[i] - 1;


        }
        else if(item[i] % 2 == 1){
            item[i] = item[i] + 1;

        }
    }

    return item;
}
