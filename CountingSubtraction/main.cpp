#include <iostream>
#include<cstdlib>
#include<ctime>
using namespace std;

int main()
{
    srand(time(0));

    const int QUESTION_NUMBER = 5;
    long startTime = time(0);

    int count = 0; //question counter;
    int count_correctAnswer = 0; //answer counter

    while(count<QUESTION_NUMBER){
        int r1 = rand() % 10;
        int r2 = rand() % 10;
        int temp;
        if(r1<r2){
            temp = r1;
            r1= r2;
            r2= temp;
        }
        cout << "What is "<<r1 << " - "<<r2 << " = "<<endl;
        int answer;
        cin>>answer;

        if((r1-r2)==answer){
            cout<< "You got it right"<<endl;
            count_correctAnswer++;
        }
        else{
            cout<< "Your answer is wrong."<<r1 << " - "<<r2<< " should be "<<(r1 - r2)<<endl<<endl;
        }
        count++;
    }
long endTime = time(0);
    long testTime= endTime - startTime;
    cout<< "Correct answer = "<<count_correctAnswer << endl<<"Test time is "<<testTime<<"seconds "<<endl;

}
