/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 * 
 */

/*
 * Del_Protect.java
 *
 * Created on Jul 31, 2010, 3:30:47 AM
 */

/**
 *
 * @author jalatif abhi
 */
import java.awt.Color;
import java.awt.Toolkit;
import java.util.Timer;
import java.util.TimerTask;
import javax.swing.*;
import java.sql.*;
public class Del_Protect extends javax.swing.JFrame {
static int l=3,i1=1,j1=10,k1=5,i,j,k,n=0,max=0,lsk=1,msk=0,del;
static Connection con=null;
Toolkit toolkit;
Timer timer;
    /** Creates new form Del_Protect */
    public Del_Protect(int a) {
        i=i1;j=j1;k=k1;max=i1*60*60+j1*60+k1;del=a;l=3;
        initComponents();
        jLabel5.setText("You have "+l+" tries left");
       
        jpb1.setMaximum(max);
        n=0;
        jpb1.setValue(n);
        
        jpb1.setStringPainted(true);
       jpb1.setForeground(Color.BLUE);
        jpb1.setBorderPainted(true);
        timer=new Timer();
        toolkit=Toolkit.getDefaultToolkit();
        timer.schedule(new tmr(), 0, 1*10);
    }
    class tmr extends TimerTask{
     public void run(){

      if (n==max){
          toolkit.beep();l--;n=-1;
          jLabel5.setText("You have "+l+" tries left");
          jset();
          if (l==0){
              
            timer.cancel();
           joff();
          }
      }
       else{n++;
          jpb1.setValue(n);
       }
    //time figures
        String s4=jl1.getText();
        String s5=jl2.getText();
        String s6=jl3.getText();
        if (s4.equals("   0")&&s5.equals("   0")&&s6.equals("   0"))
        {i=i1;j=j1;k=k1;
            toolkit.beep();

        }
       if (k>=0)
        {
            String s1 = "   "+String.valueOf(i);
            String s2="   "+String.valueOf(j);
            String s3="   "+String.valueOf(k);
            jl1.setText(s1);
            jl2.setText(s2);
            jl3.setText(s3);
            k--;
         }
       else{ if (j>0){
            k=59;j--;toolkit.beep();
            String s1="   "+String.valueOf(i);
            String s2="   "+String.valueOf(j);
            String s3="   "+String.valueOf(k);
            jl1.setText(s1);
            jl2.setText(s2);
            jl3.setText(s3);
            k--;}
 else{ i--;
            j=59;k=59;toolkit.beep();
            String s1="   "+String.valueOf(i);
            String s2="   "+String.valueOf(j);
            String s3="   "+String.valueOf(k);
            jl1.setText(s1);
            jl2.setText(s2);
            jl3.setText(s3);
            k--;
     }
       }

             if (l==0){
             jl1.setText("  0");jl2.setText("  0");jl3.setText("  0");
             }
    }
    }
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
    public void joff(){
    jp1.setBackground(Color.red);jp2.setBackground(Color.red);
    jp3.setBackground(Color.red);jp4.setBackground(Color.red);
    jp1.disable();jp2.disable();jp3.disable();jp4.disable();js1.setBackground(Color.red);
    js1.disable();
    jButton1.disable();jButton1.setVisible(false);
    jpb1.setBackground(Color.red);
    jLabel5.setText("Identity Confirmation failure");
    lsk=1;

    }
    public void jset(){
    jp1.setText(null);jp2.setText(null);jp3.setText(null);jp4.setText(null);
    jp1.requestFocus();
    js1.setValue(0);
    }
    public void jtrus(){
    jp1.setText(null);jp2.setText(null);jp3.setText(null);jp4.setText(null);
    js1.setValue(0);
    jp1.setBackground(Color.GREEN);jp2.setBackground(Color.green);
    jp3.setBackground(Color.green);jp4.setBackground(Color.green);
    jp1.disable();jp2.disable();jp3.disable();jp4.disable();js1.setBackground(Color.green);
    js1.disable();
    jButton1.disable();jButton1.setVisible(false);
    timer.cancel();
    lsk=0;
    }

