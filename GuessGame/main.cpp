#include <iostream>
#include<ctime>
#include<cstdlib>

using namespace std;
void Play_game();
void  Play_AdditionGame();
void Play_SubtractionGame();
void Show_MultiplicationTable();
void show_Factorial();
void print_Array(int array[], int count);
int main()
{
    cout<< "-----------Welcome----------"<<endl;
    srand(time(0));
    int choice;

    do{
        cout<< "0.Quit"<<endl<< "1.Play Random Game"<<endl<< "2.Play addition game"<<endl<<"3.Play Subtraction Game "<<endl<<
        "4.Multiplication table"<<endl<< "5.Factorial Game"<<endl;
        cin>>choice;

        switch(choice){

           case 0:
               cout<< "Thanks for nothing"<<endl;
               return 0;
           case 1:
               Play_game();
               break;
           case 2:
               Play_AdditionGame();
               break;
           case 3 :
            Play_SubtractionGame();
            break;
           case 4:
             Show_MultiplicationTable();
             break;
           case 5:
             show_Factorial();
             break;
        }
    }while(choice != 0);
}
void Play_game()
{
    int random = rand() %  51;

    int guesses[51];

    int guess_counter = 0;
    cout<< "Random number is : "<<random<<endl;

    cout<< "Enter your guess : "<<endl;

    while(true){
        int guess;
        cin>>guess;
        guesses[guess_counter++] = guess;

        if(guess == random){
            cout<< "Your guess is right "<<endl;
            break;
        }
        else if(guess<random){
            cout<< "Your guess is too low"<<endl;

        }
        else{
            cout<< "Your guess is too high "<<endl;
        }
    }
    print_Array(guesses, guess_counter);

}
void print_Array(int array[] ,int count)
{
    for(int i = 0;i<count;i++){
        cout<< "Your guesses = "<<array[i]<<endl;
    }
}

void Play_AdditionGame()
{
    int r1 = rand() % 10;
    int r2 = rand() % 10;
    int answer;
    cout<< "What is "<<r1 << " + "<<r2 << "?"<<endl;

    cin>>answer;
    while((r1 + r2) != answer){
        cout<< "Wrong answer!!!Try again."<<endl<<"What is "<<r1 <<"+"<<r2 <<"=";
        cin>>answer;

    }
    cout<< "You got it right"<<endl;
}
void Play_SubtractionGame()
{
    int r1 = rand() % 10;
    int r2 = rand() % 10;
    int temp;
    if(r1<r2){
        temp = r1;
        r1= r2;
        r2 = temp;
    }
    int answer;
    cout<< "What is "<<r1 << " - "<<r2 << "?"<<endl;

    while(true){
        cin>> answer;

        if(answer==(r1- r2)){
            cout<< " You got it "<<r1 << " - "<<r2 << " = "<<(r1-r2)<<endl;
            break;
        }
        else{
            cout<< "Try again"<<endl;
        }
    }
}
void Show_MultiplicationTable(){

      cout<< " Entered the number which you want multiplication table"<<endl;

      int num;
      cin>>num;

      for(int i = 1;i<=10 ;i++){
        cout<<num << " X "<<i << " = "<<(num*i)<<endl;

      }

}

void show_Factorial()
{
    cout<< "Enter the number which you want factorial: "<<endl;
    int num;

    cin>>num;
    int fact = 1;
    for(int i = 1;i<=num;i++){
        fact = fact * i ;
    }
    cout<< " Factorial of "<<num<< " is "<<fact<<endl;
}
