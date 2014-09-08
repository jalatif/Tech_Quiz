/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author jalatif abhi
 */
import java.sql.*;
import java.util.*;
public class question_set {
static Connection con=null;
static String d[];
static String e[][];
static int s[];
static int ans[];
static Vector v0=new Vector(0);
static Vector v1=new Vector(0);
static Vector v2=new Vector(0);
static Vector v3=new Vector(0);
static Vector v4=new Vector(0);
static Vector n1=new Vector(0);
static Vector n2=new Vector(0);
static int qnos=0;
public question_set(){
//put_questions();
//set_question_paper();
try{
    String url = "jdbc:mysql://localhost:5131/";
            String dbName = "Test_Questions";
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
    try{
    PreparedStatement p=con.prepareCall("select * from questions order by QNo");
    ResultSet r=p.executeQuery();

v0.removeAllElements();v1.removeAllElements();v2.removeAllElements();
v3.removeAllElements();v4.removeAllElements();n1.removeAllElements();
n2.removeAllElements();

while (r.next()){
n1.add(r.getInt(1));
v0.add(r.getString(2));
v1.add(r.getString(3));
v2.add(r.getString(4));
v3.add(r.getString(5));
v4.add(r.getString(6));
n2.add(r.getInt(7));
}
//System.out.println(v0);
//for (int j=1;j<5;++j){
for (int i=0;i<v0.size();i++){
String z=String.valueOf(v0.elementAt(i));
String y[]=z.split("   ");
v0.setElementAt(y[0], i);
}
//}
for (int i=0;i<v1.size();i++){
String z=String.valueOf(v1.elementAt(i));
String y[]=z.split("   ");
v1.setElementAt(y[0], i);
}
for (int i=0;i<v2.size();i++){
String z=String.valueOf(v2.elementAt(i));
String y[]=z.split("   ");
v2.setElementAt(y[0], i);
}
for (int i=0;i<v3.size();i++){
String z=String.valueOf(v3.elementAt(i));
String y[]=z.split("   ");
v3.setElementAt(y[0], i);
}
for (int i=0;i<v4.size();i++){
String z=String.valueOf(v4.elementAt(i));
String y[]=z.split("   ");
v4.setElementAt(y[0], i);
}
/*System.out.println(v0);
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println(v4);
System.out.println(n1);
System.out.println(n2);*/

}
catch(Exception e){
System.out.println(e);

}

try{
PreparedStatement ps=con.prepareCall("select count(*) from questions");
ResultSet rs=ps.executeQuery();
rs.next();
 qnos=rs.getInt(1);
}
catch(Exception e){
System.out.println(e);
}
int q=qnos;
System.out.println(q);
d=new String[q];
e=new String[q][4];
s=new int[q];
ans=new int[q];
set_question_paper();
}

public void set_question_paper(){
for(int i=0;i<qnos;i++){
d[i]=String.valueOf(v0.elementAt(i));    
}
for(int i=0;i<qnos;i++){
ans[i]=Integer.parseInt(String.valueOf(n2.elementAt(i)));    
}
for(int i=0;i<qnos;i++){
s[i]=0;
}
for(int i=0;i<qnos;i++){
e[i][0]=String.valueOf(v1.elementAt(i));
e[i][1]=String.valueOf(v2.elementAt(i));
e[i][2]=String.valueOf(v3.elementAt(i));
e[i][3]=String.valueOf(v4.elementAt(i));
}
//System.out.println(d[0]+" "+e[0][0]+" "+e[0][1]+" "+e[0][2]+" "+e[0][3]+" "+ans[0]);

}
public static void main(String x[]){
question_set obj=new question_set();
//obj.put_questions();
//obj.set_question_paper();
}

}
/*public void connect(){
    try{
     Class.forName("sun.jdbc.odbc.JdbcOdbcDriver");
     System.out.println("Driver Loaded");
     con = DriverManager.getConnection("jdbc:odbc:Test_Questions","scott","poptfs");
    }
    catch(Exception e){
    System.out.println(e);
    }
   }*/
/*public int qno(){
int qnos=0;
    connect();
try{
PreparedStatement ps=con.prepareCall("select count(*) from questions");
ResultSet rs=ps.executeQuery();
rs.next();
 qnos=rs.getInt(1);
}
catch(Exception e){
System.out.println(e);
}
return qnos;
}*/
/*public void put_questions(){
connect();
try{
    PreparedStatement p=con.prepareCall("select * from questions order by QNo");
    ResultSet r=p.executeQuery();

v0.removeAllElements();v1.removeAllElements();v2.removeAllElements();
v3.removeAllElements();v4.removeAllElements();n1.removeAllElements();
n2.removeAllElements();

while (r.next()){
n1.add(r.getInt(1));
v0.add(r.getString(2));
v1.add(r.getString(3));
v2.add(r.getString(4));
v3.add(r.getString(5));
v4.add(r.getString(6));
n2.add(r.getInt(7));
}
//System.out.println(v0);
//for (int j=1;j<5;++j){
for (int i=0;i<v0.size();i++){
String z=String.valueOf(v0.elementAt(i));
String y[]=z.split("   ");
v0.setElementAt(y[0], i);
}
//}
for (int i=0;i<v1.size();i++){
String z=String.valueOf(v1.elementAt(i));
String y[]=z.split("   ");
v1.setElementAt(y[0], i);
}
for (int i=0;i<v2.size();i++){
String z=String.valueOf(v2.elementAt(i));
String y[]=z.split("   ");
v2.setElementAt(y[0], i);
}
for (int i=0;i<v3.size();i++){
String z=String.valueOf(v3.elementAt(i));
String y[]=z.split("   ");
v3.setElementAt(y[0], i);
}
for (int i=0;i<v4.size();i++){
String z=String.valueOf(v4.elementAt(i));
String y[]=z.split("   ");
v4.setElementAt(y[0], i);
}
System.out.println(v0);
System.out.println(v1);
System.out.println(v2);
System.out.println(v3);
System.out.println(v4);
System.out.println(n1);
System.out.println(n2);

}
catch(Exception e){
System.out.println(e);
}
}*/