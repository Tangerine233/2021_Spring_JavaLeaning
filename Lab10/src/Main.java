/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 10
*/

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        //set up scanner
        Scanner sc = new Scanner(System.in);

        //declare values
        String userS1=null;
        String userS2=null;

        //Using the repeatNTimes method print out the string “I must study recursion
        //until it makes sense\n” 100 times.
        System.out.println(repeatNTimes("“I must study recursion until it makes sense\n",100));

        //Next prompt the user for string 1 (e.g. s1), then prompt the user for string 2
        //(e.g. s2).
        System.out.println("Enter the first string");
        userS1 = sc.nextLine();
        System.out.println("Enter the second string");
        userS2 = sc.nextLine();

        //○ Call your isReverse method passing it the first and second strings entered
        //by the user.
        //○ If they are the reverse print s1+” is the reverse of “+s2
        //○ If they the second is not the reverse of the first, print s1+” is not the reverse
        //of “+s2
        if (isReverse(userS1,userS2)) System.out.println(userS1+" is reverse of "+userS2);
        else System.out.println(userS1+" is not reverse of "+userS2);


        //reclaim resource
        sc.close();
    }



    //● Recursive method repeatNTimes
    //○ Takes in a string and an integer as parameters
    //○ Catenates the string to itself the number of times indicated. Returns the
    //resulting string.
    //○ For example, if passed “Hi”, 4. It would return “HiHiHiHi”. If passed
    //“This is a test “,2, it would return “This is a test This is a test”.
    //○ If passed “Test”,0, it should return an empty string “”
    public static String repeatNTimes(String s, int i){
        String newS =s;
        int newI =i;
        while (newI!=0){
            newS+=s;
            newI--;
        }
        return newS;
    }


    //● Recursive method isReverse
    //○ Takes in 2 strings as parameters
    //○ Returns a boolean indicating if the 2 strings have the same characters but
    //reversed from eachother.
    //○ For example, if passed “Hello” and “olleH” it would return true
    //○ If passed “a” and “a” it would return true
    //○ If passed “Test” and “Test” it would return false.
    //○ 2 empty strings should be considered the reverse of each other.
    //○ Capitalization must also match. I.e. abcd and DCBA should return false.
    //○ You will may find the following methods helpful:
    //■ Java: string.length(), string.charAt(0), string.substring()
    //■ C#: string.Length, string[0], string.Substring()
    public static boolean isReverse(String s1, String s2){
        String reverseS1="";

        //reverse s1
        for (int i=s1.length()-1;i>=0;i--){
            reverseS1+=s1.charAt(i);
        }

        //check Is reversed
        if (reverseS1.equals(s2)) return true;
        else return false;
    }


}
