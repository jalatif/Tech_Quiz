/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalatif abhi
 */
import java.io.*;
public class Test_Timer {
static int i,j,k;static int tm[]=new int[3];
public Test_Timer(){
Set_Time obj=new Set_Time();
i=obj.tm[0];j=obj.tm[1];k=obj.tm[2];
try{
PrintWriter p=new PrintWriter("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//def.txt");
FileWriter f=new FileWriter("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//def.txt",true);
String s[]={String.valueOf(i),String.valueOf(j),String.valueOf(k)};
p.write("Don't Change the Below Data");
p.println();
p.printf("Hours---%d",i);p.println();
p.printf("Minutes---%d",j);p.println();
p.printf("Seconds---%d",k);p.println();
        //+s[0]+'\n'+s[1]+"\n"+s[2]);
p.flush();
}
catch(Exception e){
    System.out.println(e.getMessage());
}
}
public Test_Timer(int a){
try{
BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("//home//jalatif//programs//NetBeans_Projects_Dir//NetBeansProjects//def.txt")));
br.readLine();
int i=0;String ss="";
while((ss=br.readLine())!=null){
StringBuffer obj=new StringBuffer(ss);
obj.reverse();
ss=obj.toString();
String y[]=ss.split("---");
ss=y[0];
StringBuffer obj1=new StringBuffer(ss);
obj1.reverse();
ss=obj1.toString();
tm[i++]=Integer.parseInt(ss);
}
}
catch(Exception e){
    System.out.println(e);
}
System.out.println(tm[0]+" "+tm[1]+" "+tm[2]);
}
}
/*class Reder{
static int tm[]=new int[3];
public Reder(){
try{
BufferedReader br=new BufferedReader(new InputStreamReader(new FileInputStream("C://Users//jalatif abhi//Documents//NetBeansProjects//def.txt")));
br.readLine();
int i=0;String ss="";
while((ss=br.readLine())!=null){
StringBuffer obj=new StringBuffer(ss);
obj.reverse();
ss=obj.toString();
String y[]=ss.split("---");
ss=y[0];
StringBuffer obj1=new StringBuffer(ss);
obj1.reverse();
ss=obj1.toString();
tm[i++]=Integer.parseInt(ss);
}
}
catch(Exception e){
    System.out.println(e);
}
System.out.println(tm[0]+" "+tm[1]+" "+tm[2]);
}
}*/
