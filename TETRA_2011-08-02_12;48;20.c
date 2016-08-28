#include<stdio.h>
#include<math.h>

double sur(double x,double y,double z)
{
 		return 0.25*sqrt(2*x*x*y*y + 2*x*x*z*z + 2*y*y*z*z - x*x*x*x - y*y*y*y - z*z*z*z);  
}
int main()
{
	double tmp,surface,det,j,u,v,w,U,V,W;
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
			det = det/12.0;
			surface=sur(W,V,U)+sur(W,v,u)+sur(V,w,u)+sur(U,w,v);
			det=3.0*det/surface;
			det=round(det*10000);
			det=det/10000;
			printf("%.4lf\n",det);
	}	
	return 0;
}
