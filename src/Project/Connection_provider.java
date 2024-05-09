/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Project;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
/**
 *
 * @author LENOVO
 */
public class Connection_provider {
       public static Connection getcon() {
           try {
               Class.forName("com.mysql.cj.jdbc.Driver");
               Connection connection = null;
               connection = DriverManager.getConnection(
          "jdbc:mysql://localhost/yasin", "root", "@#rOOtpaSSfoRmySQl.neT");
               
               return connection;
           }
           catch(Exception e) {
               System.out.println("Unable to load driver.");
               return null;
           }
       } 
}
