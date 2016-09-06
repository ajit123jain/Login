package Login;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class DatabaseConnection {
    Connection conn;
    Statement stmt;
    ResultSet res;
public DatabaseConnection(){
  
  
  }
 public Connection setConnection(){
 try{
 Class.forName("com.mysql.jdbc.driver");
 conn=DriverManager.getConnection("jdbc:mysql://localhost/mms/","root","system");
 
 }
 catch(ClassNotFoundException | SQLException e){
 }
 return conn;
 }
 public ResultSet getResult(String query,Connection conn){
 this.conn=conn;
 try{
 stmt=conn.createStatement();
 res=stmt.executeQuery(query);
 }
 catch(Exception e){
 }
 return res;
 }
}    

