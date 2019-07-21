#include<stdio.h>
int main()
{
	long int n,i,fact=1;
  scanf("%ld",&n);
  for(i=n;i>0;i--)
  {
    fact=fact*i;
}
  printf("%ld",fact);
  return 0;
}