#include <iostream>

using namespace std;

int main()
{
    int arr[2][2];

    cout<< "Input "<<endl;

    for(int i = 0;i<2;i++){
        for(int j = 0;j<2;j++){
            cin>>arr[i][j];
        }
    }

    cout<< "Matrix"<<endl;

    for(int i = 0;i<2;i++){
        for(int j = 0;j<2;j++){
            cout<<arr[i][j];
        }
        cout<<"\n";
    }
    cout<< "Determinant Calculation"<<endl;

    int det;
     for(int i = 0;i<2;i++){
        for(int j = 0;j<2;j++){
            det = (arr[0][0] * arr[1][1]) - (arr[0][1] * arr[1][0]);
        }

    }
    cout<<det;
}
