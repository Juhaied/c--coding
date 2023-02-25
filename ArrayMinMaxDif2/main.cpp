#include <iostream>
#include<vector>
#include<iterator>
#include<algorithm>
using namespace std;


int main()
{
    vector<int> arr = { 1,2,3,6,9};

   std::sort(arr.begin(),arr.back());
    int dif = (arr.back() - arr.front());
    cout<<dif;
}




