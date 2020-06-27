#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int a,c,b,large,i,small,clue;
  cin>>a>>b>>c;
  if(a>b && a>c)
  {
	if(b>=c)
    {  large=b;
    	small=c;}
    else
    {  large=c;
     small=b;}
  }
  else if(b>a && b>c)
  {
    if(a>c)
    {	large=a;
     small=c;}
     else
     {  large=c;
      small=a;}
  }
  else
  {
    if(b>a)
    {  large=b;
     small=a;}
    else
    { large=a; small=b;}
   }
  for(i=1;i<=small;i++)
    if(a%i==0 && b%i==0 &&c%i==0)
      clue=i;
  cout<<"The treasure is in box which has number "<<large<<"\n";
  cout<<"The code to open the box is "<<clue;
  
}