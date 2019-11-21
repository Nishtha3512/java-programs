import java.lang.String;
public class Commandlineinput
{
public static void main(String args[])
{
int s=0;
int i;
for(i=args.length-1;i>=0;i--)
	
	{
		System.out.println(args[i]);
		//System.out.println(args[0]);
		//System.out.println(args[1]);
		s=s+Integer.parseInt(args[i]);
	}
		System.out.println(s);
}
}