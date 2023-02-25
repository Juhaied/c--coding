#include <iostream>

using namespace std;

int main()
{
    cout<< "Score : ";
    int score ;
    cin>>score;
    if (score >= 60.0 && score<=69)
        cout << "Grade is D";
    else if (score >= 70.0 && score<=79)
        cout << "Grade is C";
    else if (score >= 80.0&& score<=89)
        cout << "Grade is B";
    else if (score >= 90.0&& score<=99)
        cout << "Grade is A";
    else
        cout << "Grade is F";


}
