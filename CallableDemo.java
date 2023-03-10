import java.sql.*;  
class CallableDemo {  
public static void main(String[] args) throws Exception{  
  
Class.forName("oracle.jdbc.driver.OracleDriver");  
Connection con=DriverManager.getConnection(  
"jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");  
String sql="create procedure "INSERTR"  
(id IN NUMBER,  
name IN VARCHAR2)  
is  
begin // 
insert into siddu5c5 values(id,name);  
end;  
//    ";  

CallableStatement stmt=con.prepareCall("{call insertR(?,?)}");  
stmt.setInt(1,401);  
stmt.setString(2,"vinay");  
stmt.execute();  
  
System.out.println("success");  
}  
}  