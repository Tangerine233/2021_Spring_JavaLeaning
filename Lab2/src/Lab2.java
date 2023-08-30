/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 2
*/

import java.util.*;
public class Lab2 {
    //set up scanner
    static Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //declare values
        int userSelect =0;
        int userQuantity =0;
        double userPrice =0;
        //call StockItem()
        StockItem milk = new StockItem("1 Gallon of Milk", 3.60, 15);
        StockItem bread = new StockItem("1 Loaf of Bread", 1.98, 30);



        //loop for userSelect
        while (userSelect!=8){
            //print menu
            printMenu();
            //read userSelect
            userSelect = input.nextInt();
            switch (userSelect){
                case 1:
                    milk.decreaseQuantity(1);
                    System.out.println("");
                    break;
                case 2: bread.decreaseQuantity(1);
                    System.out.println("");
                    break;
                case 3:
                    System.out.println("What is the new price for Milk");
                    userPrice = input.nextDouble();
                    milk.setPrice(userPrice);
                    System.out.println("");
                    break;
                case 4:
                    System.out.println("What is the new price for bread");
                    userPrice = input.nextDouble();
                    bread.setPrice(userPrice);
                    System.out.println("");
                    break;
                case 5:
                    System.out.println("How many milk did we get?");
                    userQuantity = input.nextInt();
                    milk.increaseQuantity(userQuantity);
                    System.out.println("");
                    break;
                case 6:
                    System.out.println("How many bread did we get?");
                    userQuantity = input.nextInt();
                    bread.increaseQuantity(userQuantity);
                    System.out.println("");
                    break;
                case 7:
                    System.out.println("\nMilk: "+ milk.toString());
                    System.out.println("Bread: "+ bread.toString()+"\n");
                    break;
                case 8:break;
                default:
                    System.out.println("Error: invalid option\n");
            }
        }

        //reclaim resource
        input.close();
    }



    public static void printMenu(){
        System.out.println("1. Sold One Milk\n" +
                "2. Sold One Bread\n" +
                "3. Change price of Milk\n" +
                "4. Change price of Bread\n" +
                "5. Add Milk to Inventory\n" +
                "6. Add Bread to Inventory\n" +
                "7. See Inventory\n" +
                "8. Quit");
    }
}
