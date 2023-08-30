/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 11
*/

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //declare values
        String userFileName = null;
        String lineTemp =null;
        char charTemp =0;
        boolean wordReading = false;

        int charCounter =0;
        int wordCounter =0;
        int lineCounter =0;

        try {
            //1) Prompt the user for a file name
            System.out.println("Enter a filename:");
            userFileName = sc.nextLine();

            FileInputStream fis = new FileInputStream(userFileName);
            Scanner fsc = new Scanner(fis);


            //2) Read in the file line by line
            //      a) Be sure to catch any exceptions that happen, for example if the file doesn’t exist.
            while (fsc.hasNextLine()) {
                lineTemp = fsc.nextLine();
                wordReading = true;
                for (int i = 0; i < lineTemp.length(); i++) {
                    //3) Split each line into words (Hint: Words have spaces before and after them)
                    if (i == 0 && lineTemp.charAt(i) != ' ') wordCounter++;
                    else if (lineTemp.charAt(i) == ' ' && lineTemp.charAt(i + 1) != ' ') wordCounter++;

                    //4) Split each line into characters
                    //      a) Count the characters. Note: spaces, periods, commas are not characters.
                    charTemp = lineTemp.charAt(i);
                    if (charTemp != ' ' && charTemp != ',' && charTemp != '.') charCounter++;
                }

                //5) Keep track of the total number of lines, words and characters.
                lineCounter++;
            }

            //6) Be sure to close out your file correctly.
            fis.close();

            //7) Print out the total number of Lines, Words and Characters.
            System.out.println("Lines: " + lineCounter +
                    "\nWords: " + wordCounter +
                    "\nChars: " + charCounter);


        }catch (IOException e){
            System.out.println("Error: "+userFileName+e.getMessage());
        }

        sc.close();
    }
}
