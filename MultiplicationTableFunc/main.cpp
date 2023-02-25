#include <iostream>

using namespace std;

void multiTable(int num);
int main()
{
    int a;

    cout<< " Enter the number which you want multiplication table : "<<endl;
    cin>>a;
    multiTable(a);

}
void multiTable(int num)
{

    for(int i = 1 ; i<= 10; i++){
        cout<< num << " X " <<i << " = "<<(num * i)<<endl;
    }
}
