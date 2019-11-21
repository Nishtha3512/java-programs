interface I1
{
	int a=10;
	void display();
	
}
class Interfacetest1 implements I1
	{
	public void display()
	{
	System.out.println(a);
	}
	public static void main(String args[])
		{
		//Interfacetest1 obj=new Interfacetest1();
		//obj.display();
		System.out.println(a);
		}
	}
