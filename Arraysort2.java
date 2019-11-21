import java.util.Scanner;
//import java.util.Arrays;
public class Arraysort2
{
	public static void main(String args[])
	{
	int n;
	int temp;
	//int a;
		 //int sum=0;
		//int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		
			System.out.println("enter  number of elements");
			n=sc.nextInt();
			int a[]=new int[n];
			System.out.println("enter the elements ");
			for(int i=0;i<=n;i++)
				{
					a[i]=sc.nextInt();
				}
					for(int i=0;i<=n;i++)
					{
						for(int j=i+1;j<=n;j++)
						{
						if(a[i]>a[j])
						{
						temp=a[i];
						a[i]=a[j];
						a[j]=temp;
						}
						
						System.out.println("a[i] =" + a[i] );
					}
					}
	}
}
					