#include <iostream>
#include<vector>
using namespace std;

void print_Sum(vector<int> item);
int sum(vector<int> summation);
int main()
{
    vector<int> data;
    print_Sum(data);
}
void print_Sum(vector<int> item)
{
    item.push_back(1);
    item.push_back(2);
    cout<< "Printing the vector : "<<endl;
    for(int i = 0;i<item.size();i++){
        cout<<item[i]<<endl;
    }

    int x = sum(item);
    cout<<"Sum of all the element = "<<x;
}
int sum(vector<int> summation)
{
    int sum = 0;

    for(int i = 0;i<summation.size();i++){
        sum += summation[i];
    }
    return sum;
}
