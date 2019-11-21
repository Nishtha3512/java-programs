import java.util.Scanner;
import java.lang.String;
class Array2
{
public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter the numbers");
		//sc=a.nextInt();
			for(int i=0;i<=4;i++)
			{
			a[i]=sc.nextInt();
			}
				for(int i=0;i<=4;i++)
				{
				System.out.println(a[i]);
				}
				int n;
				System.out.println("enter a number n");
			
				//int n[]=new int[1];
				 n=sc.nextInt();
			for(int i=0;i<=4;i++)
				{
					//a[i]=n;
					if(a[i]==n)
					{
						System.out.println(n+"no belongs to array");
					}
						/*else
						{
							System.out.println("no does not belongs to array");
						*/
				}
	}
}
				
		
		