#include<stdio.h>
int isvowel(char ch)
 
{
         if(ch=='a' || ch=='A' || ch=='e' || ch=='E' || ch=='i' || ch=='I' || ch=='o' || ch=='O' || ch=='u' || ch=='U')
           return 0;
         else 
           return 1;
       }
  int main()
  {
     char str[100],i;
  scanf("%[^\n]s", str);
   for(i=0;str[i]!='\0';i++)
   {
  if(isvowel(str[i]))
  {
    printf("%c",str[i]);
  }
   }
    return 0;
  }
  
      