#include<iostream>
using namespace std;
int main()
{
 int a,b,sum=0;
  cin>>a>>b;
  a+=b;
  b=1;
  while(b<a)
  {
   if(a%b ==0)
     sum+=b;
    b++;
  }
  if(sum==a)
    cout<<"They can read the message";
  else
    cout<<"They can't read the message";
  return 0;
}