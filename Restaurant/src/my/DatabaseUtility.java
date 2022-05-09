package Restaurant.src.my;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.*;
import java.time.Clock;
import java.time.ZoneId;
import java.util.ArrayList;

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

    public boolean checkValidEmployee(String PIN) {
        ArrayList<String> employee_PINS = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM rschat1db.EMPLOYEE");
            
            while (rs.next()){
                String SSN = rs.getString("SSN");
                employee_PINS.add(SSN);
                //System.out.println(SSN + "," + name);
            }
        }catch (SQLException e){
            System.err.println(e);
        }

        if(employee_PINS.contains(PIN)) {
            return true;
        }
        return false;
    }

    public String getEmployeeName(String pin) {
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            
            ResultSet rs = stmt.executeQuery("SELECT * FROM rschat1db.EMPLOYEE WHERE SSN = " + pin);
            
            while (rs.next()){
                String name = rs.getString("name");
                return name;
            }

        }catch (SQLException e){
            System.err.println(e);
        }
        return null;
    }

    public String getCustomer(String phoneNumber) {
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM rschat1db.CUSTOMER_REWARDS WHERE phone_num = \""
            + phoneNumber +  "\"");
            
            while (rs.next()){
                String name = rs.getString("name");
                double dollars_spent = rs.getDouble("dollars_spent");
                double rewards_spent = rs.getDouble("rewards_spent");
                double rewards_available = (dollars_spent - rewards_spent);
                int _rewards_available = (int) rewards_available;
                String rewards_String = "Name: " + name + " - " + _rewards_available + " Points Available";
                return rewards_String;
            }
        }catch (SQLException e){
            System.err.println(e);
        }
        return "Couldn't find phone number";
    }

    /*
        Given the itemNum and the name of the column, this function returns the value from the db or Null if invalid
    */
    public String getSingleMenuItemDataEntry(String itemNum, String attribute) {
        //item numbers are varchars with format of 001
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT " + attribute + " FROM rschat1db.ITEMS " +
            "WHERE item_num = \"" + itemNum + "\"");
            
            while (rs.next()){
                String coulumnData = rs.getString(attribute);
                return coulumnData;
            }
        }catch (SQLException e){
            System.err.println(e);
        }

        return "Data not found";
    }

    //returns an array list of all the valid identifiable rows in the DB
    public ArrayList<String> getAllMenuItemsNums() {
        ArrayList<String> menuItemIdentifiers = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT item_num FROM rschat1db.ITEMS");
            
            while (rs.next()){
                String itemNum = rs.getString("item_num");
                menuItemIdentifiers.add(itemNum);
            }
        }catch (SQLException e){
            System.err.println(e);
        }
        return menuItemIdentifiers;
    }

    public double getSingleMenuItemPrice(String itemNum) {
        return Double.parseDouble(this.getSingleMenuItemDataEntry(itemNum, "price"));
    }

    public String[] getListOfItemNum(String[] itemNames) {

        return null;
    }

    
    public int getNewOrderNum(){
        return 0;
    }

    public void addKitchenTicket() {}

    public void addCustomerReciept() {}

    public void getKitchenTicket () {}

    public void getOrderTicket() {}

    
    public static void main(String args[]) {
    }
}
