class Const
{
	int roll;
	String name;
	Const()
	{
		
		System.out.println("constructer called  default Const");
	}
	
	Const(int t)
	{
		
		System.out.println("constructer called Const"+t);
	}
	
	public int Student1()
	{
		System.out.println("constructer called");
	return 0;
	}
	public void Student2(int r )
	{
	roll=r;
	
	
	}
	public void	Student3(int r,String s)
		{
			roll=r;
			name=s;
			
		}
			public static void main(String args[])
			{
			Const c1=new Const(10);
			c1.Student1();
			c1.Student2(16523);
			c1.Student3(7635,"vcg");
			
			//Const2 c2=new Const2(123);
			//Const3 c3=new Const3(1234,"jng");
			
			}
}
			