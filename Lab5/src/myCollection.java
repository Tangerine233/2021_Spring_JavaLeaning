/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 5
*/

import java.util.Scanner;

public class myCollection {
    //set up Scanner
    static Scanner sc = new Scanner(System.in);

    //main method
    public static void main(String[] args) {
        //declare values
        int userInt;
        String userTitle;
        String userAuthor;
        String userString;
        int size =5;
        //The array should be of type Item since it can hold either Books or Periodicals. This is
        //polymorphism!
        Item[] items = new Item[size];

        for (int i=0; i<size; i++){
            do {
                //Ask the user to “Please enter B for Book or P for Periodical”
                System.out.println("Please enter B for Book or P for Periodical");
                userString = sc.nextLine();


                //If they choose Book, prompt for Title, Author and ISBN number. Store the results in the
                //next cell of the array
                if (userString.equals("B")){

                    System.out.println("Please enter the name of the Book");
                    userTitle = sc.nextLine();

                    System.out.println("Please enter the author of the Book");
                    userAuthor = sc.nextLine();

                    System.out.println("Please enter the ISBN of the Book");
                    userInt = sc.nextInt();
                    sc.nextLine();

                    items[i] = new Book(userTitle,userInt,userAuthor);
                }


                //If they choose Periodical, prompt for Title and IssueNumber. Store the result in the next
                //cell of the array.
                else if (userString.equals("P")){
                    System.out.println("Please enter the name of Periodical");
                    userTitle = sc.nextLine();

                    System.out.println("Please enter the issue number");
                    userInt = sc.nextInt();
                    sc.nextLine();

                    items[i] = new Periodical(userTitle,userInt);
                }


                else System.out.println("Error: invalid input");
            }while (!userString.equals("B") && !userString.equals("P"));
        }


        //Once the user has entered 5 items which could be any combination of Books and
        //Periodicals, show the user their collection.
        for (int i=0; i<size; i++){
            System.out.println("\n"+items[i].getListing());
        }


        //reclaim resource
        sc.close();
    }
}
