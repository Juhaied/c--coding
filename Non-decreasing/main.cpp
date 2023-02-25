#include <iostream>

using namespace std;

int main()
{
    cout<< " Enter three integers : ";

    int a,b,c;

    cin>>a>>b>>c;

    if(a<=b && a<=c){
        if(b<=c){
            cout<< " Non decreasing order is "<<a<< " , "<<b << " , " <<c;
        }
        else{
            cout<< " Non decreasing order is "<<a<< " , "<<c << " , " <<b;
        }
    }
    else if(b<=a && b<=c){
        if(a<=c){
            cout<< " Non decreasing order is "<<b<< " , "<<a << " , " <<c;
        }
        else{
            cout<< " Non decreasing order is "<<a<< " , "<<c << " , " <<b;
        }
    }
      else if(c<=a && c<=b){
        if(a<=b){
            cout<< " Non decreasing order is "<<c<< " , "<<a << " , " <<b;
        }
        else{
            cout<< " Non decreasing order is "<<c<< " , "<<b << " , " <<a;
        }

      }



}
