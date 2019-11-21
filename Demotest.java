class Demo
{
int l;
int b;
public void getarea()
{
	int area=l*b;
//return area;
}
public void getperimeter()
{
	
	
int perimeter=2*(l+b);
//return perimeter;
}}
class Demotest
{
public static void main(String args[])
{
Demotest d=new Demotest();
d.getarea();
l=10;
b=10;
//d.b=20;

System.out.println("area is ="+d.getarea);
System.out.println("perimeter is ="+d.getperimeter);
}
}