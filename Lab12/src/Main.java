/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 12
*/

import java.io.*;
import java.util.*;

public class Main {
    public static void main(String[] args) {
        //set up Scanner
        Scanner sc = new Scanner(System.in);


        int lineCounter =0;

        try {
            //a. Prompt the user for both file names.
            //b. Open both files, and read them in line by line. Keep track of what line number
            //you are on.
            System.out.println("Enter the First File's Name:");
            String userFileName1 = sc.nextLine();
            FileInputStream fis1 = new FileInputStream(userFileName1);

            System.out.println("Enter the Second File's Name:");
            String userFileName2 = sc.nextLine();
            FileInputStream fis2 = new FileInputStream(userFileName2);


            Scanner f1sc = new Scanner(fis1);
            Scanner f2sc = new Scanner(fis2);

            ////b. Open both files, and read them in line by line. Keep track of what line number
            //            //you are on.

            while (f1sc.hasNextLine()&&f2sc.hasNextLine()){
                String fileString1 = f1sc.nextLine();
                String fileString2 = f2sc.nextLine();
                if (!fileString1.equals(fileString2)){
                    System.out.println("Line "+ lineCounter);
                    System.out.println("<"+fileString1);
                    System.out.println(">"+fileString2);
                }
                lineCounter++;
            }
            //d. If the two files have a different number of lines, you should output “Files have
            // different number of lines”
            if ((f1sc.hasNextLine()&&!f2sc.hasNextLine())||(!f1sc.hasNextLine()&&f2sc.hasNextLine())){
               System.out.println("Files have different number of lines");
            }

            fis1.close();
            fis2.close();
        } catch (IOException e){
            System.out.println(e.getMessage());
        }

        catch (Exception e){
            System.out.println(e.getMessage());
        }

        sc.close();
    }
}
