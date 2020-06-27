#include <iostream>
using namespace std;
int main() 
{
	// Type your code here
  int n,a;
  cin>>n;
  while(n>0)
  {
    a*=10;
    a+=n%10;
    n/=10;
  }
  cout<<a;
	return 0;
}