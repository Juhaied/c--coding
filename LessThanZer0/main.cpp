#include <iostream>

using namespace std;
bool func(int num);
int main()
{
    cout<< "Enter a number : ";
    int num;
    cin>>num;

    bool ans = func(num);
    cout<<ans;

}
bool func(int num)
{
    if(num<= 0){
        return true;
    }
    else
        return false;
}
