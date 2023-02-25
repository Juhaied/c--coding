#include <iostream>

using namespace std;

int main()
{
    cout << "   P   " << "  P * 5   " << "      P * 10    " << endl;

    for( int p = 5 ; p<= 50 ; p += 5){
        cout << "   " <<p <<  "    " <<      p * 5 << "             " <<      p * 10 <<endl ;
    }
}
