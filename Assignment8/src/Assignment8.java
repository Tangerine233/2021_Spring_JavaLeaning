/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 8

*/

public class Assignment8 {
    public static void main(String[] args) {
        for (int i = 1; i < 10; i++) {
            String fold_string = paperfold(i);
            System.out.println("For " + i + " folds we get: " + fold_string + "\n");

        }
    }



    //Write a helper method reverse which takes in a string and returns the string backwards.
    //For example, if given “Hello”, it will return “olleH”
    public static String reverse(String s){
        if (s.length()==1)return s;
        else return s.charAt(s.length()-1)+reverse(s.substring(0,s.length()-1));
    }

    //Write a helper method which converts all ^ to v and all v to ^ in a string. It should take
    //in and return a string.
    public static String convert(String s){
        //create newString
        String newS="";

        for (int i=0;i<s.length();i++){
            if (s.charAt(i)=='^') newS+='v';
            else if (s.charAt(i)=='v') newS+='^';
            else newS+="#";
        }
        return newS;
    }


    //Write a static method, paperFold, which is a recursive routine that returns a string
    //representing the fold pattern for a paper folded n times. The driver program will call the
    //paperFold method
    public static String paperfold(int n){
        if (n==1) return "v";
        else return convert(reverse(paperfold(n-1)))+'v'+paperfold(n-1);
    }

}
