class AlphabetK
{
public static void main(String args[])
{
for(int row=0;row<=6;row++)
	{
for(int col=0;col<=4;col++)
		{
			if((col==0) || ((row==0) && (col==4)) || ((row==1) && (col==3)) || ((row==2) && (col==2)) || ((row>=3) && (col==row - 2)))
			{ 
				System.out.print("* ");
			}
		
			else
			{
				System.out.print("  ");
			}
			for(int x=0;x<=4;x=x+2)
				{ 
				System.out.print("* ");
				}	
		}
		System.out.println();
	}
	System.out.println();
 
}
}