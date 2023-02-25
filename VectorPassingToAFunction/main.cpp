#include <iostream>
#include<vector>
using namespace std;
void print_Vector(vector<int> data);
int main()
{
    vector<int> item = {1,2,3};
    print_Vector(item);
}
void print_Vector(vector<int> data)
{
    for(int i = 0;i<data.size();i++){
        cout<<data[i]<<endl;
    }
    cout<<data.size()<<endl;
    data.push_back(4);
    cout<<data.size()<<endl;

    for(int j = 0;j<data.size();j++){
        cout<<data[j]<<endl;
    }
}
