/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 3
*/


//Define a Vehicle class
class Vehicle {
    //● It should have attributes for make, model, color, current mileage, original cost,
    //and a boolean that keeps track of whether the vehicle is currently rented.
    public String make,model,color;
    public int mileage;
    public double originalCost;
    public boolean rented;



    //● It should have getters/setters for each attribute.
    public String getMake(){
        return make;
    }
    public String getModel(){
        return model;
    }
    public String getColor(){
        return color;
    }
    public int getMileage(){
        return mileage;
    }
    public double getOriginalCost(){
        return originalCost;
    }
    public boolean getRented(){
        return rented;
    }

    public void setMake(String s){
        make = s;
    }
    public void setModel(String s){
        model = s;
    }
    public void setColor(String s){
        color = s;
    }
    public void setMileage(int i){
        mileage = i;
    }
    public void setOriginalCost(double d){
        originalCost = d;
    }
    public void setRented(boolean b){
        rented = b;
    }




    //● It must have a constructor to set all attributes.
    //      default constructor
    public Vehicle(){
        this("","","",0,0,false);
    }
    public Vehicle(String make, String model, String color, int mileage, double originalCost, boolean rented){
        this.make=make;
        this.model=model;
        this.color=color;
        this.mileage=mileage;
        this.originalCost=originalCost;
        this.rented=rented;
    }




    //● It should have an override for toString or ToString which returns a string similar
    //to:
    //○ Available: Blue Nissan Versa with 105 miles
    //○ Rented: Blue Nissan Versa with 105 miles
    public String toString(){
        String s="";
        if (!rented) s += "Available: ";
        else s += "Rented: ";
        s+= color+" "+make+" "+model+" with "+mileage+" miles";
        return s;
    }
    public String ToString(){
        return toString();
    }
}









//● Define an Economy_Car class. It should inherit from Vehicle.
class Economy_Car extends Vehicle {
    //○ It should have an attribute daily_rental_rate.
    private double daily_rental_rate;

    //○ Create a constructor which takes in make, model, color, current mileage, original
    //cost, and daily rental rate.
    public Economy_Car(){
        this("","","",0,0,false,0);
    }
    public Economy_Car(String make, String model, String color, int mileage, double originalCost, boolean rented,double daily_rental_rate){
        this.make=make;
        this.model=model;
        this.color=color;
        this.mileage=mileage;
        this.originalCost=originalCost;
        this.rented=rented;
        this.daily_rental_rate=daily_rental_rate;
    }
    



    //○ Create an override for toString/ToString which prints:
    //■ Economy Car: Rented: Blue Nissan Versa with 105 miles
    //● Note most of this is just the text that your parent class prints.
    public String toString(){
        String s="Economy Car: ";
        if (!rented) s += "Available: ";
        else s += "Rented: ";
        s += color+" "+make+" "+model+" with "+mileage+" miles";
        return s;
    }
    public String ToString(){
        return toString();
    }

}







//● Define a Midsize_Car class. It should inherit from Vehicle.
class Midsize_Car extends Vehicle {
    //○ It should have an attribute daily_rental_rate.
    private double daily_rental_rate;

    //○ Create a constructor which takes in make, model, color, current mileage, original
    //cost, and daily rental rate.
    public Midsize_Car(){
        this("","","",0,0,false,0);
    }
    public Midsize_Car(String make, String model, String color, int mileage, double originalCost, boolean rented,double daily_rental_rate){
        this.make=make;
        this.model=model;
        this.color=color;
        this.mileage=mileage;
        this.originalCost=originalCost;
        this.rented=rented;
        this.daily_rental_rate=daily_rental_rate;
    }

    //○ Create an override for toString/ToString which prints:
    //■ Midsized Car: Available: Green Dodge Avenger with 15720 miles
    //● Note: Most of this is just the text that your parent class prints.
    public String toString(){
        return "Midsized Car: "+super.toString();
    }
    public String ToString(){
        return toString();
    }

}






//Define a SUV class. It should inherit from Vehicle.
class SUV extends Vehicle {
    //○ It should have an attribute daily_rental_rate.
    private int daily_rental_rate;

    //○ Create a constructor which takes in make, model, color, current mileage, original
    //cost, and daily rental rate.
    public SUV(){
        this("","","",0,0,false,0);
    }
    public SUV(String make, String model, String color, int mileage, double originalCost, boolean rented,int daily_rental_rate){
        this.make=make;
        this.model=model;
        this.color=color;
        this.mileage=mileage;
        this.originalCost=originalCost;
        this.rented=rented;
        this.daily_rental_rate=daily_rental_rate;
    }

    //○ Create an override for toString/ToString which prints:
    //■ SUV: Available: Silver Toyota RAV4 with 432 miles
    //● Note: Most of this is just the text that your parent class prints.
    public String toString(){
        return "SUV: "+super.toString();
    }
    public String ToString(){
        return toString();
    }
}