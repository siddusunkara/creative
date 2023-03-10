import java.sql.*;
class DeleteDemo
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
 
 String s="delete from siddu5c5 where (eid=111)";
 int no_of_rows_effected=stmt.executeUpdate(s);
 String s1="delete from siddu5c5 where (eid=102)";
 no_of_rows_effected=stmt.executeUpdate(s1);
 System.out.println("no of rows"+no_of_rows_effected); 
}
catch(Exception e)
{
System.out.println(e);
}

}//main
}//class