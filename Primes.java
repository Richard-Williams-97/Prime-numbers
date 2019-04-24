
public class Primes 
{
	public static void main(String[]args)
	{

int divisor=2;
int ray[]=new int[200];
boolean remainder=true;

		for(int i=0; i<ray.length;i++)
		{
			ray[i]=i+1;
		}
for(int i=1; i<200; i++)
{
do {
	if(ray[i]!=divisor && ray[i]>divisor)
	{
		int mod=ray[i]%divisor;
		if(mod==0)
		{
			remainder=false;
		}
	}
	
divisor++;
}while(remainder==true  && divisor<=ray[i]/2.0);
if(remainder==true)
{
	System.out.print(ray[i]+" ");
}
remainder=true;
divisor=2;
}

	
}}
