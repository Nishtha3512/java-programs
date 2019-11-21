import java.util.*;
import java.lang.String;
class Array3
{
	public static void main(String args[])
	{
		 //int sum=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
			System.out.println("enter 5 number");
			for(int i=0;i<=4;i++)
				{
					a[i]=sc.nextInt();
				}
					for(int j=4;j>=0;j--)
					{
						//sum=sum+a[i];
						a[j]=a[i];
						System.out.println(a[j]);
					}
					//System.out.println(sum);
	}
}
					