class Counterstatic
{
 static int count=0;
public void Counter()
	{
		count++;
		System.out.println(count);
		//return count;
	}
		public static void main(String args[])
			{
			Counterstatic c1=new Counterstatic();
			c1.Counter();
			Counterstatic c2=new Counterstatic();
			c2.Counter();
			Counterstatic c3=new Counterstatic();
			c3.Counter();
			}
}			