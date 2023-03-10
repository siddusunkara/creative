import java.sql.*;
class InsertDemo
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
 
 String s="insert into siddu5c5 values(101,'siddu')";
 int no_of_rows_effected=stmt.executeUpdate(s);
 String s1="insert into siddu5c5 values(102,'chinnu')";
 no_of_rows_effected=stmt.executeUpdate(s1);
 System.out.println("no of rows"+no_of_rows_effected); 
}
catch(Exception e)
{
System.out.println(e);
}

}//main
}//class