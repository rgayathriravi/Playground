#include<stdio.h>
int main()
{
	char a[50];
  int lenght,i,count=1;
    scanf("%s",a);
  for(lenght=0;a[lenght]!='\0';lenght++);
    if(lenght>20)
    {
      printf("Invalid Input");
     }
     else
     {
       for(i=0;i<lenght;i++)
       {
         if(a[i]==a[i+1])
         {
           count++;
         }
         else
         {
           printf("%c%d",a[i],count);
           count=1;
         }
       }
     }
  return 0;
  
}