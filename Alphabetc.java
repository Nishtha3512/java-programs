class Alphabetc
{
public static void main(String args[])
{
for(int row=0;row<=6;row++)
	{
		for(int col=0;col<=4;col++)
		{
			if(((col==0) && (row>=2 && row<=4)) || ((col==1) && ((row==1) || (row==5))) || ((col>=2) && ((row==0) || (row==6))))
			{ 
				System.out.print("* ");
			}
			else
			{
				System.out.print("  ");
			}
		}

		System.out.println();
	}
	System.out.println();
}
}