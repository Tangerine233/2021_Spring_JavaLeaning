/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 9
*/

import java.util.Scanner;

public class Lab9 {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userSelection=0;
        int userInt1 =0;
        int userInt2 =0;

        //main function
        do {
            menu();
            userSelection = sc.nextInt();


            switch (userSelection){
                case 0:
                    break;
                case 1:
                    System.out.println("Enter first number");
                    userInt1 = sc.nextInt();
                    System.out.println("Enter second number");
                    userInt2 = sc.nextInt();
                    System.out.println("Answer: "+recursiveMultiply(userInt1,userInt2));
                    break;
                case 2:
                    System.out.println("Enter first number");
                    userInt1 = sc.nextInt();
                    System.out.println("Enter second number");
                    userInt2 = sc.nextInt();
                    System.out.println("Answer: "+recursiveDiv(userInt1,userInt2));
                    break;
                case 3:
                    System.out.println("Enter first number");
                    userInt1 = sc.nextInt();
                    System.out.println("Enter second number");
                    userInt2 = sc.nextInt();
                    System.out.println("Answer: "+recursiveMod(userInt1,userInt2));
                    break;
                default:
                    System.out.println("**********Invalid input************\n");
            }
         }while (userSelection!=0);

        //reclaim resource
        sc.close();
    }


    public static void menu(){
        System.out.println("Choose from the following:\n" +
                "0. Quit\n" +
                "1. Multiply 2 numbers\n" +
                "2. Div 2 numbers\n" +
                "3. Mod 2 numbers");
    }

    //Method 1
    //Write recursive_multiply. It should take in 2 integers and return an integer.
    //Another way to say multiply 5*4, is 5+(5*3), or 5+5+(5*2), or 5+5+5+(5*1), or
    //5+5+5+5+(5*0). You know that any number multiplied by 0 is 0.
    public static int recursiveMultiply(int i1, int i2){
        if (i2==0) return i2;
        else {
            return i1+recursiveMultiply(i1,i2-1);
        }
    }


    //Method 2
    //Write recursive_div. It should take in 2 integers and return an integer. Unlike regular
    //division, div just returns the integer portion of division. It answers the question “how
    //many times does the second number go into the first number”.
    public static int recursiveDiv(int i1,int i2){
        if (i2==0) return -1;
        else if (i1==i2) return 1;
        else if (i1<i2) return 0;
        else return 1+recursiveDiv(i1-i2,i2);
    }


    //Method 3
    //Write recursive_mod. It should take in 2 integers and return an integer. Mod only cares
    //about the remainder of division.
    public static int recursiveMod(int i1,int i2){
        if (i2==0) return -1;
        else if (i1<i2) return i1;
        else return recursiveMod(i1-i2,i2);
    }
}
