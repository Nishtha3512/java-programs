public class Commandlineinput1
{
public static void main(String args[])
{

int i;
int a;
int b;
int max=0;
//int c;
//for(i=args.length-1;i>=0;i--)
	//{
	
	a=Integer.parseInt(args[0]);
	b=Integer.parseInt(args[1]);
	//c=Integer.parseInt(args[2]);
	//}
		if(a>b)
			{ 
		max=a;
				System.out.println(max);
			
			}
			else
			{
				max=b;
			System.out.println(max);
			}
			
			for(i=2;i<=args.length-1;i++)
			{
				if(i>max)
					max=i;
				System.out.println(max);
			}
}
}