#include <iostream>
#include<vector>
using namespace std;

int main()
{

std::vector<int> item = {1,2};

  item.push_back(12);

  std::cout<<"After pushing 12 size is = "<<item.size()<<endl;
  std::cout<< "Last element of the vector = "<<item[item.size()-1]<<endl;
  item.pop_back();
  std:: cout<<"After poping the last element size is = "<<item.size()<<endl;

  std::cout<<"Is the vector is empty = "<<item.empty()<<endl;

  std::cout<<"First element "<<item.front()<<endl;
  std::cout<<"Last element"<<item.back()<<endl;

  std:cout<<"Is empty = "<<item.empty()<<endl;
}
