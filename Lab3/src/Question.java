/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 3
*/

import java.util.Scanner;

public class Question {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare value
        int userInput=0;

        //call method Quiz()
        Quiz q = new Quiz();

        do{
            menu();
            userInput = sc.nextInt();
            switch (userInput){
                case 1: q.add_question();break;
                case 2: q.remove_question();break;
                case 3: q.modify_question();break;
                case 4: q.give_quiz();break;
                case 5:break;
                default:
                    System.out.println("Error: invalid input\n");
            }

        }while (userInput!=5);
    }

    public static void menu(){
        System.out.println("What would you like to do?\n" +
                "1. Add a question to the quiz\n" +
                "2. Remove a question from the quiz\n" +
                "3. Modify a question in the quiz\n" +
                "4. Take the quiz\n" +
                "5. Quit");
    }
}
