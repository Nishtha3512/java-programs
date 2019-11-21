import java.lang.String;
class Exception2
{
	public static void main(String args[])
	{
	try
	{
	String s1="null";
	//System.out.println("String length is" +s1.length());
	throw new NullPointerException("string length"+s1.length());
	
	}
		catch(NullPointerException e)
		{
		System.out.println("exception is" +e.getMessage());
		System.out.println(e);
		}
	}
}