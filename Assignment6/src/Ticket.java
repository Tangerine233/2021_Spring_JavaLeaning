/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 6
*/

//mother class
abstract class Ticket {
    //declare variables
    private int ticketNumber=0;
    private static int nextTicketNumber=1;
    private int price=0;

    //constructor
    public Ticket(){
        ticketNumber = nextTicketNumber;
        nextTicketNumber++;
    }

    //setter
    public void setPrice(int price) {
        this.price = price;
    }

    //getters
    public int getTicketNumber() {
        return ticketNumber;
    }
    public int getPrice() {
        return price;
    }

    //abstract toString/ToString
    abstract public String toString();
    abstract public String ToString();

}






class AdvanceBooking extends Ticket{
    private int numOfDays=-1;

    //constructors
    public AdvanceBooking(int i){
        super();
        numOfDays = i;
        if (i<=0) super.setPrice(75);
        else if (i>=15) super.setPrice(25);
        else super.setPrice(50);
    }



    @Override
    public String toString() {
        return "Ticket number "+super.getTicketNumber()
                +" with a price of $"+super.getPrice()
                +" for a game in "+numOfDays+" days.";
    }

    @Override
    public String ToString() {
        return toString();
    }
}


class CurrentBooking extends Ticket{

    //constructor
    public CurrentBooking(){
        super();
        super.setPrice(75);
    }


    @Override
    public String toString() {
        return "Ticket number "+super.getTicketNumber()+" with a price of $"+super.getPrice()+" for today's game";
    }
    @Override
    public String ToString() {
        return toString();
    }
}



class DiscountBooking extends Ticket{
    //declare variables
    private int numOfDays=-1;

    //constructor
    public DiscountBooking(int i){
        super();
        numOfDays = i;
        if (i==0) super.setPrice(75);
        else super.setPrice(10);
    }

    @Override
    public String toString() {
        return "Ticket number "+super.getTicketNumber()
                +" with a price of $"+super.getPrice()
                +" is a discount ticket for a game in "+numOfDays+" days.";
    }
    @Override
    public String ToString() {
        return toString();
    }
}




