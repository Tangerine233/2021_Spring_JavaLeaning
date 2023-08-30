/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 14
*/


import java.util.Scanner;

//4. Write a main program which does the following:
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String menu ="0. Quit\n1. Add BlueRay to collection\n2. See collection";
        int userChoice=-1;

        //a. Instantiate a BlueRayCollection
        BlueRayCollection col = new BlueRayCollection();


        while (userChoice!=0){
            //b. Present the user with a menu that gives the following choices:
            //0. Quit
            //1. Add BlueRay to collection
            //2. See collection
            System.out.println(menu);


            //c. Read in the users choice. If they choose 1, prompt the user for a title, director,
            //year of release and year, and call the add method in the BlueRayCollection object
            //you created. If they choose 2, call the show_all method in the BlueRayCollection
            //object you created
            userChoice = sc.nextInt();
            sc.nextLine();

            if (userChoice==1){
                String title;
                String director;
                int yearRelease;
                Double cost;

                System.out.println("What is the title?");
                title = sc.nextLine();
                System.out.println("What is the director?");
                director = sc.nextLine();
                System.out.println("What is the year of release?");
                yearRelease = sc.nextInt();
                sc.nextLine();
                System.out.println("What is the cost?");
                cost = sc.nextDouble();
                sc.nextLine();

                col.add(title, director, yearRelease, cost);
            }
            else if (userChoice==2){
                col.show_all();
            }
            else if (userChoice!=0){
                System.out.println("Invalid input, try again");
            }
        }


    }
}
