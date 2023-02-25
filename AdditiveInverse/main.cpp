#include <iostream>
#include<vector>
std::vector<int> additiveInverse(std::vector<int> arr);
using namespace std;

int main()
{
    vector<int> a = { 1,2,3};

    vector<int> b = additiveInverse(a);


    for(int j = 0;j<b.size();j++){
        cout<<b[j];
    }
}
std::vector<int> additiveInverse(std::vector<int> arr)
{
    std::vector<int> r = arr;

	for(int i = 0; i < r.size(); i++)	{
		r[i] *= -1;
	}


	return r;

}
