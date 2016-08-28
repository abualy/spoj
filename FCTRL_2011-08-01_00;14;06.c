#include<stdio.h>
#include<math.h>
int main()
{
 	int test,i,j,a,number,ind_pow;
 	scanf("%d",&test);
 	for (i=0;i<test;i++)
 	{
		number=0;
	 	scanf("%d",&a);
		ind_pow=(long)((double)log(a)/(double)log(5));
		for ( j = 1; j <= ind_pow; j++)
				{
					number=number+(long)(a/(pow(5,j)));
				}
				printf("%d\n",number);
	}
 	return 0;
}
