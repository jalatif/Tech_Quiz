/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * Edit_Question.java
 *
 * Created on Jul 27, 2010, 2:40:06 AM
 */

/**
 *
 * @author jalatif abhi
 */
import java.sql.*;
import javax.swing.*;
public class Edit_Question extends javax.swing.JFrame {
static int z[]={0,0,0,0,0,0,0};
static Connection con=null;
static String st[]=new String[7];
static int n,an,q;
static String s[]=new String[5];
    /** Creates new form Edit_Question */
    public Edit_Question() {
        initComponents();
        setTitle("Edit Question");
        setSize(900,600);
        View_Questions obj=new View_Questions();
        for (int is=1;is<7;is++){
         st[is]=obj.st[is];
         //System.out.println(st[is]);
        }
        int n=Integer.parseInt(obj.st[0]);
        //System.out.println(n);
        jTextField0.setText(st[1]);
        jTextField1.setText(st[2]);
        jTextField2.setText(st[3]);
        jTextField3.setText(st[4]);
        jTextField4.setText(st[5]);
        button_mark(Integer.parseInt(st[6]));
        jLabel5.setText(null);
        jLabel6.setText("Write QuesNo. "+n+" here");
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        buttonGroup1 = new javax.swing.ButtonGroup();
        jLabel7 = new javax.swing.JLabel();
        jRadioButton1 = new javax.swing.JRadioButton();
        jLabel6 = new javax.swing.JLabel();
        jTextField0 = new javax.swing.JTextField();
        jButton3 = new javax.swing.JButton();
        jComboBox1 = new javax.swing.JComboBox();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jTextField4 = new javax.swing.JTextField();
        jRadioButton4 = new javax.swing.JRadioButton();
        jLabel1 = new javax.swing.JLabel();
        jRadioButton2 = new javax.swing.JRadioButton();
        jRadioButton3 = new javax.swing.JRadioButton();
        jLabel4 = new javax.swing.JLabel();
        jTextField1 = new javax.swing.JTextField();
        jTextField2 = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jTextField3 = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel7.setText("Answer:-");

        buttonGroup1.add(jRadioButton1);
        jRadioButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton1ActionPerformed(evt);
            }
        });

        jLabel6.setText("Write Question here:--");

        jTextField0.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jTextField0ActionPerformed(evt);
            }
        });

        jButton3.setText("Finish");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Ans", "1", "2", "3", "4" }));
        jComboBox1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jComboBox1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jButton2.setText("Save Changes to Database");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton4);
        jRadioButton4.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton4ActionPerformed(evt);
            }
        });

        jLabel1.setText("1)");

        buttonGroup1.add(jRadioButton2);
        jRadioButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton2ActionPerformed(evt);
            }
        });

        buttonGroup1.add(jRadioButton3);
        jRadioButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jRadioButton3ActionPerformed(evt);
            }
        });

        jLabel4.setText("4)");

        jLabel2.setText("3)");

        jLabel3.setText("2)");

        jButton1.setText("Back");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTextField0, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, 560, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jRadioButton3))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jRadioButton1)))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jTextField3)
                            .addComponent(jTextField1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel3))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jRadioButton4)
                            .addComponent(jRadioButton2)))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton2)
                        .addGap(196, 196, 196)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextField4, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jTextField2, javax.swing.GroupLayout.DEFAULT_SIZE, 52, Short.MAX_VALUE)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
            .addGroup(layout.createSequentialGroup()
                .addComponent(jButton1)
                .addGap(156, 156, 156)
                .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 249, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                .addComponent(jButton3)
                .addGap(19, 19, 19))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(502, Short.MAX_VALUE))
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(415, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jTextField0, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(9, 9, 9)
                .addComponent(jLabel7)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addComponent(jLabel1)
                        .addComponent(jRadioButton1))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jTextField1, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                                        .addGap(48, 48, 48)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                                .addComponent(jLabel2)
                                                .addComponent(jRadioButton3))
                                            .addGroup(layout.createSequentialGroup()
                                                .addGap(1, 1, 1)
                                                .addComponent(jTextField3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                                .addGap(18, 18, 18))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3)
                                .addGap(73, 73, 73))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jRadioButton2)
                                    .addComponent(jTextField2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(27, 27, 27)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(1, 1, 1)
                                        .addComponent(jLabel4))
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(jTextField4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(jRadioButton4)))))
                        .addGap(20, 20, 20)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jButton2)
                            .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(16, 16, 16)))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jButton3))
                        .addContainerGap())
                    .addComponent(jButton1)))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents
        public void connect(){
              try
        {String url = "jdbc:mysql://localhost:5131/";
            String dbName = "Test_Questions";
            String driver = "com.mysql.jdbc.Driver";
            String userName = "root";
            String password = "poptfs";
           Class.forName(driver).newInstance();
           con = DriverManager.getConnection(url+dbName,userName,password);
           System.out.println("Driver Loaded");
            
        }
        catch (Exception e)
        {System.out.println(e);
        }
    }
    public int button_assign(){
    if (jRadioButton1.isSelected()){
    jComboBox1.setSelectedIndex(1);jLabel5.setText(null);
        return 1;
    }
    if (jRadioButton2.isSelected()){
    jComboBox1.setSelectedIndex(2);jLabel5.setText(null);
        return 2;
    }
    if (jRadioButton3.isSelected()){
    jComboBox1.setSelectedIndex(3);jLabel5.setText(null);
        return 3;
    }
    if (jRadioButton4.isSelected())
    {
        jComboBox1.setSelectedIndex(4);jLabel5.setText(null);
    return 4;}
      else
    {
        jLabel5.setText(null);return 0;
        }
    }
    public void button_mark(int a){
        if (a==1){
         jRadioButton1.setSelected(true);
        }
                if (a==2){
         jRadioButton2.setSelected(true);
        }
                if (a==3){
         jRadioButton3.setSelected(true);
        }
                if (a==4){
         jRadioButton4.setSelected(true);
        }
    }
    public void update_database(){
 connect();
 try{
PreparedStatement p1=con.prepareCall("Delete from questions where QNO="+n);
p1.executeUpdate();
/*PreparedStatement p=con.prepareCall("insert into questions values(?,?,?,?,?,?,?)");
//PreparedStatement p=con.prepareCall("UPDATE questions SET QNO=?,QUES=?,OP1=?,OP2=?,OP3=?,OP4=?,ANS=? WHERE QNO="+n);
 p.setInt(1,n);
 p.setString(2,s[0]);
 p.setString(3,s[1]);
 p.setString(4,s[2]);
 p.setString(5,s[3]);
 p.setString(6,s[4]);
 p.setInt(7,an);
 p.executeUpdate();*/
 jLabel5.setText("Question Modified in Database");
 }
 catch(Exception e){
  System.out.println(e);
 }   
    }
