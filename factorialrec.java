public class Factorialrec
{
int n=1;
int num(int a)
	{
	if (a>1)
		{
		n=n*a;
		//System.out.println(n);
		return(num(a-1)*a);
		}
		else
		{
		//System.out.println(a);
		return 1;
		}
	}
	public static void main(String args[])
	{
	Factorialrec f1=new Factorialrec();
	
	int result=f1.num(4);
		System.out.println(result);
	}
}