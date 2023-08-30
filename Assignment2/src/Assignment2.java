/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 2
*/


import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //call Caesar()
        Caesar caesar = new Caesar();


        //declare value
        int userChoice = 0;
        String userString ="";

        //do-while loop for functions
        do{
            menu();
            userChoice = sc.nextInt();
            sc.nextLine();
            switch (userChoice){
                case 1:  //prompt user to enter a String and show encrypted String
                    System.out.println("What is the message to encrypt?");
                    userString = sc.nextLine();
                    System.out.println("Encrypted: "+ caesar.encrypt(userString.toLowerCase()));
                    break;

                case 2:  //prompt user to enter a String and show decrypted String
                    System.out.println("What is the encrypted message?");
                    userString = sc.nextLine();
                    System.out.println("Plaintext:"+ caesar.decrypt(userString.toLowerCase()));
                    break;

                case 3:break;

                default:
                    System.out.println("Error: invalid input");
            }

        }while(userChoice!=3);//loop while the userChoice is not 3


        //reclaim resource
        sc.close();

    }//end main



    //method to print menu
    public static void menu(){
        System.out.println("1 Encrypt a message\n" +
                "2 Decrypt a message\n" +
                "3 Quit");
    }
}
