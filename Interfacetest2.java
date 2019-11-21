interface i1
{
	 int a=12;
	void fun();
}
interface i2
{
	void fun1();
}
interface i3 extends i1,i2
{
	void fun3();
}
interface i4
{
	int b=20;
}
 class B implements i1 , i2
{
	public void fun()
	{
	System.out.println(a);	
	}
	public void fun1()
	{
	
	}
}
	class A extends B implements i3,i4
	{
		public void fun3()
		{
			System.out.println(b);
		}
	}	
	public class Interfacetest2
	{
		public static void main(String args[])
		{
		A obj=new A();
		obj.fun3();
		obj.fun();
		}
	
}

