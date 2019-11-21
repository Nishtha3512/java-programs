import java.lang.String;

	class Duplicatechar
	{
	public static void main(String args[])
	{
		int count=0;
		String s1="Hellnnoo22";
		//int count=0;
		char ch1[]=s1.toCharArray();
		System.out.println("Duplicate char are");
			for(int i=0;i<s1.length();i++)
			{
				for(int j=i+1;j<s1.length();j++)
					{
					if(ch1[i]==ch1[j])
					{
					System.out.println(ch1[j]);
					int temp=ch1[j];
					count++;
					//System.out.println(temp);
					}
					//System.out.println(count);
					}
					
				//System.out.println(count);	
				//System.out.println(count);	
			}
			System.out.println("no of duplicate "+count);
	}
	}