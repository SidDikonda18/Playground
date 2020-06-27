#include<iostream>
int power(int m,int n)
{
    int j,i;
    for(i=1,j=1;i<=n;i++)
        j=j*m;
    return j;
}
int arm(int n)
{
    //Your code goes here
  int a,res=0,temp,ct=0;
  temp=n;
  while(n>0)
  {
    n/=10;
    ct++;
  }
  n=temp;
  while(n>0)
  {
    a=n%10;
    res+=power(a,ct);
    n=n/10;
  }
  if(temp==res)
    return 1;
  else
    return 0;
}
int main()
{
    int n;
    std::cin>>n;
    if(arm(n)==1)
        std::cout<<"Kindly proceed with encrypting";
    else
        std::cout<<"It is not an Armstrong number";
    
}