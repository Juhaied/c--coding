#include <iostream>
#include <cstdlib>
#include<ctime>
using namespace std;

int main()
{

    srand(time(0));

    int lottery = rand() % 100;

    cout<< " Enter two digits : "<<endl;

    int guess;

    cin>>guess;

    int lot1 = lottery % 10;
    int lot2 = lottery / 10;

    int gue1 = guess / 10;
    int gue2 = guess % 10;

    cout<< " The lottery number is "<<lottery<<endl;


    if(lottery == guess){
        cout<< " Exact match !!!! You won 10000 ";
    }
    else if(gue1==lot2 && gue2 == lot1){
        cout<< " All digits match !!! you won 3000 ";
    }
    else if(gue1==lot2 || gue1==lot1 || gue2==lot2 || gue2==lot1){
        cout<< " One digit match .. 1000 win";
    }
    else{
        cout<<" sorry no match ";
    }
}
