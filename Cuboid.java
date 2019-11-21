class Rectangle
{
	int length;
	int breadth;
	Rectangle(int l,int b)
		{
		length=l;
		breadth=b;
		}
			int area()
			{
			return(length*breadth);
			}
}

class Cuboid extends Rectangle
	{
	int height;
	
		Cuboid(int l,int b,int h)
		{
		height=h;
		}
			int area1()
			{
			return(length*breadth*height);
			}
	}
	
	class Inherittest
	{
	public static void main(String args[])
		{
		Cuboid c=new Cuboid(12,10,10);
		c.area();
		c.area1();
		}
	}

	