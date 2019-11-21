import java.util.Scanner;
class Arrayodd
{
	public static void main(String args[])
	{
		int a[]=new int[5];
		Scanner sc=new Scanner(System.in);
		System.out.println("enter 5 numbers");
		for(int i=0;i<=4;i++)
			{
				a[i]=sc.nextInt();
			}
				for(int i=0;i<=4;i++)
					{
					if(a[i]%2==0)
					{
					System.out.println("even number " + a[i]);
					}
						else
						{
						System.out.println("odd number" +a[i]);
						}
					}
	}
}
					