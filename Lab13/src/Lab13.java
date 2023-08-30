/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 13
*/

public class Lab13 {
    public static void main(String[] args) {
        //● In your main class’s main method, do the following:
        //○ Thread b1 = new Thread(new Baby(“Noah”));
        Thread b1 = new Thread(new Baby("Noah"));

        //○ Repeat this for b2, b3, b4, b5. They should be named Noah, Olivia, Liam, Emma,
        //Amelia.
        Thread b2 = new Thread(new Baby("Olivia"));
        Thread b3 = new Thread(new Baby("Liam"));
        Thread b4 = new Thread(new Baby("Emma"));
        Thread b5 = new Thread(new Baby("Amelia"));

        //○ Start all 5 babies with a statement like “b1.start();”
        b1.start();
        b2.start();
        b3.start();
        b4.start();
        b5.start();
    }
}
