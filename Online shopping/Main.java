#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int famt,fdis,fship,aamt,adis,aship,samt,sdis,sship,ama,flip,sd;
  cin>>famt>>fdis>>fship>>samt>>sdis>>sship>>aamt>>adis>>aship;
  flip=(famt-((famt/100)*fdis))+fship;
  ama=(aamt-((aamt/100)*adis))+aship;
  sd=(samt-((samt/100)*sdis))+sship;
  //cout<<famt/100;
  cout<<"In Flipkart Rs."<<flip<<"\nIn Snapdeal Rs."<<sd<<"\nIn Amazon Rs."<<ama;
  if(flip<=sd)
  {
    if(flip<ama)
      cout<<"\nHe will prefer Flipkart";
    else
      cout<<"\nHe will prefer Amazon";
  }
  else
  {
    if(sd<ama)
      cout<<"\nHe will prefer Snapdeal";
    else
      cout<<"\nHe will prefer Amazon";
  }
  return 0;
}