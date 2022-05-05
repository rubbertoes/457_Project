import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.Clock;
import java.time.ZoneId;

public class DatabaseUtility {

    // Database attributes
    final String ID = "rschat1";
    final String PW = "COSC*hawji";
    final String SERVER = "jdbc:mysql://triton.towson.edu:3360/?serverTimezone=EST#/rschat1?useSSL=false";
    
    /*
        When DatabaseUtility Object is instantiated, make sure that it has access to jdbc Driver class
    */
    public DatabaseUtility() {
        try{
            Class.forName("com.mysql.cj.jdbc.Driver");
            
        }catch (ClassNotFoundException e){
            System.out.println(e);
        }
    }

    public void getSingleMenuItem() {

    }

    public void getAllMenuItems() {

    }

    public void checkValidEmployee(String PIN) {

    }

    public void addKitchenTicket() {

    }

    public void addCustomerReciept() {
        
    }


}
