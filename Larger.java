public class Larger
{
public st--atic void main(String args[])
{
int a=5;
int b=9;
int c=15;
int d=3;
		if(a>b)
		{
			if(a>c)
				{
				if(a>d)
					{
						System.out.println(a);
					}
				else
					{
						System.out.println(d);

					}
				}
			else 
				{
				
					if(c>d)
						{
							System.out.println(c);
						}
					else
						{
							System.out.println(d);
						}
					
			
				}
		}
	
	else
	{
		if(b>c)
			{
			if(b>d)
				{
					System.out.println(b);
				}
			else
				{
			System.out.println(d);
				}
			}
		else
			{
			if(c>d)
				{
				System.out.println(c);
				}
			else
				{
				System.out.println(d);
				}
			}
	}
}
}