import java.lang.String;
class Checkinput
{
	public static void main(String args[])
	{
		String s1=new String("1ello");
		char ch1=s1.charAt(4);
			int ascii =ch1;
		
		System.out.println(ch1);
		System.out.println(ascii);
		if(ascii>=64&&ascii<=116)
		{
			System.out.println(ch1+"is character");
		}
			else if(ascii>=48&&ascii<=58)
			//else if(ch1>=0&&ch1<=9)
			{
				System.out.println(ch1+"is interger");
			}
			else
			{
				System.out.println(ch1+"is integer");
			}
	}

}
























