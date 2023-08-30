/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 2
*/


import java.util.ArrayList;

public class Caesar {
    //declare values
    ArrayList<Character> alphabet = new ArrayList<Character>();


    //default constructor
    public Caesar(){
        for (char letter = 'a'; letter<='z'; letter++){
            alphabet.add(letter);
        }
    }



    //1) Add a method position_of_char which takes in a character and returns the index
    //of that character in the arraylist. i.e ‘a’ would return 0, ‘b’ should return 1.
    public int position_of_Char(char c){
        int index = -1;

        for (int i=0;i<alphabet.size();i++){
            if (c == alphabet.get(i)){
                index = i;
            }
        }

        return index;
    }


    //2) Add a method letter_at_pos which takes in an integer and returns the character
    //in that cell. i.e. 0 should return ‘a’, 1 should return ‘b’.
    public char letter_at_pos(int i){
        return alphabet.get(i);
    }


    //3) Add a method encrypt_char which takes in a character and returns the encrypted
    //version of that character. The pseudocode for this method is:
    public char encrypt_char(char c) {
        //a) Convert the letter that was passed in as a parameter into a number. Do
        //this by calling the position_of_char above.
        int p = -1;
        p = position_of_Char(c);

        //b) Calculate the new index. Add 3 to the number you got in step a. If the
        //result is 26 or greater, subtract 26.
        p +=3;
        if (p>=26) p -= 26;


        //c) Lookup the encrypted letter by passing the new index you calculated in
        //step b to letter_at_pos
        //d) Return the encrypted letter.
        return letter_at_pos(p);
    }



    //4) Add a method decrypt_char which takes in a character and returns the decrypted
    //version of that character. The pseudocode for this method is:
    public char decrypt_char(char c) {
        //a) Convert the letter that was passed in as a parameter into a number. Do
        //this by calling the position_of_char above.
        int p;
        p = position_of_Char(c);

        //b) Calculate the new index. Subtract 3 from the number you got in step a. If
        //the result is less than 0, add 26 to it.
        p -= 3;
        if (p<0) p+=26;

        //c) Lookup the decrypted letter by passing the new index calculated in step b
        //to letter_at_pos
        //d) Return the decrypted letter.
        return letter_at_pos(p);
    }



    //5) Add a method encrypt, which takes in a string and returns the encrypted version
    //of that string. Do the following steps
    public String encrypt(String s) {
        //a) Create an empty string called ciphertext. Initialize it to an empty string.
        String ciphertext ="";

        //b) Write a for loop, which goes from 0 to the length of the string which was
        //passed in. You can find the length of a string in Java with the .length()
        //method, while in C# you’ll access the .Length attribute.
        for (int i =0; i<s.length(); i++) {
            //i) Extract one letter from the string at the position of the loop index.
            //ii) Use the encrypt_char method to change that one character from
            //plaintext to cipher text.
            //iii) Add the new letter that was returned from encrypt_char to your
            //ciphertext string.
            ciphertext = ciphertext + (encrypt_char(s.charAt(i)));
        }

        //c) Return the Ciphertext string.
        return ciphertext;
    }




    //6) Add a method decrypt, which takes in a string of encrypted text and returns the
    //plaintext. You’ll follow the same steps as encrypt, but this time call decrypt_char
    //instead of encrypt_char.
    public String decrypt(String s){
        String ciphertext="";

        for (int i =0; i<s.length(); i++){
            ciphertext = ciphertext + decrypt_char(s.charAt(i));
        }

        return ciphertext;
    }
}
