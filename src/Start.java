/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalatif abhi
 */
import java.awt.*;
import javax.swing.*;
import sun.audio.*;
import java.io.*;
import java.awt.event.*;
public class Start extends JFrame implements ActionListener{//implements Runnable{
static int x=70,y=300,z1=1364,z2=720,z=0;
static int r=255,g=0,b=0;
static String msg=" Welcome to Jalatif's Program ";
static Color c=new Color(r,g,b);
JButton b1=new JButton("Enter");
static AudioStream as;
public Start(){
super("Banner");
setSize(z1,z2);
setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
setLayout(null);
b1.setBounds(z1-400,z2-70,120,30);
      b1.setForeground(Color.black);
add(b1);
b1.addActionListener(this);
//setVisible(true);
try{InputStream in=new FileInputStream("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//Bhulana Nahi.wav");
    if (z==2){
     in=new FileInputStream("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//Bhulana Nahi.wav");}
 else{
     in=new FileInputStream("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//yaad aaonga.wav");}
  as=new AudioStream(in);
 AudioPlayer.player.start(as);
 }
 catch (Exception e){
System.out.println(e);
 }
}
 /* public void init()
	{
	setFont(new Font("Arial Black",Font.BOLD,50));
	c=new Color(255,0,0);
	new Thread(this).start();
	}*/
@Override public void paint(Graphics gr){
    super.paint(gr);
    gr.setColor(c);
    gr.fillRect(0,0,z1,z2-50);//, y, WIDTH, g)
    gr.setColor(Color.BLACK);
    gr.setFont(new Font("Arial Black",Font.BOLD,70));
    gr.drawString(msg,x,y);
    try{
    Thread.sleep(400);
}
catch(Exception e){
    System.out.println(e);
}
msg=msg.substring(1)+msg.substring(0,1);
		r=(int)(Math.random()*255);
		g=(int)(Math.random()*255);
		b=(int)(Math.random()*255);
		c=new Color(r,g,b);
		repaint();

 }
public void actionPerformed(ActionEvent e){
AudioPlayer.player.stop(as);
z=1;
setVisible(false);
new Choose_Type().setVisible(true);
}
public static void main(String x[]){
   try {
	    // Set System L&F
        //UIManager.setLookAndFeel( UIManager.getSystemLookAndFeelClassName());
  }
catch(Exception e){
    System.out.println(e);
}
   z=2;
   new Start().setVisible(true);
}
}


