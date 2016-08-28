#include<stdio.h>

int main() {
int n,i,j, sum=1;
  scanf("%d",&n);
  int tab[10000] ;
  for (i=0; i<n; i++) 
  {
   	  tab[i]=0;
   	  int l=i+1;
   	   for (j=1; j<l; j++)
   	   {
	   	   if((i+1)%j==0)
			  {
 			   tab[i]++;
 			   l=(i+1)/j;
			   }
	   }
	   sum=sum+tab[i];
  }
  printf("%d",sum);
  return 0;
}
