import java.lang.String;
import java.io.*;
class File5
{
public static void main(String args[]) throws IOException
	{
	int i;
	FileOutputStream fout=new
	FileOutputStream("Filetest.txt",true);
	String s="jhbhj";
	char ch[]=s.toCharArray();
	for(i=0;i<s.length();i++)
		fout.write(ch[i]);
		
//	fout.close();
	}
}