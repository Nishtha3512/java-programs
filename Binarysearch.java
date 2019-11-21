import java.lang.String;
import java.util.Scanner;

	class Binarysearch1
	{
		
			/*int n;
			int a[]=new int[n];
			Scanner sc=new Scanner(System.in);
		System.out.println("enter the no of elements ");
		 n=sc.nextInt();
			for(int i=0;i<n;i++)
			{
				a[i]=sc.nextInt();
				
			}
				
				System.out.println("enter the element uh want to check");
				int x=sc.nextInt();*/
				
				
				int m;
				//int n;
				int binarySearch( int a[],int f,int l,int x) 
				{
				if(l>=f)
				{
					 m=(f+l)/2;
					 //System.out.println("m="+m);
					
				}	
				if(a[m]==x)
				{
					return m;
						
					
				}
				
				if(x>a[m])
				{
					return binarySearch(a,m+1,l,x);
				}
				if(x<a[m])
				{
					return binarySearch(a,f,m-1,x);
				}
				return -1;
				}
	}


class Binarysearch{
	public static void main(String args[])
		{
		
		
				Binarysearch1 b=new Binarysearch1();
				int a[]={2,3,4,6,7,8};
		         int n=6;	   
				 //System.out.println(n);
				int x=6;
				int result=b.binarySearch(a,0,n-1,x);
				if(result==-1)
				{
					System.out.println("element is not preseent");
				}
				else
				{
					System.out.println(result);
				}
}}

		
		