/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 6
*/



//● Create a driver program which prompts the user to enter a number, then calculate the
//fibonacci using both methods, and print the results.
import java.util.Scanner;

public class Lab6 {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int userInput=0;
        //call
        FibIteration f1 = new FibIteration();
        FibFormula f2 = new FibFormula();

        System.out.println("Enter the number you want to find the Fibonacci Series for:");
        userInput = sc.nextInt();
        sc.nextLine();

        System.out.println("Fib of " + userInput + " by iteration is: " + f1.calculate_fib(userInput));
        System.out.println("Fib of " + userInput + " by formula is: " + f2.calculate_fib(userInput));
    }
}
