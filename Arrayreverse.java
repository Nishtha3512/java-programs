import java.util.*;
import java.lang.String;
class Arrayreverse
{
public static void main(String args[])
	{
		int n,i;
		
	
	//int b[]=new int[10];
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of elemnts elements");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter "+n+" elements");
		for(  i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int j=n-1;j>=0;j--)
			{
		
			
			System.out.println(a[j]);
			}
	}
}
			