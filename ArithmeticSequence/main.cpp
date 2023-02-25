#include <iostream>
#include<vector>
using namespace std;
int print_Vector(vector<int> i);
int main()
{
    std::vector<int> input = {1,2,3};

    std::vector<int> j = print_Vector(input);
    cout<<j;


}
int print_Vector(vector<int> i)
{
    int d = i[1] - i[0];
    return d + i([i.size()- 1]);
}
