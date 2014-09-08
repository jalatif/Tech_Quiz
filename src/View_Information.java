/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * View_Information.java
 *
 * Created on Jul 15, 2010, 5:23:58 AM
 */

/**
 *
 * @author jalatif abhi
 */import java.sql.*;
import java.util.*;
import java.io.*;
import javax.swing.*;
public class View_Information extends javax.swing.JFrame {
static Connection con=null;
static Vector v1=new Vector(0);
static Vector v2=new Vector(0);
static Vector v3=new Vector(0);
static Vector v4=new Vector(0);
static Vector v5=new Vector(0);
static Vector v6=new Vector(0);
static Vector v7=new Vector(0);
static Vector v8=new Vector(0);
static Vector v9=new Vector(0);
static Vector v10=new Vector(0);
static Vector v11=new Vector(0);
static Vector v12=new Vector(0);
static int y[]={25,10,15,10,34,20,25,10,8,15,25,50};
static String w[]={"Name","SID","Marks","Result","College","DOB","Father_Name","Gender","Year","Contact_No","Email_Id","Permanent_Address"};
static Vector v=new Vector(0);
static StringBuffer h=new StringBuffer(0);
static int x=1,xyz=0;
/** * Creates new form View_Information */
/*Name char(25),SID char(10),Marks char(15),Result char(6),
 College char(34),DOB char(10),Father_Name char(25),Gender char(05),
 Year char(08),Contact_No char(12),Email_Id char(25),
 Permanent_Address char(50)
 *
 *
 */
  public View_Information() {
        initComponents();
        setTitle("Required_TEst_Information");
        setSize(1300,700);
        required_information();
        //view_information(0);
         view_information(new Adminstrator_Field().zx);
        //jTable1.getModel().setValueAt("abh", 1, 1);
    }

  public String initial_text(){
     for (int i=0;i<12;i++){
     h.append(w[i]);
     space_insert(x,w[i]);
     x++;
     }
     System.out.println(h);
     return (String.valueOf(h));

  }
  public void space_insert(int a,String b){
  int c=y[a-1]-b.length();
  //StringBuffer g=new StringBuffer(0);
  for (int i=0;i<c;i++){
  h.append(" ");
  }
  h.append("  ");
 //String f=String.valueOf(g);
 //System.out.println(f);
 //h.append(f);
  }

