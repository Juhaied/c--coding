#include <iostream>

using namespace std;
void christmas(int year,int month,int day);
int main()
{
    cout<< "Enter year, month and day : "<<endl;
    int year,month,day;
    cin>>year>>month>>day;

     christmas(year,month,day);


}
void christmas(int year,int month,int day)
{
    if(month == 11 && day ==24){
        cout<< "Christmas ";
    }
    else{
        cout<< " False";
    }

}
