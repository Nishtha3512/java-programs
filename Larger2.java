public class Larger2
{
public static void main(String args[])
{
int a=5;
int b=91;
int c=15;
int d=121;
int e=17;
if(a>b)
{
	if(a>c)
	{
		if(a>d)
		{
			if(a>e)
			{
				System.out.println("a is greater");
			}
			else{
				System.out.println("e is greater");
			}
		}
		else
			if(d>e)
			{
			
				System.out.println("d is greater");
				}
				else
				{
					System.out.println("e is greater");
				}
	}
	else 
		if(c>d)
		{
			
			if(c>e)
			{
				System.out.println("c is greater");
			}
			else
			
				{
				System.out.println("e is greater");
				}
		}
		else
			{
			System.out.println("d is greater");
			}
			
		
}
else
	
		if(b>c)
		{
			if(b>d)
			{
				if(b>e)
				{
					System.out.println("b is greater");
				}
				else
				{
					System.out.println("e is greater");
				}
			}
			else
			if(d>e)
			{
				System.out.println("d is greater");
			}
			else{
			System.out.println("e is greater");}
		}
		else
			if(c>d)
			{
				if(c>e)
				{
					System.out.println("c is greater");
				}
				else
				{
					System.out.println("e is greater");
				}
			}
			else{
				System.out.println("d is greater");
			}
}			
}
	
			
			
		
			
/*if(b>c)
{
if(b>d)
{
if(b>e)
{
System.out.println("b is greater");
}}}

if(c>d)
{
if(d>e)
{
System.out.println("a is greater");
}}}
if(a>c)
{
if(a>d)
{
if(a>e)
{
System.out.println("a is greater");
}*/