#include <iostream>
#include<vector>
using namespace std;

int main()
{
    vector<int> item;

   item.push_back(1);
   item.push_back(2);
   item.push_back(3);
   item.push_back(4);

   for(int i = 0;i<item.size();i++){
    cout<<item[i]<<endl;
   }

}
