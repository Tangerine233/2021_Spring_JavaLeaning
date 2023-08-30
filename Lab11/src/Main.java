/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 11
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        //set up Scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        int sec1 = 0;
        int sec2 = 0;

        try {
            System.out.println("Enter time 1 in 24hr format as follows (HH:MM:SS)");
            sec1 = timeInSec(sc.nextLine());
            System.out.println("Enter time 2 in 24hr format as follows (HH:MM:SS)");
            sec2 = timeInSec(sc.nextLine());

            System.out.println("Difference in seconds: " + Math.abs(sec1 - sec2));
        }
        catch (InvalidTimeException e){
            System.out.println(e.getMessage());
        }

        //reclaim resource
        sc.close();
    }


    //Write a method which takes in a string, and returns an integer. The string should be in the format
    //HH:MM:SS for example 12:20:30
    public static int timeInSec(String s) throws InvalidTimeException {
        int hr = 0;
        int min = 0;
        int sec = 0;
        int totalSec = 0;


        //Your method should break the string apart into 3 pieces. In java you might find string.split(“:”,3) useful,
        //in C# string.Split(“:”,3)
        String[] userString = s.split(":", 3);
        if (userString.length < 3) throw new InvalidTimeException("Enter a valid time");

        //Convert each number to an int, and validate the sanity of each number. Hours should be 0-23, minutes
        //and seconds should be 0-59. Anything outside those ranges should throw a
        hr = Integer.parseInt(userString[0]);
        min = Integer.parseInt(userString[1]);
        sec = Integer.parseInt(userString[2]);

        if (hr >= 24) throw new InvalidTimeException("Hour must be below 24");
        else if (hr < 0) throw new InvalidTimeException("Hour can't be below 0");
        else if (min >= 60) throw new InvalidTimeException("Minutes must be less than 60");
        else if (min < 0) throw new InvalidTimeException("Minutes can't be less than 0");
        else if (sec >= 60) throw new InvalidTimeException("Second must be less than 60");
        else if (sec < 0) throw new InvalidTimeException("Second can't be less than 0");

        totalSec = hr * 60 * 60 + min * 60 + sec;


        return totalSec;
    }
}
