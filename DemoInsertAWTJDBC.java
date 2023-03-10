import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class Insert extends Frame implements ActionListener
{
	Label l1,l2;
	TextField t1,t2;
	Button b;
	Insert() //Constructor
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new GridLayout());
		l1=new Label("Enter roll number");
		t1=new TextField(20);
		new Label("Enter Name");
		t2=new TextField(20);
		b=new Button("Insert");
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
	}
	public void actionPerformed(ActionEvent e)
	{
	try
	{
	 Class.forName("oracle.jdbc.driver.OracleDriver");
	Connection c=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
	PreparedStatement pst=c.prepareStatement("inset into siddu5c5 values(?,?)");
//read input from textfiled
	String num=t1.getText();
	String name=t2.getText();
	pst.setString(1,num);
	pst.setString(2,name);
	ResultSet rs=pst.executeQuery();
	
	}
	catch(Exception ex)
	{
	System.out.println(ex);
	}
	}

}
class DemoInsetAWTJDBC
{
public static void main(String args[])
{
	Search s=new Search();
}
}
