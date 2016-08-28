#include<stdio.h>
#include<math.h>
int main()
{
	double det,j,u,v,w,U,V,W;
	int test;
	scanf("%d",&test);
	for (j=0;j<test;j++)
	{
			scanf("%lf",&u);
			scanf("%lf",&v);
			scanf("%lf",&w);
			scanf("%lf",&W);
			scanf("%lf",&V);
			scanf("%lf",&U);
			det=4*u*u*v*v*w*w-u*u*(v*v+w*w-U*U)*(v*v+w*w-U*U)-v*v*(w*w+u*u-V*V)*(w*w+u*u-V*V)-w*w*(u*u+v*v-W*W)*(u*u+v*v-W*W)+(v*v+w*w-U*U)*(w*w+u*u-V*V)*(u*u+(v*v)-W*W);
			det=sqrt(det);
			det = det/(double)12;
			det=round(det*10000);
			det=det/10000;
			printf("%.4lf\n",det);
	}	
	return 0;
}
