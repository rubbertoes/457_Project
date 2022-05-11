package Restaurant.src.my;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
//package mysqltest2;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.Clock;
import java.time.ZoneId;



/**
 *
 * @author qwang12
 */
public class connectToMySQL {

    /**
     * @param args the command line arguments
     */
   public static void main(String[] args) {
        // TODO code application logic here
    try{
        Class.forName("com.mysql.cj.jdbc.Driver");
        
    }catch (ClassNotFoundException e){
        System.out.println(e);
    }
    
    final String ID = "rschat1";
    final String PW = "COSC*hawji";
    final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/rschat1?useSSL=false";
    String querys;
    
    try {
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        Statement stmt = con.createStatement();
        
        ResultSet rs = stmt.executeQuery("SELECT * FROM rschat1db.EMPLOYEE");
        PreparedStatement updateStaff = null;
        
        while (rs.next()){
            String SSN = rs.getString("SSN");
            String name = rs.getString("name");
            String type = rs.getString("type");
            String birthday = rs.getString("birthday");
            String sex = rs.getString("sex");
            System.out.println(SSN + "," + name);
            
        }
        
       querys = "UPDATE rschat1.Branch SET city = 'Baltimore' WHERE branchNo = 'B002';";
       updateStaff = con.prepareStatement(querys);
       updateStaff.executeUpdate();
    }catch (SQLException e){
        System.err.println(e);
    }
    }//Main

}
