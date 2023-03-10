import java.awt.*;
import java.awt.event.*;
import java.sql.*;
class insert extends Frame implements ActionListener
{
	Label l1,l2,l3;
	TextField t1,t2,t3;
	Button b;
	insert()
	{
		setSize(300,300);
		setVisible(true);
		setLayout(new FlowLayout());
		setBackground(Color.gray);
		
		l1=new Label("Enter Your EID");
		l2=new Label("Enter Your Name");
		t1=new TextField(20);
		t2=new TextField(30);
	
		b=new Button("Insert");
		b.setBackground(Color.green);
		add(l1);
		add(t1);
		add(l2);
		add(t2);
		add(b);
		b.addActionListener(this);
		addWindowListener (new WindowAdapter() 
		{    
           	 public void windowClosing (WindowEvent e)
		 {    
                	dispose();    
           	 }    
        	});  
	}
	public void actionPerformed(ActionEvent e)
	{
	try
	{
		Class.forName("oracle.jdbc.driver.OracleDriver");
		Connection con=DriverManager.getConnection("jdbc:oracle:thin:@ntsocietyserver:1521:oralbrce","scott","tiger");
		PreparedStatement pst=con.prepareStatement("insert into hemanii values(?,?)");
		

		//read input from textfield
		String num=t1.getText();
		pst.setString(1,num);
		String name=t2.getText();
		pst.setString(2,name);
		
		pst.executeUpdate();
      		System.out.println("Inserted");
		
	}
	catch(Exception ex)
	{
		System.out.println(ex);
	}
}
}
class Awtinsert
{
public static void main(String args[])
	{
		insert s=new insert();
	}
}
