import java.util.Scanner;
import java.lang.String;
class Arrayseparatezero
{
public static void main(String args[])
	{
		int temp;
		int n;
		Scanner sc =new Scanner(System.in);
		System.out.println("enter number of elemnts elements");
		n=sc.nextInt();
		
		int a[]=new int[n];
		System.out.println("enter "+n+" elements");
		for( int i=0;i<n;i++)
		{
			a[i] = sc.nextInt();
		}
		for(int i=0;i<n;i++)
		{
			if(a[i]<=9 && a[i]%10==0)
			{
				temp=a[i];
				System.out.print(" " + temp+ " ");
				
			}
			else
			{
			System.out.print("non zero elements are" +a[i] );
			}
		}
	}
}