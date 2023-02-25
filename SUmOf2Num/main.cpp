#include <iostream>

using namespace std;
bool Sum_Of_Input(int a, int b);
int main()
{
   cout<< "ENter two number : "<<endl;
   int n1,n2;
   cin>>n1>>n2;

   bool answer = Sum_Of_Input(n1, n2);

   cout<<answer;

}
bool Sum_Of_Input(int a, int b)
{
    if(a + b> 100){
        return true;
    }
    else
        return false;
}
