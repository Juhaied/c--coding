#include <iostream>
#include<vector>
using namespace std;
std::vector<int> arr(int start);
int main()
{
    cout<< "Enter a number : "<<endl;
    int n;
    cin>>n;

    vector<int> k = vector<int> arr(n);
    cout<<k;
}
std::vector<int> arr(int start)
{
    std::vector<int> s;
    for(int i = start; i>=0;i++){
        s[i] = start - i;
    }
    for(int i = 0;i<s.size();i++){
        cout<<s[i];
    }
}
