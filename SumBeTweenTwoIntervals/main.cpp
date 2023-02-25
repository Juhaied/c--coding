#include <iostream>

using namespace std;

int summation(int i1, int i2);
int main()
{
    int a,b,sum;
    cout<< " Enter intervals from which you want to sum and the last one : "<<endl;

    cin>>a>>b;

    sum = summation(a, b);
    cout<< sum;

}
int summation(int i1, int i2)
{
    int s = 0;
    for(int i = i1 ; i<=i2 ;i++){
        s = s + i;
    }
    return s;
}
