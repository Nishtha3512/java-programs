class initialize
	{
	private int x;
	{
		System.out.println("intialization block");
		x=10;
	}
		
	 initialize(int t)
		{
		System.out.println(t);
		}
	
			
			/*public class Inittest
			{*/
				public static void main(String args[])
				{
				initialize i=new initialize(87);
				//i.initialize(10);
				
				}
			
			}	