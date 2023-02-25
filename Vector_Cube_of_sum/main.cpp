#include <iostream>
#include<vector>

using namespace std;

int Sum_of_cube(vector<int> item);


int main()
{
    vector<int> values = {3,4,5};

    int sum = Sum_of_cube(values);

    cout<< "sum = "<<sum;
}
int Sum_of_cube(vector<int> item)
{
    for(int i = 0;i<item.size();i++){
        item[i] = item[i] * item[i] * item[i];
    }

    int s = 0;

    for(int i = 0;i<item.size();i++){
        s = s + item[i];
    }
    return s;
}
