/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 4
*/

import java.util.*;
class GuessNumber {
   public void play_game(){
        //set up scanner
       Scanner sc = new Scanner(System.in);

       //declare value
       int userInt=0;
       Language userLang = null;

       //This method will first pick a random number between 0 and 100.
       Random myRand = new Random();
       int theInt = myRand.nextInt(101);

       //Prompt the user to select a language to play in:
       do {
           System.out.println("Choose your language\n" +
                   "1. English\n" +
                   "2. Español\n" +
                   "3. Français\n" +
                   "4. 简体中文");
           userInt = sc.nextInt();
           sc.nextLine();

           switch (userInt){
               case 1:
                   userLang = new English();
                   break;
               case 2:
                   userLang = new Spanish();
                   break;
               case 3:
                   userLang = new French();
                   break;
               case 4:
                   userLang = new SimplifiedChinese();
                   break;
               default:
                   System.out.println("Error: invalid input\n");
           }
       }while (userInt>4||userInt<1);



       //Using the object you created in the last step, prompt the user to enter their
       //guess.
       // Read in the user’s guess. If it’s too high, too low or correct, give them the
       //appropriate prompt in the appropriate language.
       do {
           System.out.println(userLang.make_guess());
           userInt = sc.nextInt();

           if (userInt>theInt){
               System.out.println(userLang.too_high());
           }
           else if (userInt<theInt){
               System.out.println(userLang.too_low());
           }
           else {
               System.out.println(userLang.correct());
           }
       }while (userInt!=theInt);

   }

}
