import java.sql.*;
class FetchDemo
{
public static void main(String args[])
{
try
{
 //register type 4 driver
 Class.forName("oracle.jdbc.driver.OracleDriver");
 System.out.println("Driver registered");
 //connection
 Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
 System.out.println("Connection established");
 //statement
 Statement stmt=c.createStatement();
 //4.write sql query and execute

 String s="select * from siddu5c5";
 ResultSet rs=stmt.executeQuery(s);
 
 while(rs.next())
{
 System.out.println(rs.getInt("eid") +"\t"+ rs.getString("ename"));

}
}
catch(Exception e)
{
System.out.println(e);
}

}//main
}//class