#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c,d,doll,cent;
  cin>>a>>b>>c>>d;
  doll=a+c;
  cent=b+d;
  cout<<doll+(cent/100);
  cout<<"\n"<<cent%100;
}