#include <iostream>

using namespace std;
void Sum_of_Digits(int num);

void Average(int sum, int avg);
int main()
{
    cout<< "Enter the digits : "<<endl;
    int number;
    cin>>number;

    Sum_of_Digits(number);

}


void Sum_of_Digits(int num)
{
    int sum = 0;
    int digit_counter = 0;
    while(num != 0){
        sum = sum + num % 10;
        num = num /10;
        digit_counter++;
    }

    cout<< " Sum of digit is = "<<sum<<endl;

    Average(sum,digit_counter);
}

void Average(int sum, int avg)
{
    cout<< " Average is "<<((sum * 100)/(avg * 100.0))<<endl;
}
