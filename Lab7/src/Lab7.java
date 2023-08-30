/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 7
*/


import java.util.Scanner;

//driver class
public class Lab7 {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        Calculator c = new Calculator();
        int userSelect=-1;
        float userX=0;
        float userY=0;

        do {
            menu();
            System.out.print("Please Choose an Option: ");
            userSelect = sc.nextInt();

            switch (userSelect){
                case 0:break;
                case 1:
                    System.out.print("Please enter the first number ");
                    userX = sc.nextFloat();
                    System.out.print("Please enter the second number ");
                    userY = sc.nextFloat();
                    System.out.println(c.add(userX,userY)+"\n");
                    break;
                case 2:
                    System.out.print("Please enter the first number ");
                    userX = sc.nextFloat();
                    System.out.print("Please enter the second number ");
                    userY = sc.nextFloat();
                    System.out.println(c.subtract(userX,userY)+"\n");
                    break;
                case 3:
                    System.out.print("Please enter the first number ");
                    userX = sc.nextFloat();
                    System.out.print("Please enter the second number ");
                    userY = sc.nextFloat();
                    System.out.println(c.multiply(userX,userY)+"\n");
                    break;
                case 4:
                    System.out.print("Please enter the first number ");
                    userX = sc.nextFloat();
                    System.out.print("Please enter the second number ");
                    userY = sc.nextFloat();
                    System.out.println(c.divide(userX,userY)+"\n");
                    break;
                default:
                    System.out.println("__________Error: Invalid input__________"+"\n");
            }

        }while (userSelect!=0);

        //reclaim resource
        sc.close();
    }

    //menu print method
    public static void menu(){
        System.out.println("0 - Exit\n" +
                "1 - Addition\n" +
                "2 - Subtraction\n" +
                "3 - Multiplication\n" +
                "4 - Division");
    }
}
