#include <iostream>

using namespace std;

int main()
{
    cout<< "Enter input.if you give 0 then the program will end: "<<endl;
    int input ;
    cin>>input;
    int sum = 0;
    int positive_counter = 1;
    int negative_counter = 0;
    float avg;

    while(input != 0){
        sum = sum + input;
        cout<< "Enter input : "<<endl;
        cin>>input;

        if(input>0){
            positive_counter++;
        }
        else if(input == 0){
            break;
        }
        else{
            negative_counter++;
        }
    }
    int tinput = positive_counter + negative_counter;
    cout<< "THe sum is = "<<sum << endl<<"Positive input  = "<<positive_counter<<endl<<"and negative input is = "<<negative_counter<<"Average is = "<<((sum * 100)/((tinput)*100.0));
}
