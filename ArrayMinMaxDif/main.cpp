#include <iostream>
#include<vector>

using namespace std;

int difMin_Max(vector<int> input);

int main()
{
    vector<int> value = {1,2,3,4,11};

    int min_max = difMin_Max(value);

    cout<<min_max;

}
int difMin_Max(vector<int> arr)
{
  int s = arr[0];
	int l = arr[0];
	int diff = 0;

	for (int i=1; i<arr.size(); i++){
		if (arr[i] < s){
			s = arr[i];
		}
		else if (arr[i] > l){
			l = arr[i];
		}
	}
	diff = l - s;
	return diff;
}
