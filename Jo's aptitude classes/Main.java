#include <iostream>
using namespace std;
int gcd(int a,int b,int c,int small)
{
  int i;
  for(i=small;i>=1;i--)
    if(a%i==0 && b%i==0 &&c%i==0)
      return i;
}
int main() 
{
   // Try out your code here
    int a,b,c,res,small;
  cin>>a>>b>>c>>res;
  if(a<b && a<c) 
      small=a;
  else if(b<a && b<c)
    small=b;
  else
    small=c;
    if(gcd(a,b,c,small)==res)
      cout<<"Answer is correct.";
      else
        cout<<"Answer is wrong.";
}