public void modify_ques(){
View_Questions obj=new View_Questions();
    q=Integer.parseInt(obj.st[0]);;
s[0]=jTextField0.getText();
s[1]=jTextField1.getText();
s[2]=jTextField2.getText();
s[3]=jTextField3.getText();
s[4]=jTextField4.getText();
an=button_assign();
setVisible(false);
    //System.out.println(s[0]);
    /*System.out.println(s[1]);
    System.out.println(s[2]);
    System.out.println(s[3]);
    System.out.println(s[4]);
    System.out.println(Integer.parseInt(s[5]));*/
//update_database();
}
    public void combo_mark(){
try{
    int a=Integer.parseInt(String.valueOf(jComboBox1.getSelectedItem()));
 if (a==1){
         jRadioButton1.setSelected(true);jLabel5.setText(null);
        }
                if (a==2){
         jRadioButton2.setSelected(true);jLabel5.setText(null);
        }
                if (a==3){
         jRadioButton3.setSelected(true);jLabel5.setText(null);
        }
                if (a==4){
         jRadioButton4.setSelected(true);jLabel5.setText(null);
        }
}
catch(Exception e){
    System.out.println(e);
    jLabel5.setText("Invalid Answer");
}
}
    private void jRadioButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton1ActionPerformed
button_assign();        // TODO add your handling code here:
}//GEN-LAST:event_jRadioButton1ActionPerformed

    private void jTextField0ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jTextField0ActionPerformed
        // TODO add your handling code here:
}//GEN-LAST:event_jTextField0ActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        setVisible(false);
        System.exit(1);    // TODO add your handling code here:
}//GEN-LAST:event_jButton3ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if (button_assign()!=0){
jComboBox1.setSelectedIndex(button_assign());
}
if (String.valueOf(jComboBox1.getSelectedItem())=="Ans"){
jLabel5.setText("Please Select an Answer");
z[0]=1;
}
 else
     z[0]=0;
if (jTextField0.getText().length()<4){
jLabel5.setText("Please Enter a Question");
z[1]=1;
}
 else
     z[1]=0;
if (jTextField1.getText().length()==0){
jLabel5.setText("Please Enter all the options");
z[2]=1;
}
 else
     z[2]=0;
if (jTextField2.getText().length()==0){
jLabel5.setText("Please Enter all the options");
z[3]=1;
}
 else
     z[3]=0;
if (jTextField3.getText().length()==0){
jLabel5.setText("Please Enter all the options");
z[4]=1;
}
 else
     z[4]=0;
if (jTextField4.getText().length()==0){
jLabel5.setText("Please Enter all the options");
z[5]=1;
}
 else
{
    z[5] = 0;
        }
if (z[0]==1||z[1]==1||z[2]==1||z[3]==1||z[4]==1||z[5]==1){

}
 else{
    z[0]=0;z[1]=0;z[2]=0;z[3]=0;z[4]=0;z[5]=0;
jLabel5.setText(null);
   modify_ques();
 }



        // TODO add your handling code here:
}//GEN-LAST:event_jButton2ActionPerformed

    private void jComboBox1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jComboBox1ActionPerformed
combo_mark();
// TODO add your handling code here:
    }//GEN-LAST:event_jComboBox1ActionPerformed

    private void jRadioButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton2ActionPerformed
button_assign();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton2ActionPerformed

    private void jRadioButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton3ActionPerformed
button_assign();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton3ActionPerformed

    private void jRadioButton4ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jRadioButton4ActionPerformed
button_assign();        // TODO add your handling code here:
    }//GEN-LAST:event_jRadioButton4ActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
setVisible(false);
//new View_Questions().setVisible(true);
// TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed
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
                new Edit_Question().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JComboBox jComboBox1;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JRadioButton jRadioButton1;
    private javax.swing.JRadioButton jRadioButton2;
    private javax.swing.JRadioButton jRadioButton3;
    private javax.swing.JRadioButton jRadioButton4;
    private javax.swing.JTextField jTextField0;
    private javax.swing.JTextField jTextField1;
    private javax.swing.JTextField jTextField2;
    private javax.swing.JTextField jTextField3;
    private javax.swing.JTextField jTextField4;
    // End of variables declaration//GEN-END:variables

}
