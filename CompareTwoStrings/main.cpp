#include <iostream>
#include<string>
using namespace std;

int main()
{
    std::string name = "Juhaied hossen nabid ";

    if(name == "Juhaied hossen nabid "){
        cout<< " Equals "<<endl;
    }
    else{
        cout<< " Not equal"<<endl;
    }

    //another way

    std:: string str = "What about you?" ;

    if(str.compare("What about you?") == 0){
        cout<<"Equals"<<endl;
    }
    else{
        cout<< " Not equals "<<endl;
    }
}
