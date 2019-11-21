
import java.lang.String;
import java.util.*;
class ABC /*extends ArrayList*/
{
	public static void main(String args[])
	{
	
	ArrayList l1=new ArrayList(4);
		l1.add("A");
		l1.add("ds");
		Iterator it=l1.iterator();
		while(it.hasNext())
		{
		System.out.println(it.next());
		}
	}
}
		
		