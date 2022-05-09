package Restaurant.src.my;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class PrintUtility {

    private String[] itemNames;
    private ArrayList<Double> itemPrices;
    private Date date;
    private int ticketNumber;   //pass it the ticket number too!

    public PrintUtility(String[] _itemNames, String[] _itemPrices, Date _date, int _ticketNum){
        itemNames = _itemNames;

        itemPrices = new ArrayList<>();
        for(String price :  _itemPrices){
            itemPrices.add(Double.parseDouble(price));
        }

        this.ticketNumber = _ticketNum;

        date = _date;
    }

    /*
        Prints Customer Reciept in the terminal. 
    */
    public void printCustomerReceipt(){

        //need to implement total and find a way to format white space better

        System.out.println("\n******************************************************");
        System.out.println("\t\tCUSTOMER RECIEPT");
        System.out.println("\tThank you for dining with Kuya Ja's!\n");
        System.out.println("Ticket Number: " + ticketNumber + "\n");

        for(int i = 0; i<itemNames.length; i++){
            System.out.printf("%-20s $%.2f \n", itemNames[i], itemPrices.get(i));   
        }

        double totalPrice = 0;
        for (double price: itemPrices){
            totalPrice += price;
        }

        System.out.println("\nTax:\t\t     Taxation is theft!");
        System.out.printf("Total:\t\t     $%.2f", totalPrice);
        System.out.println("\n\n\t\tKaon Na Ta!\n");
        System.out.println("Date: " + date);
        System.out.println("Order Number:"  + this.generateOrderNumber());
        System.out.println("******************************************************\n");
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
