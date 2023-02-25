#include <iostream>

using namespace std;

int main()
{
    cout<< " Enter two numbers: "<<endl;

    int n1,n2;

    cin>>n1>>n2;

    int s = sum(n1,n2);

    cout<<s;

}
int sum(int i1, int i2)
{

int result = i1 + i2;

return result;
}
