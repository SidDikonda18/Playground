#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int y;
  cin>>y;
  if(y%100 ==0)
  {
    if(y%400 ==0)
      cout<<y<<" is a leap year";
    else
      cout<<y<<" is not a leap year";
  }
  else if(y%4==0)
    cout<<y<<" is a leap year";
  else
    cout<<y<<" is not a leap year";
  return 0;
}