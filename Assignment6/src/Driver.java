/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 6
*/

import java.util.ArrayList;
import java.util.Scanner;

public class Driver {
    public static void main(String[] args) {
        //set up Scanner
        Scanner sc = new Scanner(System.in);

        //declare variables
        int userSelect=-1;
        int userInt=0;
        int daysTillGame=0;
        ArrayList<Ticket> list = new ArrayList<Ticket>();

        do {
            menu();
            userSelect = sc.nextInt();
            switch (userSelect){
                case 1:
                    System.out.println("How many days until the game?");
                    daysTillGame = sc.nextInt();
                    list.add(new AdvanceBooking(daysTillGame));
                    System.out.println("You sold: "+list.get(list.size()-1));
                    break;
                case 2:
                    list.add(new CurrentBooking());
                    System.out.println("You sold: "+list.get(list.size()-1));
                    break;
                case 3:
                    System.out.println("How many days until the game?[0 for today]");
                    daysTillGame = sc.nextInt();
                    list.add(new DiscountBooking(daysTillGame));
                    System.out.println("You sold: "+list.get(list.size()-1));
                    break;
                case 4:
                    System.out.println("Here are all the tickets you sold:");
                    for (int i =0;i<list.size();i++){
                        System.out.println(list.get(i));
                    }
                    break;
                case 5:
                    break;
                default:
                    System.out.println("_________Error: invalid input__________");
            }


        }while (userSelect!=5);


        //reclaim resource
        sc.close();
    }



    //method to print menu
    public static void menu(){
        System.out.println("Choose from the following:\n" +
                "1. Sell a Ticket for a future game\n" +
                "2. Sell a Ticket for today's game\n" +
                "3. Sell a Discount Ticket\n" +
                "4. Print All Tickets\n" +
                "5. Exit");
    }
}
