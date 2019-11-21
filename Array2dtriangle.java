import java.util.Scanner;
class Array2dtriangle
{
	public static void main(String args[])
	{
		//int m=0;
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
				//int sum=0;
					for(int i=0;i<=2;i++)
					{
						//int sum=0;
						int m=0+i;
						for(int j=0;j<=m;j++)
						{
							System.out.println("  ");
						
						
						sum=sum+a[i][j];
							System.out.print(/*"a[ " +i + "][" +j + "] ="*/   a[i][j]   );
							}
							//System.out.println("  ");
					}
						
					
				System.out.println( sum );
				
	}
}
				