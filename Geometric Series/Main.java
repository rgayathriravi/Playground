#include<stdio.h>
#include<math.h>
int main()
{
  int n;
  scanf("%d",&n);
  if(n%2==1)
  {
    int a=1;
    int r=2;
    int term=(n+1)/2;
    int res=pow(2,term-1);
      printf("%d",res);
  }
  else
  {
    int a=1;
    int r=3;
    int term=n/2;
    int res=pow(3,term-1);
      printf("%d",res);
  }
  return 0;
}