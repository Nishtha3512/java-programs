class Constr
{
	int roll;
	String name;
	Constr()
	{
		
		System.out.println("constructer called  default Const");
	}
	
	Constr(int t)
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
			Constr c1=new Constr();
			c1.Student1();
			c1.Student2(16523);
			c1.Student3(7635,"vcg");
			}
}