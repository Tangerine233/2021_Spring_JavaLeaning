/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 4
*/


import java.util.Scanner;

public class Lab4 {

    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //create new Checking() and Saving()
        Checking c = new Checking();
        Saving s = new Saving();

        //declare values
        int userSelect =0;
        double amount=0;


        //functions
        do {
            menu();
            userSelect = sc.nextInt();
            switch (userSelect){
                case 1:
                    System.out.println("How much would you like to withdraw from Checking?");
                    amount = sc.nextDouble();
                    c.withdrawal(amount);
                    break;
                case 2:
                    System.out.println("How much would you like to withdraw from Saving?");
                    amount = sc.nextDouble();
                    s.withdrawal(amount);
                    break;
                case 3:
                    System.out.println("How much would you like to deposit into Checking?");
                    amount = sc.nextDouble();
                    c.deposit(amount);
                    break;
                case 4:
                    System.out.println("How much would you like to deposit into Saving?");
                    amount = sc.nextDouble();
                    s.deposit(amount);
                    break;
                case 5:
                    System.out.println("Your balance for checking "+c.accountNum+" is "+c.balance);
                    break;
                case 6:
                    System.out.println("Your balance for saving "+s.accountNum+" is "+s.balance);
                    break;
                case 7:
                    s.addInterest();
                    break;
                case 8:
                    break;
                default:
                    System.out.println("Error: invalid input");
            }

        }while (userSelect!=8);

    }


    //method to print menu
    public static void menu(){
        System.out.println("1. Withdraw from Checking\n" +
                "2. Withdraw from Savings\n" +
                "3. Deposit to Checking\n" +
                "4. Deposit to Savings\n" +
                "5. Balance of Checking\n" +
                "6. Balance of Savings\n" +
                "7. Award Interest to Savings now\n" +
                "8. Quit");
    }
}
