import java.sql.*;
class Demodatabase
{
public static void main(String args[])
{
try
{
Class.forName("oracle.jdbc.driver.OracleDriver");
System.out.println("connected");
}
catch(Exception e)
{
System.out.println(e);
}
}
}
	