  public void connect(){
   try{
       String url = "jdbc:mysql://localhost:5131/";
            String dbName = "tech_quiz_project";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "poptfs";
           Class.forName(driver).newInstance();
           con = DriverManager.getConnection(url+dbName,userName,password);
           System.out.println("Driver Loaded");
   }
   catch(Exception e){
       System.out.println(e);
   }
 }
 public void required_information(){
connect();
try{
PreparedStatement p=con.prepareCall("select * from  tech_quiz");
ResultSet r=p.executeQuery();
/*Name char(25),SID char(10),Marks char(15),Result char(6),College char(34)
 ,DOB char(10),Father_Name char(25),Gender char(05),
 Year char(08),Contact_No char(12),Email_Id char(25),
 Permanent_Address char(50)*/
v1.removeAllElements();
v2.removeAllElements();
v3.removeAllElements();
v4.removeAllElements();
v5.removeAllElements();
v6.removeAllElements();
v7.removeAllElements();
v8.removeAllElements();
v9.removeAllElements();
v10.removeAllElements();
v11.removeAllElements();
v12.removeAllElements();
while (r.next()){
v1.add(r.getString(w[0]));
v2.add(r.getString(w[1]));
v3.add(r.getString(w[2]));
v4.add(r.getString(w[3]));
v5.add(r.getString(w[4]));
v6.add(r.getString(w[5]));
v7.add(r.getString(w[6]));
v8.add(r.getString(w[7]));
v9.add(r.getString(w[8]));
v10.add(r.getString(w[9]));
v11.add(r.getString(w[10]));
v12.add(r.getString(w[11]));
System.out.println(v1);
 }
for (int i=0;i<v1.size();i++){
String z=String.valueOf(v1.elementAt(i));
String y[]=z.split("  ");
v1.setElementAt(y[0], i);
}
for (int i=0;i<v2.size();i++){
String z=String.valueOf(v2.elementAt(i));
String y[]=z.split("  ");
v2.setElementAt(y[0], i);
}for (int i=0;i<v3.size();i++){
String z=String.valueOf(v3.elementAt(i));
String y[]=z.split("  ");
v3.setElementAt(y[0], i);
}for (int i=0;i<v4.size();i++){
String z=String.valueOf(v4.elementAt(i));
String y[]=z.split("  ");
v4.setElementAt(y[0], i);
}for (int i=0;i<v5.size();i++){
String z=String.valueOf(v5.elementAt(i));
String y[]=z.split("  ");
v5.setElementAt(y[0], i);
}for (int i=0;i<v6.size();i++){
String z=String.valueOf(v6.elementAt(i));
String y[]=z.split("  ");
v6.setElementAt(y[0], i);
}for (int i=0;i<v7.size();i++){
String z=String.valueOf(v7.elementAt(i));
String y[]=z.split("  ");
v7.setElementAt(y[0], i);
}for (int i=0;i<v8.size();i++){
String z=String.valueOf(v8.elementAt(i));
String y[]=z.split("  ");
v8.setElementAt(y[0], i);
}for (int i=0;i<v9.size();i++){
String z=String.valueOf(v9.elementAt(i));
String y[]=z.split("  ");
v9.setElementAt(y[0], i);
}for (int i=0;i<v10.size();i++){
String z=String.valueOf(v10.elementAt(i));
String y[]=z.split("  ");
v10.setElementAt(y[0], i);
}for (int i=0;i<v11.size();i++){
String z=String.valueOf(v11.elementAt(i));
String y[]=z.split("  ");
v11.setElementAt(y[0], i);
}for (int i=0;i<v12.size();i++){
String z=String.valueOf(v12.elementAt(i));
String y[]=z.split("  ");
v12.setElementAt(y[0], i);
}
String sp=String.valueOf(v1.elementAt(0));
System.out.println(sp+"a"+sp.length());
}
 catch(Exception e){
 System.out.println(e);
 }
 }
public void view_information(int a){
if (a==0){             // All Print
for (int i=0;i<v4.size();i++){
 String u[]={String.valueOf(v1.elementAt(i)),String.valueOf(v2.elementAt(i)),String.valueOf(v3.elementAt(i)),String.valueOf(v4.elementAt(i)),String.valueOf(v5.elementAt(i)),String.valueOf(v6.elementAt(i)),String.valueOf(v7.elementAt(i)),String.valueOf(v8.elementAt(i)),String.valueOf(v9.elementAt(i)),String.valueOf(v10.elementAt(i)),String.valueOf(v11.elementAt(i)),String.valueOf(v12.elementAt(i))};
 for (int j=0;j<12;++j){
     System.out.println(u[j]+"a"+u[j].length());
  jTable1.getModel().setValueAt(u[j], i+1, j+1);
    }
jTable1.getModel().setValueAt(i+1, i+1, 0);
}
if (xyz==0)
jLabel1.setText("All Students Databse Information");
}
Adminstrator_Field o=new Adminstrator_Field();
if (a==1){
connect();
try{
PreparedStatement p=con.prepareCall("select * from  tech_quiz where Name=?");
p.setString(1,o.s+" ");
ResultSet r=p.executeQuery();
//p.executeUpdate();
int j=0;
while(r.next()){
    String u[]={r.getString(w[0]),r.getString(w[1]),r.getString(w[2]),r.getString(w[3]),r.getString(w[4]),r.getString(w[5]),r.getString(w[6]),r.getString(w[7]),r.getString(w[8]),r.getString(w[9]),r.getString(w[10]),r.getString(w[11])};
   jTable1.getModel().setValueAt(++j,j,0);
    for (int i=0;i<12;++i){
    jTable1.getModel().setValueAt(u[i], j, i+1);
    }
}
if (j==0){
  jLabel1.setText(o.s + "'s Database Information not found");
}
    else
        jLabel1.setText(o.s + "'s Database Information ");
}
catch(Exception e){
  System.out.println(e);
}
}
if (a==2){
connect();
try{
PreparedStatement p=con.prepareCall("select * from  tech_quiz where Result=?");
p.setString(1,o.s+" ");
ResultSet r=p.executeQuery();
//p.executeUpdate();
int j=0;
while(r.next()){
    String u[]={r.getString(w[0]),r.getString(w[1]),r.getString(w[2]),r.getString(w[3]),r.getString(w[4]),r.getString(w[5]),r.getString(w[6]),r.getString(w[7]),r.getString(w[8]),r.getString(w[9]),r.getString(w[10]),r.getString(w[11])};
   jTable1.getModel().setValueAt(++j,j,0);
    for (int i=0;i<12;++i){
    jTable1.getModel().setValueAt(u[i], j, i+1);
    }
}
if (j==0){
jLabel1.setText("Database Information having Result = "+o.s+" not found"); 
}
    else
        jLabel1.setText("Database Information having Result = "+o.s);

//jLabel1.setText("Database Information having Result = "+o.s);
}
catch(Exception e){
  System.out.println(e);
}
}
if (a==3){
connect();
try{
PreparedStatement p=con.prepareCall("select * from  tech_quiz where SID=?");
p.setString(1,o.s+" ");
ResultSet r=p.executeQuery();
//p.executeUpdate();
int j=0;
while(r.next()){
    String u[]={r.getString(w[0]),r.getString(w[1]),r.getString(w[2]),r.getString(w[3]),r.getString(w[4]),r.getString(w[5]),r.getString(w[6]),r.getString(w[7]),r.getString(w[8]),r.getString(w[9]),r.getString(w[10]),r.getString(w[11])};
   jTable1.getModel().setValueAt(++j,j,0);
    for (int i=0;i<12;++i){
    jTable1.getModel().setValueAt(u[i], j, i+1);
    }
}
if (j==0)
jLabel1.setText("Database Information having SID = "+o.s+" not found");
else
jLabel1.setText("Database Information having SID = "+o.s);
//jLabel1.setText("Database Information having SID = "+o.s);

}
catch(Exception e){
  System.out.println(e);
}
}
if (a==4){
connect();
try{
PreparedStatement p=con.prepareCall("select * from  tech_quiz where College=?");
p.setString(1,o.s+" ");
ResultSet r=p.executeQuery();
//p.executeUpdate();
int j=0;
while(r.next()){
    String u[]={r.getString(w[0]),r.getString(w[1]),r.getString(w[2]),r.getString(w[3]),r.getString(w[4]),r.getString(w[5]),r.getString(w[6]),r.getString(w[7]),r.getString(w[8]),r.getString(w[9]),r.getString(w[10]),r.getString(w[11])};
   jTable1.getModel().setValueAt(++j,j,0);
    for (int i=0;i<12;++i){
    jTable1.getModel().setValueAt(u[i], j, i+1);
    }
}
if (j==0)
    jLabel1.setText("Database Information of students of college = "+o.s+" not found");
        else
    jLabel1.setText("Database Information of students of college = "+o.s);
}
catch(Exception e){
  System.out.println(e);
}
}
if (a==6){
connect();
try{
PreparedStatement p=con.prepareCall("Delete tech_quiz where Name=?");
p.setString(1,o.s+" ");
//ResultSet r=p.executeQuery();
p.executeUpdate();
if(v1.contains(o.s))
jLabel1.setText("Database Information of Students with name = "+o.s+ " Deleted");
else
jLabel1.setText("Database Information of Students with name = "+o.s+ " not found");
//jLabel1.setText("Database Information of Students with name = "+o.s+ "Deleted");
xyz=1;
view_information(0);
}
catch(Exception e){
  System.out.println(e);
}
}
if (a==7){
connect();
try{
PreparedStatement p=con.prepareCall("Delete tech_quiz where SID=?");
p.setString(1,o.s+" ");
//ResultSet r=p.executeQuery();
p.executeUpdate();
if (v2.contains(o.s))
jLabel1.setText("Database Information of Students with SID = "+o.s+ "Deleted");
else
jLabel1.setText("Database Information of Students with SID = "+o.s+ " not found");
xyz=1;
view_information(0);
}
catch(Exception e){
  System.out.println(e);
}
}
if (a==5){
connect();
try{
PreparedStatement p=con.prepareCall("Delete from tech_quiz");
//p.setString(1,"naman kumar"+" ");
//ResultSet r=p.executeQuery();
p.executeUpdate();
if (v1.size()!=0)
    jLabel1.setText("Database Information of all Students Deleted");
else
    jLabel1.setText("Database Information of any Student not found");
}
catch(Exception e){
  System.out.println(e);
}
}














}

