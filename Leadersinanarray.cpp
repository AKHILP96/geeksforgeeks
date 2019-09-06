#include <iostream>
using namespace std;

int main() {
	//code
	int tests = 0;
	cin>>tests;
	while(tests-->0){
	    int length;
	    cin>>length;
	    int a[length];
	    for(int i=0;i<length;i++){
	        cin>>a[i];
	    }
	    int max = a[length-1];
	    for(int i=length-2;i>=0;i--){
	        if(a[i]>=max){
	           max = a[i];
	        }else{
	            a[i]=-1;
	        }
	    }
	    for(int i = 0;i<length;i++){
	    if(a[i]!=-1){
	        cout<<a[i]<<" ";
	     }
	    }
	    cout<<endl;
	}
	return 0;
}
