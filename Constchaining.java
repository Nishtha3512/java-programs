class A
{
	int x;
	A()
	{
		System.out.println("default cont A");
	}
	
	A(int l)
	{
	x=l;
	}
		public void showDimention()
		{
		System.out.println(x);
		
		}
}
	class B extends A
	{
	int y;
	int z;
	B()
	{
	//	this(12,45,67);
		System.out.println("default cont B");
	}
		B(int l,int b,int h)
		{
		//this();
		super();
		y=b;
		z=h;
		}
			public void showDimention()
			{
				super.showDimention();
				System.out.println(y);
				System.out.println(z);
			}
	}
			class Constchaining
			{
			public static void main(String args[])
				{
				 A obj=new B(10,34,34);
				 
				obj.showDimention();
				
				}
			}
	