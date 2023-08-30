/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 10
*/


import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int userInput = 0;

        //● In your main method do the following:
        //○ Instantiate a Connect4 object
        ConnectFour c = new ConnectFour();

        //○ Using a loop keep prompting the user until they enter 9 to exit
        while (userInput!=9){
            try {
                System.out.println(c.toString());
                //■ Which column would Red like to go in (9 to quit)
                System.out.println("Which column would "+c.turn+" like to go in (9 to quit)");
                //■ Read in their answer.
                userInput = sc.nextInt();
                //■ If they give you a value between 0 and 6:
                if (userInput >= 0 && userInput <= 6) {
                    //● Call the dropPiece method in your Connect4 object
                    c.dropPiece(userInput, c.token);
                    //● Call the nextTurn method in your Connect4 object
                    c.nexTurn();
                }
                else if (userInput!=9)System.out.println("***************Invalid input*****************\n");
            }
            //● Check to ensure you didn't hit an exception, if you did, let the user
            //know the column is full, and let the SAME user go again.
            catch (ColumnFull e){
                System.out.println(e.getMessage());
            }
        }//■ If the user enters 9, exit the loop



    }
}
