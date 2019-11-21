class Alphabet2
{
public static void main(String args[])
{
for(int row=0;row<=6;row++)
	{
		for(int col=0;col<=4;col++)
		{
			if(((col==0||col==4)&&row!=0)||((col>0 && col<4)||(row==0&&row==4)))
			{
				System.out.print("*");
			}
			else
				
			System.out.print(" ");
		}
		System.out.println();
	}
	System.out.println();
}
}
