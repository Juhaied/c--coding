#include <iostream>

using namespace std;
void Pie(int slice, int buyer, int slicesEach);
int main()
{
    cout<< "Enter total slices , customer and slices each : "<<endl;
    int tSlice , cus, sEach;
    cin>>tSlice>>cus>>sEach;
    Pie(tSlice,cus,sEach);

}
void Pie(int slice, int buyer, int slicesEach)
{
    if(slice > (buyer * slicesEach)){
        cout<< "Order can take place"<<endl;
    }
    else{
        cout<< "We cant proceed this order";
    }
}
