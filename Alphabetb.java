class Alphabetb
{
public static void main(String args[])
	{
	for(int row=0;row<=6;row++)
		{
		for(int col=0;col<=4;col++)
			{
			if(((row>=0 && row<=6) && (col==0))  || ((row==0 || row==3 || row==6) && (col>=0 && col<=3) )  || ((col==4) && (( row>=1 && row<=2) || (row>=4 && row<=5)) )) 
			{
			System.out.print("* ");
			}
				else
				{
					System.out.print("  ");
				}
			//System.out.print();
			}
		System.out.println();

		}
	}
}
			
			
			
			
			