    /** This method is called from within the constructor to
     * initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is
     * always regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jp1 = new javax.swing.JPasswordField();
        jp2 = new javax.swing.JPasswordField();
        jp3 = new javax.swing.JPasswordField();
        jp4 = new javax.swing.JPasswordField();
        js1 = new javax.swing.JSpinner();
        jButton1 = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jButton2 = new javax.swing.JButton();
        jl2 = new javax.swing.JLabel();
        jl3 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();
        jl1 = new javax.swing.JLabel();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jpb1 = new javax.swing.JProgressBar();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("J");

        jLabel2.setText("A");

        jLabel3.setText("D");

        jLabel4.setText("E");

        js1.setFont(new java.awt.Font("Showcard Gothic", 0, 10));

        jButton1.setText("Authenticate");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        jLabel5.setText("jLabel5");

        jButton2.setText("Finish");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        jl2.setText("jLabel2");

        jl3.setText("jLabel3");

        jLabel8.setText("   MM");

        jLabel9.setText("   SS");

        jl1.setText("jLabel1");

        jLabel11.setText("   MS");

        jLabel12.setText("Time Left");

        jLabel13.setText("Confirm your Identity for proceeding to the requested result");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(61, 61, 61)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 17, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, 142, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 311, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jButton2)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(95, 95, 95)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, 304, Short.MAX_VALUE))
                                .addGroup(layout.createSequentialGroup()
                                    .addComponent(jButton1)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel12, javax.swing.GroupLayout.PREFERRED_SIZE, 54, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGap(37, 37, 37)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl1)
                                        .addComponent(jLabel8))
                                    .addGap(31, 31, 31)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jl2)
                                        .addComponent(jLabel9))
                                    .addGap(40, 40, 40)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addComponent(jLabel11)
                                        .addComponent(jl3)))))
                        .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                            .addGap(301, 301, 301)
                            .addComponent(jpb1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jLabel13, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel1)
                            .addComponent(jp1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(jp2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(jp3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(jp4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(js1, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel5))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jpb1, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jButton1)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jl1)
                                        .addComponent(jl2)
                                        .addComponent(jl3))
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel9)
                                        .addComponent(jLabel11)
                                        .addComponent(jLabel8)))
                                .addComponent(jLabel12, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addContainerGap(22, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 260, Short.MAX_VALUE)
                        .addComponent(jButton2))))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
String s[]=new String[4];
s[0]=jp1.getText();
s[1]=jp2.getText();
s[2]=jp3.getText();
s[3]=jp4.getText();
try{
int a=(Integer)js1.getValue();
if (s[0].equals("JalTheBand")&&s[1].equals("AB De Villiers")&&s[2].equals("Dastan")&&s[3].equals("Ezio Auditorre")&&a==51){
jLabel5.setText("Identity Confirmed");
lsk=0;
jtrus();

}
 else{
jset();
  l--;n=-1;toolkit.beep();
      jpb1.setValue(0);
      i=i1;j=j1;k=k1;
  if (l==0){n=0;
      jpb1.setValue(0);
      jl1.setText("  0");jl2.setText("  0");jl3.setText("  0");
   timer.cancel();
   toolkit.beep();
   joff();
    }
  jLabel5.setText("You have "+l+" tries left");
 }
        }
catch(Exception e){}
        // TODO add your handling code here:
    }//GEN-LAST:event_jButton1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
if (lsk==0){
    msk=1;
setVisible(false);timer.cancel();
if(del==1){
setVisible(false);
 new View_Passwords().setVisible(true);
}
if (del==2){
 connect();
try{
    PreparedStatement p=con.prepareCall("delete from questions");
    p.executeUpdate();
    new View_Questions().setVisible(true);
}
catch(Exception e){
    System.out.println(e);
}
}
if (del==3){
setVisible(false);
new View_Information().setVisible(true);

}



}
 else{
    msk=-1;
 setVisible(false);timer.cancel();
new Adminstrator_Field().setVisible(true);
 }
System.out.println(msk);

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
                new Del_Protect(0).setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JLabel jl1;
    private javax.swing.JLabel jl2;
    private javax.swing.JLabel jl3;
    private javax.swing.JPasswordField jp1;
    private javax.swing.JPasswordField jp2;
    private javax.swing.JPasswordField jp3;
    private javax.swing.JPasswordField jp4;
    private javax.swing.JProgressBar jpb1;
    private javax.swing.JSpinner js1;
    // End of variables declaration//GEN-END:variables

}