    /** Creates new form View_Information */
  

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jTable1 = new javax.swing.JTable();
        jButton1 = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jTable1.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null, null, null, null, null, null}
            },
            new String [] {
                "SNo.", "Name", "SID", "Marks", "Result", "College", "DOB", "Father_Name", "Gender", "Year", "Contact_No", "Email_Address", "Permanent_Address"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        jTable1.setColumnSelectionAllowed(true);
        jTable1.getTableHeader().setReorderingAllowed(false);
        jScrollPane1.setViewportView(jTable1);
        jTable1.getColumnModel().getSelectionModel().setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jTable1.getColumnModel().getColumn(0).setPreferredWidth(30);
        jTable1.getColumnModel().getColumn(1).setPreferredWidth(100);
        jTable1.getColumnModel().getColumn(2).setPreferredWidth(60);
        jTable1.getColumnModel().getColumn(7).setPreferredWidth(100);

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jButton2.setText("Exit");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jLabel1.setText("            Student's Information Database ");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 294, Short.MAX_VALUE)
                .addComponent(jButton2))
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
            .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(2, 2, 2)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
new Adminstrator_Field().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
setVisible(false);
System.exit(1);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
    * @param args the command line arguments
    */
    public static void main(String args[]) {
      try {
	    // Set System L&F
        //UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
  }
catch(Exception e){
    System.out.println(e);
}
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                if (new Start().z==0){
                 new Error_Order().setVisible(true);}
                else
                new View_Information().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTable jTable1;
    // End of variables declaration//GEN-END:variables

}
