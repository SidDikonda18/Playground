#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,res;
  cin>>n;
  if(n<=200){
    res=n*0.5;
    cout<<"Rs."<<res;}
  else if(n<=400){
    res=n*0.65+100;
    cout<<"Rs."<<res;}
  else if(n<=600){
    res=n*0.8+200;
    cout<<"Rs."<<res;}
  else{
    res=n*1.25+425;
    cout<<"Rs."<<res;}
  return 0;
}