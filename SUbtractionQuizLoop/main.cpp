#include <iostream>
#include<ctime>
#include<cstdlib>
using namespace std;

int main()
{
    srand(time(0));

    int r1 = rand() % 10;
    int r2= rand() % 10;
    int temp ;

    if(r1<r2){
        temp = r1;
        r1=r2;
        r2=temp;
    }

    cout<< "What is "<<r1 <<" - "<<r2<< " = "<<endl;
    int answer;
    cin>>answer;

    while((r1-r2) != answer){
        cout<< "Try again"<<endl<<"What is "<<r1 <<" - "<<r2<< " = "<<endl;
        cin>>answer;
    }
    cout<< "You got it"<<endl;

}
