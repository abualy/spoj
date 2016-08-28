#include<stdio.h>

int main() {
int tab[100001]={0};
int i,j,k,t,m,n,test;
	tab[1]=1;
	tab[0]=1;
  for (i=2; i<100000; i++) 
  {
   	  if(tab[i]==0)
   	  {
	   	  for (j=2; i*j <= 100000;j++) 
	   	  {
		   	  tab[i*j]=1;
		  }
	  }
  }
   scanf("%d",&t);
   for (i=0; i<t; i++) 
  {
   	   scanf("%d",&m);
  	   scanf("%d",&n);
  	   if(m<2) m=2;
   	   for (j=m; j <=n ;j++)
   	   {
	   	   test=0;
	   	   for (k=2; k*k <=j ;k++)
	   	   {
		   	   if (tab[k]==0 && j%k==0 && j>k) 
  			   {
  			   	  test=1;
  			   	  break;
			   }
		   }
		   if(test==0)printf("%d\n",j);
	   }
   }
  return 0;
}
