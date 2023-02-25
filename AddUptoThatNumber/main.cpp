#include <iostream>

using namespace std;
int addUpTo(int n);
int main()
{
    cout<< "Enter a number : "<<endl;
    int num;
    cin>>num;

    int total = addUpTo(num);
    cout<< " SUm is = "<<total;

}
int addUpTo(int n)
{
    int sum = 0;
    for(int i = 1;i <=n;i++){
        sum += i;
    }
    return sum;
}
