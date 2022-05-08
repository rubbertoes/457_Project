package Restaurant.src.my;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PrintUtility {

    private String[] itemNames;
    private ArrayList<Double> itemPrices;
    private Date date;

    public PrintUtility(String[] _itemNames, String[] _itemPrices, Date _date){
        itemNames = _itemNames;

        itemPrices = new ArrayList<>();
        for(String price :  _itemPrices){
            itemPrices.add(Double.parseDouble(price));
        }

        date = _date;
    }

    /*
        Prints Customer Reciept in the terminal. 
    */
    public void printCustomerReceipt(){

        //need to implement total and find a way to format white space better

        System.out.println("**************************************************");
        System.out.println("\tThank you for dining with Kuya Ja's!\n");
        System.out.println("Ticket Number: " + this.generateTicketNumber());

        for(int i = 0; i<itemNames.length; i++){
            System.out.println(itemNames[i] + "\t\t\t$" + itemPrices.get(i));
        }

        System.out.println("Total: not yet implemented");

        System.out.println("\n\tTaxation is theft!");
        System.out.println("\tKaon Na Ta!");
        System.out.println("Date: " + date);
        System.out.println("Order Number:"  + this.generateOrderNumber());
        System.out.println("**************************************************");

    }




    /*
        Prints Kitchen Ticket in the terminal.
    */
    public void printKitchenTicket() {

    }

    /*
        Generates a unique order number, not yet seen in the database
    */
    public String generateOrderNumber() {
        //SELECT MAX()

        return "00001";
    }

    //read from database to find last used ticket number
    public int generateTicketNumber() {
        return 69;
    }
}
