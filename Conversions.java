class Conversions
{
public static void main(String args[])
	{
	int n=757;
	int n1=0;
	int i=0;
	int rev=0 ;
	
		while(n>0)`
		{
		n1=n%2;
		
		System.out.print(n1);
		
		 n=n/2;
		
		i=n1;
		}
		for(i=0;i<=n1;i++)
		{
			rev =rev*2+i%2;
			i=i/2;
			
			System.out.println("rev is" +rev);
			
			//n1=n1/10;
		}
		
	}
	
}	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	

		