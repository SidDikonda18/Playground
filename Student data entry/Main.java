#include <iostream>
#include<string.h>
using namespace std;
struct student
{
    char name[50];
    int roll;
    float marks;
};
int main() 
{
   //Your code goes here
  char str[20];
  int roll,marks;
  student s1;
  gets(s1.name);
  cin>>s1.roll>>s1.marks;
  
 // s1.name=str;s1.roll=roll;s1.marks=marks;
  cout<<"\nStudent Details\nName: "<<s1.name<<"\nRoll: "<<s1.roll<<"\nMarks: "<<s1.marks;
}