#include <iostream>
#include<vector>

using namespace std;

vector<int> even(int num);

int main()
{
   cout<<"Enter a number : "<<endl;
   int num;
   cin>>num;

   vector<int> evenArr = even(num);

   for(int i = 0;i<evenArr.size();i++){
    cout<<evenArr[i]<<", ";
   }
}
vector<int> even(int num)
{
    vector<int> item;

    for(int i = 1;i<= num ;i++){
        if(i % 2 == 0)
        {
            item.push_back(i);
        }
    }
    return item;
}
