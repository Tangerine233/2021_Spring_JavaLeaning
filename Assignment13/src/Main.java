/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 13
*/


import java.util.Scanner;

//4. Write a main program which does the following:
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title;
        String director;
        int yearRelease;
        Double cost;
        //3. Update the main method to include options
        //  3. Search collection
        //  4. Remove BlueRay from collection
        String menu ="0. Quit\n1. Add BlueRay to collection\n2. See collection\n3. Search collection\n4. Remove BlueRay from collection";
        int userChoice=-1;

        //a. Instantiate a BlueRayCollection
        BlueRayCollection col = new BlueRayCollection();


        while (userChoice!=0) {
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

            switch (userChoice) {
                case 0:
                    break;
                case 1:
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
                    break;
                case 2:
                    col.show_all();
                    break;

                //In both cases, prompt the user for the title to search for or remove, then call the appropriate
                //method in the BlueRayCollection class.
                case 3:
                    System.out.println("What title to search for?");
                    title = sc.nextLine();
                    System.out.println(col.search(title));
                    break;
                case 4:
                    System.out.println("What title to remove?");
                    title = sc.nextLine();

                    //If the remove method returns false print “Not Found”. Otherwise print “[title] deleted”.
                    if (col.remove(title)){
                        System.out.println(title+" is deleted");
                    }else System.out.println("Not Found");
                    break;
                default:
                    System.out.println("Invalid input, try again");
            }

            System.out.println("");
        }


    }
}
