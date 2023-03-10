import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Search extends Frame implements ActionListener
{
	Label l1;
	TextField t1,t2;
	Button b;
	Search() //Constructor
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		l1=new Label("Enter roll number");
		t1=new TextField(20);
		t2=new TextField(20);
		b=new Button("Search");
		add(l1);
		add(t1);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	try
	{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
	PreparedStatement pst=c.prepareStatement("select * from siddu5c5 where eid=?");
//read input from textfiled
	String num=t1.getText();
	pst.setString(1,num);
	ResultSet rs=pst.executeQuery();
	int x=0;
	add(t2);
	while(rs.next())
	{
		//System.out.println(rs.getString(1)+"  "+rs.getString(2));
// Display name(column2) on textfield2		
		t2.setText(rs.getString(2));
		x++;
	}
	if(x==0)
	{
		t2.setText("record not found");
	}
	
	}
	catch(Exception ex)
	{
	System.out.println(ex);
	}
	}

}
class DemoAWTJDBC
{
public static void main(String args[])
{
	Search s=new Search();
}
}
