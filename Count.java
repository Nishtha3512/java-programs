public class Count
	{
	public static void main(String args[])
	{
		int a=5465782;
		int count=0;
		int a1;
			while(a>0)
			{
			a1=a%10;
			
			count++;
			
			//System.out.println(count);
			a=a/10;
			//a--;
			}
			System.out.println(count);
	}
	}