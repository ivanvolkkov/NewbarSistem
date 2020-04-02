package company.vanolincikus;

import company.vanolincikus.*;

import java.util.ArrayList;

public class Order {
   public  AcademyBarFrame frame;
    public  AcademyBarFrame orders;

    public ArrayList<Product> products ;
    public int tableNumber;
    public Waitress waitress;
    public Order order;
    public double totalPrice;

    public Order(int tableNumber, Waitress waitress) {
        this.tableNumber = tableNumber;
        this.waitress = waitress;
        this.products = new ArrayList<>() ;

    }

    public String printBill() {

        for (int j = 0; j < products.size() ; j++) {
                  totalPrice += products.get(j).price;
               }

        String finalText = "Your waitress was: " + this.waitress.name + ". Bill for table: " + this.tableNumber + " is " + totalPrice + " BGN";

        return finalText;
    }

}
