#include<iostream>
#include<string.h>
using namespace std;
int main()
{
  //Type your code here.
  char str[5];
  int n;
  cin>>str>>n;
  if(!strcmp(str,"front"))
  {
    if(n==1)
      cout<<"Left Handed";
    else
      cout<<"Right Handed";
  }
  else
  {
    if(n==1)
      cout<<"Right Handed";
    else
      cout<<"Left Handed";
  }
}