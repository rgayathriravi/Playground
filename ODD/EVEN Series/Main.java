#include<stdio.h>
int main()
{
	int a,n,d,ts1,ts2,nterm;
  scanf("%d",&n);
  if(n%2==1)
  {
    a=0,d=2;
    ts1=(n+1)/2;
    nterm=a+(ts1-1)*d;
    printf("%d",nterm);
  }
  else
  {
    a=0,d=1;
    ts2=n/2;
    nterm=a+(ts2-1)*d;
    printf("%d",nterm);
  }
 return 0;
}