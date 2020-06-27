#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a;
  float b;
  cin>>a>>b;
  if(a<=2)
    cout<<(b/100)*50 + b;
  else if(a==3)
    cout<<b*2;
  else
    cout<<"Number of items is more";
  return 0;
}