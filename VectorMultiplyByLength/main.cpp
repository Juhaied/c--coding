#include <iostream>
#include<vector>
using namespace std;

vector<int> Mul_By_Length(vector<int> item);
int main()
{
   vector<int> value = { 2,6,9};

   vector<int> mul = Mul_By_Length(value);

   for(int i = 0;i<mul.size();i++){
    cout<<mul[i]<< ", ";
   }
}
vector<int> Mul_By_Length(vector<int> item)
{
    int length = item.size();

    for(int i = 0;i<item.size();i++){
        item[i] *= length;

    }

    return item;
}
