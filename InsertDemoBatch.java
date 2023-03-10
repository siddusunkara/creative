import java.sql.*;
class InsertDemoBatch
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
 String query1="insert into siddu5c5 values(201,'ram')";
 stmt.addBatch(query1);
 String query2="insert into siddu5c5 values(202,'sid')";
 stmt.addBatch(query2);
 String query3="insert into siddu5c5 values(203,'laxman')";
 stmt.addBatch(query3);
 stmt.executeBatch();
 
}
catch(Exception e)
{
System.out.println(e);
}

}//main
}//class