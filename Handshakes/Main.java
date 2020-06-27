#include<iostream>
using namespace std;
int main()
{
  //Type your code here.
  int n,i,j,ct=0;
  cin>>n;
  for(i=0;i<n;i++)
    for(j=i+1;j<n;j++)
      ct++;
  cout<<ct;
}