#include<stdio.h>
int main()
{
  int num,sum=0,d1,d3;
  scanf("%d",&num);
  d3=num%10;
  d1=num;
  while(num>10)
  {
    num=num/10;
  }
  d1=num;
  sum=d1+d3;
  printf("%d",sum);
  return 0;
}


