/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 2
*/

public class StockItem {
    //declare values
    private String description;
    private int id;
    private double price;
    private int quantity;

    //static item counter
    public static int counter;



    //---------------------------------------------------
    //Constructors
    //---------------------------------------------------
    //default constructor
    public StockItem(){
        this.id = counter;
        counter++;
    }

    //Overloaded constructor that takes description, a price, and a current quantity
    public StockItem(String description, double price, int quantity){
        this.id = counter;
        this.description = description;
        this.price = (int)(price*100)/100.00;
        this.quantity = quantity;
        counter++;
    }
    //---------------------------------------------------





    //Overridden toString/ToString method that prints all details of the stock item.
    public String toString(){
        return "Item number: "+id+" is "+description+" has price "+price+" we currently have "+quantity+" in stock";
    }
    public String ToString(){
        return toString();
    }





    //---------------------------------------------------
    //●Getter Methods:
    //---------------------------------------------------
    //○ Retrieve the description of the item
    public String getDescription(){
        return description;
    }
    //○ Retrieve the id number of the item
    public int getId(){
        return id;
    }
    //○ Retrieve the price of the item
    public double getPrice(){
        return price;
    }
    //○ Retrieve the quantity of the item that is currently in stock
    public int getQuantity(){
        return quantity;
    }
    //---------------------------------------------------






    //---------------------------------------------------
    //● Setter Methods:
    //---------------------------------------------------
    //○ Set a new price for the item
    public void setPrice(double p){
        if (p>=0) price = (int)(p*100)/100.0;
        else System.out.println("Error: price can't below 0");
    }
    //○ Lower the quantity in stock
    public void decreaseQuantity(int q){
        if (q<0) System.out.println("Error: invalid input quantity");
        else if ((quantity-q)>=0) quantity = quantity - q;
        else System.out.println("Error: quantity can below 0");
    }
    //○ Raise the quantity in stock
    public void increaseQuantity(int q){
        if (q<0) System.out.println("Error: invalid input quantity");
        else quantity = quantity + q;
    }
    //---------------------------------------------------
}
