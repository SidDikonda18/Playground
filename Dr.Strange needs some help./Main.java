#include<iostream>
using namespace std;
int power(int x, int y) {  
   int i,power=1;
   if(y == 0)
      return 1;
   for(i=1;i<=y;i++)
      power=power*x;
   return power;
}
int main()
{
  int a,b,res,req;
  cin>>a>>b>>req;
  res=power(a,b);
  if(req<=res)
    cout<<"Doctor, you can proceed with your experiment.";
   else
     cout<<"Sorry Doctor! You need more bacteria.";

  
}