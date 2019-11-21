class Astatic
{
	 static String name="Nishtha";
	static void display()
	{
	System.out.println("name is" +name);
	}
}	
		class Bstatic
		{
		public static void main(String args[])
		{
			Astatic.name="asd";
		Astatic d=new Astatic();
		d.display();
		}
		}