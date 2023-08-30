/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He.
Assignment#: 5
*/

import java.util.Scanner;

// In your driver class let’s run a simulation:
public class Assignment5 {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare value
        int userInput =0;



        //○ Prompt the user to enter a temperature until they enter -1
        do{
            System.out.println("What is the current temperature? (Enter -1 to exit)");
            userInput = sc.nextInt();
            sc.nextLine();

            if (userInput==-1) break;

            //○ Create an environment object with that temperature
            Environment e1 = new Environment(userInput);

            //○ Create a regular Cricket and a ClemsonCricket object.
            Cricket c1 = new Cricket();
            ClemsonCricket c2 = new ClemsonCricket();

            //○ Call the getChirpCount() method in each, outputting the results as shown below.
            System.out.println("Normal cricket: "+userInput+" degrees yields "+c1.getChirpCount(e1)+" chirps per minute");
            System.out.println("Clemson cricket: "+userInput+" degrees yields "+c2.getChirpCount(e1)+" chirps per minute");


        }while (userInput!=-1);

    }
}
