import java.util.Scanner;
class Array
{
	public static void main(String args[])
	{
		 int sum=0;
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
			System.out.println("enter 5 number");
			for(int i=0;i<=4;i++)
				{
					a[i]=sc.nextInt();
				}
					for(int i=0;i<=4;i++)
					{
						sum=sum+a[i];
						System.out.println("a["+ i+" ] =" + a[i] + "sum is" + sum);
					}
					System.out.println(sum);
	}
}
					