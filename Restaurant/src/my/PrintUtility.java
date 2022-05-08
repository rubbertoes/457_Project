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

            //add an extra 0 if the price is a whole number. 2.0 -> 2.00
            //String printablePrice = itemPrices.get(i).toString();
            //if(printablePrice.contains(".0")){
            //    printablePrice.replace(".0", ".00");
            //    System.out.println(printablePrice);
            //}

            //System.out.println(itemNames[i] + "\t\t\t$" + printablePrice);
            System.out.printf("%-20s $%.2f \n", itemNames[i], itemPrices.get(i));

            
        }

        System.out.println("\nTotal: not yet implemented");

        System.out.println("\n\tTaxation is theft!");
        System.out.println("\tKaon Na Ta!");
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
