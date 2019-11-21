import java.util.Scanner;
import java.lang.String;
class Array2d
{
	public static void main(String args[])
	{
		 int sum=0;
		int a[][]=new int[3][3];
		Scanner sc=new Scanner(System.in);
			System.out.println("enter  numbers");
			for(int i=0;i<=2;i++)
				{
				for(int j=0;j<=2;j++)
				{
					a[i][j]=sc.nextInt();
					//System.out.println(a[i][j]);
				//	a[j]=sc.nextInt();
					
				}
				}
					for(int i=0;i<=2;i++)
					{
						for(int j=0;j<=2;j++)
						{
							
							
							sum=sum+a[i][j];
							System.out.print(/*"a[ " +i + "][" +j + "] ="*/   a[i][j]   );
							}
							System.out.println("  ");
						
						
					}
				System.out.println(sum);
				
	}
}
				