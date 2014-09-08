/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalatif abhi
 */
import javax.swing.*;
import java.awt.event.*;
import java.awt.*;
import java.sql.*;
public class View_Passwords extends JFrame implements ActionListener{
 JLabel l1=new JLabel();static JTable t;JButton b1=new JButton("Back");
JButton b2=new JButton("Exit");
 String s1[]={"Username","Password"};static int mr=0;
View_Passwords(){
  setVisible(true);setSize(700,500);
  setLayout(new FlowLayout());
View_Table(new Adminstrator_Field().fm);
add(t);
add(l1);
add(b1);
add(b2);
b1.addActionListener(this);
b2.addActionListener(this);
JScrollPane pa=new JScrollPane(t);
add(pa);
if (mr==0)
l1.setText("Passwords of all the registerd users");
else
l1.setText("Passwords of all the registerd users Deleted");
    addWindowListener(new WindowAdapter()
    {public void windowClosing(WindowEvent obj){
      System.exit(1);
     }

    });


 }
public void actionPerformed(ActionEvent evt){
    if (evt.getSource()==b1)
        b1actionPerformed(evt);
else
        b2actionPerformed(evt);
}

public void b1actionPerformed(ActionEvent evt){
 setVisible(false);
new Adminstrator_Field().setVisible(true);
}
public void b2actionPerformed(ActionEvent evt){
setVisible(false);
System.exit(1);
}
public void View_Table(int a){
if (a==0){
try {
String url = "jdbc:mysql://localhost:5131/";
            String dbName = "login_passwords";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "poptfs";
           Class.forName(driver).newInstance();
          Connection con = DriverManager.getConnection(url+dbName,userName,password);
           System.out.println("Driver Loaded");
PreparedStatement p1=con.prepareCall("select count(*) from login_passwords");
ResultSet r1=p1.executeQuery();
r1.next();
int row =r1.getInt(1);
PreparedStatement p2=con.prepareCall("select * from login_passwords");
ResultSet r2=p2.executeQuery();
ResultSetMetaData r3=r2.getMetaData();
int col=r3.getColumnCount();
String s2[][]=new String[row][col];
for (int i=0;i<row;++i)
                        // for (int j=0;j<col;++j)
{r2.next();
   s2[i][0]=r2.getString(1);
   s2[i][1]=r2.getString(2);
}
//System.out.println(row+" "+col+" "+s2[0][0]);
t=new JTable(s2,s1);

}
catch(Exception e){
System.out.println(e);
}
    }
if (a==1){
try {
String url = "jdbc:mysql://localhost:5131/";
            String dbName = "login_passwords";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "poptfs";
           Class.forName(driver).newInstance();
         Connection  con = DriverManager.getConnection(url+dbName,userName,password);
           System.out.println("Driver Loaded");
PreparedStatement p1=con.prepareCall("delete from login_passwords");
p1.executeUpdate();
mr=1;
View_Table(0);
}
catch (Exception e){
System.out.println(e);
  }
    }
}
public static void main(String x[]){
   try {
	    // Set System L&F
        //UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
  }
catch(Exception e){
    System.out.println(e);
}
      if (new Start().z==0){
                  new Error_Order().setVisible(true);}
                else
                  new View_Passwords();
}
}
