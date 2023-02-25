#include <iostream>

using namespace std;
int animals(int chi, int cow, int goat);
int main()
{
    cout << "Enter the number of chickens , cow and goat : " << endl;
    int chicken,cow,goat;
    cin>>chicken>>cow>>goat;

    int legs = animals(chicken,cow,goat);

    cout<< chicken<< " chicken , "<<cow<< " cow and "<<goat<< "goat has total "<<legs << " legs";
}
int animals(int chi, int cow, int goat)
{
    return ((2 * chi) + (4 * cow) + (4 * goat));
}
