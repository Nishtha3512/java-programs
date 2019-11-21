import java.lang.String;
class AbcString
{
	public static void main(String args[])
	{
		String s1=new String("Hello");
		String s2="Hello";
		String s3=s1+ "Java"+s2;
		
		System.out.println(s1==s2);
		System.out.println(s1.equals(s2));
		System.out.println(s1.compareTo(s2));
		
		
	}
}