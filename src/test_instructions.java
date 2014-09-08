/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/*
 * test_instructions.java
 *
 * Created on Jul 13, 2010, 4:00:55 AM
 */

/**
 *
 * @author jalatif abhi
 */
import java.util.Timer;
import java.util.TimerTask;
import java.awt.Toolkit;
import javax.swing.*;
public class test_instructions extends javax.swing.JFrame {
Toolkit toolkit;
Timer timer;
static int i=0,j=0,k=10;
static int i1,j1,k1,n=new question_set().qnos;

    /** Creates new form test_instructions */
    public test_instructions() {
        initComponents();
        setSize(640,600);
        setTitle("Test Instructions");
        
        toolkit=Toolkit.getDefaultToolkit();
        timer=new Timer();
        timer.schedule(new CountDownTimer(),0,1*1000);
       Test_Timer obj=new Test_Timer(1);
       i1=obj.tm[0];j1=obj.tm[1];k1=obj.tm[2];
    jLabel2.setText("       You  have "+j+" min "+k+" sec to read it.After that Test will Automatically start.");
    jTextArea1.setText("                      Test Information\n1.Test will contain "+n+" Questions with 1 mark each.\n2.Test will be of --->> "+i1+" hours "+j1+" minutes "+k1+" seconds.\n3.Each Question has 4 Choices with only 1 Correct.\n4.All the Questions are compulsory.\n5.There is no negative marking.\n6.You will have to score more than "+n/2 +" marks out of "+n+" to pass the test.\n                   How to Answer \n1.Select the Answer by Left-Clicking in Small Circle \n   provided against the option you think is correct.\n2.Left Click 'Next' Button to go to Next Question and\n  'Previous' Button to go to Previous Question Or you\n  can use 'Jump to' to go to any Question.\n3.Click on 'Finish' Button to finish the test.\n4.There is a small Field below 'Jump' which shows the\n  Question you have not yet marked. \n5.Time Window is Running at The Bottom Right.\n6.After Completion of time your test will automatically\n   be finished and result window will appear.\n7.Click on 'Finish' to submit your Result.\n");
      }
   class CountDownTimer extends TimerTask{
     public void run(){
        String s4=jLabel4.getText();
        String s5=jLabel5.getText();
        String s6=jLabel6.getText();
        if (s4.equals("   0")&&s5.equals("   0")&&s6.equals("   0"))
        {
            toolkit.beep();
            toolkit.beep();

           timer.cancel();
             k=0;
             setVisible(false);
           new question_paper().setVisible(true);
        }
       if (k>=0)
        {
            String s1 = "   "+String.valueOf(i);
            String s2="   "+String.valueOf(j);
            String s3="   "+String.valueOf(k);
            jLabel4.setText(s1);
            jLabel5.setText(s2);
            jLabel6.setText(s3);
            k--;
         }
       else{
            k=59;j--;toolkit.beep();
            String s1="   "+String.valueOf(i);
            String s2="   "+String.valueOf(j);
            String s3="   "+String.valueOf(k);
            jLabel4.setText(s1);
            jLabel5.setText(s2);
            jLabel6.setText(s3);
            k--;
       }

      }
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
        jScrollPane1 = new javax.swing.JScrollPane();
        jTextArea1 = new javax.swing.JTextArea();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jLabel9 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Read the test Instructions Below Carefully");

        jLabel2.setText("       You  have 1 min to read it.After 1 minute Test will Automatically start.");

        jTextArea1.setColumns(22);
        jTextArea1.setEditable(false);
        jTextArea1.setRows(7);
        jTextArea1.setText("                      Test Information \n1.Test will contain 5 Questions with 1 mark each.\n2.Test will be of two minutes.\n3.Each Question has 4 Choices with only 1 Correct.\n4.All the Questions are compulsory.\n5.There is no negative marking.\n6.You will need more than 50% marks to pass the test.\n                   How to Answer \n1.Select the Answer by Left-Clicking in Small Circle \n   provided against the option you think is correct.\n2.Left Click \"Next\" Button to go to Next Question and\n  \"Previous\" Button to go to Previous Question Or you\n  can use \"Jump to\" to go to any Question.\n3.Click on \"Finish\" Button to finish the test.\n4.There is a small Field below \"Jump\" which shows the\n  Question you have not yet marked. \n5.Time Window is Running at The Bottom Right.\n6.After Completion of time your test will automatically\n   be finished and result window will appear.\n7.Click on \"Finish\" to submit your Result.\n");
        jScrollPane1.setViewportView(jTextArea1);

        jLabel3.setText("Time Left");

        jLabel4.setText("jLabel4");

        jLabel5.setText("jLabel5");

        jLabel6.setText("jLabel6");

        jLabel7.setText("   HH");

        jLabel8.setText("   MM");

        jLabel9.setText("   SS");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(138, 138, 138)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 246, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(210, 210, 210)
                        .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 61, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel4)
                                .addGap(18, 18, 18)
                                .addComponent(jLabel5))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(jLabel7)
                                .addGap(26, 26, 26)
                                .addComponent(jLabel8)))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(jLabel2, javax.swing.GroupLayout.DEFAULT_SIZE, 458, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.LEADING, layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 476, Short.MAX_VALUE)))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 14, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel2)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 388, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jLabel4)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(jLabel8)
                    .addComponent(jLabel9))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

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
              if (new login_test().y1==0)
        {
         new test_instructions().setVisible(false);
         new Error_Order().setVisible(true); }
 else
                new test_instructions().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextArea jTextArea1;
    // End of variables declaration//GEN-END:variables

}
