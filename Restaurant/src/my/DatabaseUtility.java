package Restaurant.src.my;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.text.SimpleDateFormat;
import java.sql.*;
import java.time.Clock;
import java.time.LocalDate;
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
            con.close();
        }catch (SQLException e){
            System.err.println(e);
        }

        if(employee_PINS.contains(PIN)) {
            return true;
        }
        return false;
    }

    public boolean checkValidManager(String PIN) {
        ArrayList<String> employee_PINS = new ArrayList<>();
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT * FROM rschat1db.EMPLOYEE" +
            " WHERE type = \'Manager\'");
            
            while (rs.next()){
                String SSN = rs.getString("SSN");
                employee_PINS.add(SSN);
                //System.out.println(SSN + "," + name);
            }
            con.close();
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
            con.close();
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
            con.close();
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
            con.close();
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
            con.close();
        }catch (SQLException e){
            System.err.println(e);
        }
        return menuItemIdentifiers;
    }

    public double getSingleMenuItemPrice(String itemNum) {
        return Double.parseDouble(this.getSingleMenuItemDataEntry(itemNum, "price"));
    }

   
    private ArrayList<String> getListOfItemNum(String[] itemNames) {

        ArrayList<String> allItemNum = new ArrayList<>();

        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();

            for(String _itemName : itemNames){
                ResultSet rs = stmt.executeQuery("SELECT item_num FROM rschat1db.ITEMS " +
                "WHERE name = \"" + _itemName + "\"");
            
                while (rs.next()){
                    String itemNum = rs.getString("item_num");
                    allItemNum.add(itemNum);
                }
        }
        con.close();
        }catch (SQLException e){
            System.err.println(e);
        }
        return allItemNum;
    }

    //CONTINUE HERE
    public int getNewOrderNum(int ticketNum){

        //month + year + total ticket num
        //05      22     01
        //05      23     01
        //ordernum wont exactly reflect the date added, but will be random enough to increment 

        LocalDate today = LocalDate.now();	//23-Feb-022
        Integer day =  today.getDayOfMonth();	//23
        Integer month = today.getMonthValue(); 	//2
        Integer year = today.getYear();			//2022

        //if its a new month, increment to match month and year
        if(day == 1) {
            String strOrderNum = month.toString() + year.toString() + ticketNum;
            return Integer.parseInt(strOrderNum);
        }

        //else its not a new month, just add 1 to the total orders
        return getMaxOrderNum() + 1;
        
    }

    //if the 100th order exists in the database then return true
        //What if you just add 1 to what exists? will that 
        //maybe if day == 1 then reset and form new number
    private int getMaxOrderNum() {
        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT MAX(order_num) FROM rschat1db.ORDERS");
            
            while (rs.next()){
                String coulumnData = rs.getString("MAX(order_num)");

                return Integer.parseInt(coulumnData);
            }
        }catch (SQLException e){
            System.err.println("Couldn't Find Order Number");
        }
        return 0; 
    }


    //needs: all item name (will be converted to item_num)
                //       all prices (will be totaled into one double)
                //       date: may need to create it in the fx as format is differnt for reciepts
                //       notes
                //       cashier pin
                //       rewards_phone number           //not possible rn
                //       ticket number
    public void insertOrderInDB(
        String[] _allItemNames, 
        String[] _itemPrices, 
        String _date,
        String _orderNotes,
        String _empPin,
        int _ticketNum,
        int _dbNo){

        //take list of food item names and return just their item_num 
        ArrayList<String> itemNums = getListOfItemNum(_allItemNames);

        //take string list of all prices, convert them to doubles and find the sum
        ArrayList<Double> itemPrices = new ArrayList<>();
        for(String price :  _itemPrices){
            itemPrices.add(Double.parseDouble(price));
        }
        double totalPrice = 0;
        for (double price: itemPrices){
            totalPrice += price;
        }



        //send data to ORDER table
        String querys;
    try {

        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        PreparedStatement prep = null;
        querys = 
        
        "INSERT INTO rschat1db.ORDERS (order_num, date, total_price, notes, cashier_pin)" + 
        "VALUES ('" + _dbNo + "', '" + _date + "', '" + totalPrice + "', '" + "\""+ _orderNotes + "\"', '" + _empPin + "')"; 
        System.out.println(querys);
        
        prep = con.prepareStatement(querys);
        prep.execute();

    }catch (SQLException e){
        System.err.println(e);
    }


        //send data to CONSISTS_OF table
        String querys1;
        String querys2;
        int countNumItems = 1;
    try {
        
        Connection con = DriverManager.getConnection(SERVER, ID, PW);
        /*
        //Statement stmt = con.createStatement();
        PreparedStatement fullOrderContents = null;
        querys = "";
        fullOrderContents = con.prepareStatement(querys);
        fullOrderContents.executeUpdate();
        */

        querys1 = "INSERT INTO rschat1db.CONSISTS_OF (ticket_num, order_num, ";
        querys2 = " VALUES (?, ?, ";

        //build two query strings
        
        for (String _itNum : itemNums){
            querys1 += "item_" + countNumItems++ + ", ";
            querys2 += "?, ";
        }
        //remove last comma from each string
        StringBuffer modQuerys1 = new StringBuffer(querys1);
        modQuerys1.deleteCharAt(modQuerys1.length()-1); 
        modQuerys1.deleteCharAt(modQuerys1.length()-1); 
        querys1 = "";
        querys1 = modQuerys1.toString();
        querys1 += ")";

        StringBuffer modQuerys2 = new StringBuffer(querys2);
        modQuerys2.deleteCharAt(modQuerys2.length()-1);
        modQuerys2.deleteCharAt(modQuerys2.length()-1);
        querys2 = ""; 
        querys2 = modQuerys2.toString();
        querys2 += ")";

        querys = querys1 + querys2;

        //System.out.println("Ticket NUMBER:" + _ticketNum );
        //System.out.println("Order NUMBER:" + _dbNo);

      //create the mysql insert preparedstatement
      PreparedStatement preparedStmt = con.prepareStatement(querys);
      preparedStmt.setString (1, Integer.toString(_ticketNum));
      preparedStmt.setString (2, Integer.toString(_dbNo));

      int prepStmCount = 3;
      for (String _itNum : itemNums){
        preparedStmt.setString(prepStmCount++, _itNum);
    }

    //System.out.println(querys);

      // execute the preparedstatement
    preparedStmt.execute();
    con.close();

    
    }catch (SQLException e){
            System.err.println(e);
    }

    }

    public String queryOrderFromDB(Integer orderNum){

        ArrayList<String> orderItemsNums = new ArrayList<>();
        int numItem = 1;

        try {
            Connection con = DriverManager.getConnection(SERVER, ID, PW);
            Statement stmt = con.createStatement();
            ResultSet rs = stmt.executeQuery(
            "SELECT order_num, ticket_num, item_1, item_2, item_3, item_4, item_5, " +
            "item_6, item_7, item_8, item_9, item_10, item_11, item_12, item_13, " +
            "item_14, item_15, item_16, item_17, item_18, item_19, item_20, item_21, " +
            "item_22, item_23, item_24, item_25, item_26, item_27, item_28, item_29, " +
            "item_30, date, total_price, notes, name " +                     
            "FROM rschat1db.CONSISTS_OF " +
            "NATURAL JOIN rschat1db.ORDERS " +
            "JOIN rschat1db.EMPLOYEE " + 
            "ON cashier_pin = SSN " +
            "WHERE order_num = \"" + orderNum + "\"");
            
            while (rs.next()){
                String order_num = rs.getString("order_num");
                String ticket_num = rs.getString("ticket_num");
                String menuItemName = rs.getString("item_" + numItem++);
                orderItemsNums.add(menuItemName);
                
                //once menuItem = null, there are no more items in the order
                while(menuItemName != null){
                    menuItemName = rs.getString("item_" + numItem++);
                    orderItemsNums.add(menuItemName);
                }

                String date  = rs.getString("date");
                Double totalPrice = rs.getDouble("total_price");
                String notes = rs.getString("notes");
                String cashier_name = rs.getString("name");

                //return as one long string
                String queryDisplay = "";
                queryDisplay += "DETAILS FROM ORDER " + orderNum + "\n";
                queryDisplay += "TICKET NUMBER: " + ticket_num + "\n";
                queryDisplay += "PLACED ON: " + date + "\n";
                queryDisplay += "ADDED BY: " + cashier_name + "\n\n";
                queryDisplay += "WITH ITEMS: \n";
                for(String menuItem : orderItemsNums){
                    if(menuItem == null){
                        break;
                    }
                    queryDisplay += getSingleMenuItemDataEntry(menuItem, "name") + "\n";
                }
                queryDisplay += "\nPRICE PAID: " + totalPrice + "\n";
                queryDisplay += "ADDITIONAL INFORMATION: " + notes; 

                //System.out.println(queryDisplay);

                return queryDisplay;
            }
            con.close();
        }catch (SQLException e){
            System.err.println(e);
        }

        return null;
    }

    
    public static void main(String args[]) {
        DatabaseUtility dbu = new DatabaseUtility();
        dbu.queryOrderFromDB(5222);
        
    }
}
