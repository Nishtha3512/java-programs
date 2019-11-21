import java.lang.String;
import java.util.Scanner;
		class Checkpassword
		{
			int pass_length=8;
				public static void main(String args[])
				{
					Scanner sc=new Scanner(System.in);
					System.out.println("Condition");
					String n=sc.nextLine();
					
					
				}	
					
					
							public static boolean isValid_Password(String password)
							{
								if(password.length()<pass_length)
								
									return false;
								
								
								
								int charcount=0;
								int numbercount=0;
								
									for(int i=0;i<password.length();i++)
									{
										char ch=password.charAt(i);
										if(isNumber(ch))
										{
											numbercount++;
										}
										else if(isChar1(ch))
										{
											charcount++;
										}
										else
										{
											return false;
										}
									}
									/*public  static boolean isNumber(char ch)
									{
									
										return(ch>='0' && ch<='9');
									}
									public void isChar1(char ch)
									{
									return	(ch>='a' && ch>='z');
									}*/
							}
		}
									
					