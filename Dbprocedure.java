import java.sql.*;
class Dbprocedure
{
	public static void main(String args[])
	{
		try{
			Class.forName("oracle.jdbc.driver.OracleDriver");
			Connection con=
			DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","IPC106","IPC106");
			CallableStatement stmt=con.prepareCall("{call PUSHF1(?,?,?,?)}");
			stmt.setInt(1,100);
			stmt.setString(2,"Sonasri");
			stmt.setString(3,"CSE");
			stmt.setString(4,"14-MAY-2004");
			stmt.execute();
			System.out.println("Inserted succesfully");
			con.close();
		}
		catch(Exception e)
		{
			System.out.println(e);
		}
	}
}
