 import java.util.*;
import java.sql.*;
class PrepareDemo
{
public static void main(String args[])
{
try
{
 int id;
 String name;
 Scanner s=new Scanner(System.in);
 System.out.println("enter id");
 id=s.nextInt();
 System.out.println("enter name");
 name=s.next();
 //register type 4 driver
 Class.forName("oracle.jdbc.driver.OracleDriver");
 System.out.println("Driver registered");
 //connection
 Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
 System.out.println("Connection established");
 //statement

  String sql="insert into siddu5c5 values(?,?)";
 PreparedStatement stmt=c.prepareStatement(sql);
 //4.write sql query and execute

 stmt.setInt(1,id);
 stmt.setString(2,name);
 int i=stmt.executeUpdate(sql);
System.out.println(i+"records inserted");
}
catch(Exception e)
{
System.out.println(e);
}

}//main
}//class