#include <iostream>

using namespace std;
bool Game( double prob, double prize, double fee);
int main()
{
    cout<< "Enter winning probability , prize and entry fee : "<<endl;
    double prob,prize,fee;

    cin>>prob>>prize>>fee;
    bool ans = Game(prob,prize,fee);
    cout<<ans;
}

bool Game( double prob, double prize, double fee)
{
    double net = ((prob * prize) - fee);

    if(net>0){
        return true;
    }
    else
        return false;
}
