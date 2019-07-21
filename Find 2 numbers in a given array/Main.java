#include<stdio.h>
int main()
{
  	int n,i,ele1,ele2,ele1index=-1,ele2index=-1;
  scanf("%d",&n);
  int a[n];
  for(i=0;i<n;i++)
  {
    scanf("%d",&a[i]);
  }
  scanf("%d%d",&ele1,&ele2);
  for(i=0;i<n;i++)
  {
    if(ele1==a[i]&&ele1index==-1)
    {
      ele1index=i;
    }
    if(ele2==a[i]&&ele2index==-1)
       {
      ele2index=i;
    }
  }
  printf("Element 1 index = %d\nElement 2 index = %d",ele1index,ele2index);
 
}