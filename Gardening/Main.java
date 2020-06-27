#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,b,c;
  cin>>a>>b>>c;
  if((c>=b+1 && c<=b*2) || (c>b*(a-2)+1 && c<=b*(a-1)))
    cout<<"It is a mango tree";
  else
    cout<<"It is not a mango tree";
  return 0;
}