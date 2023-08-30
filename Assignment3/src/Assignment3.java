/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 3
*/


import java.util.Scanner;

public class Assignment3 {
    //set up scanner
    static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        //declare values
        int userInput =0;

        //● In your driver class, create an ArrayList/List of Vehicles.
        Vehicle[] v = new Vehicle[5];

        //● Add each of the vehicles in the table above to your ArrayList/List.
        v[0] = new Economy_Car("Nissan","Versa","Blue",105,14500,false,25);
        v[1] = new Economy_Car("Toyota","Yaris","White",8422,17500,false,25);
        v[2] = new Midsize_Car("Dodge","Avenger","Green",15720,15000,false,45);
        v[3] = new Midsize_Car("Ford","Foucus","Yellow",2368,14500,false,45);
        v[4] = new SUV("Toyota","Rav4","Silver",432,26150,false,80);


        //main function
        do {
            menu();
            userInput = sc.nextInt();
            switch (userInput){
                case 1:
                    rent_cars(v);
                    break;
                case 2:
                    return_cars(v);
                    break;
                case 3:
                    break;
                default:
                    System.out.println("Error: invalid input");
            }

        }while(userInput!=3);



        //reclaim resource
        sc.close();
    }


    //print menu
    public static void menu(){
        System.out.println("1. Rent cars\n" +
                "2. Return cars\n" +
                "3. Quit");
    }


    //● Create a method show_cars which takes in the ArrayList/List and prints out all of the
    public static void show_cars(Vehicle[] v){
        for (int i=0; i<v.length;i++){
            System.out.println( i+1 + ". " +v[i].toString());
        }
    }

    //Create a method rent_cars
    public static void rent_cars(Vehicle[] v) {
        int userInput=-1;
        //○ Using a loop, prompt the user to: “Choose a car to rent:”. Call the show_cars()
        //method above to produce a menu.
        do {
            System.out.println("Choose a car to rent:");
            System.out.println("0. Return");
            show_cars(v);
            userInput = sc.nextInt();

            //○ Read in a response, so long as it’s not 0, mark the chosen car as rented.
            if ( userInput>0 && userInput<v.length ){
                v[userInput-1].rented=true;
            }
            else if (userInput==0);
            else System.out.println("Error: invalid input");
        }while(userInput!=0);
    }


    //● Create a method return_cars
    public static void return_cars(Vehicle[] v) {
        int userInput=-1;
        //○ Using a loop, prompt the user to: “Choose a car to return:”. Call the show_cars()
        //method above to produce a menu.
        do {
            System.out.println("Choose a car to return:");
            System.out.println("0. Return");
            show_cars(v);
            userInput = sc.nextInt();

            //○ Read in a response, so long as it’s not 0, mark the chosen car as available.
            if ( userInput>0 && userInput<v.length ){
                v[userInput-1].rented=false;
            }
            else if (userInput==0);
            else System.out.println("Error: invalid input");
        }while(userInput!=0);
    }
}
