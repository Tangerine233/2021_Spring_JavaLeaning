/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 12
*/


public class Main {
    public static void main(String[] args) {
        //○ Create an array of 100 Threads
        Thread[] g = new Thread[100];

        //○ Using a loop, instantiate a new Thread with your Guesser worker in each cell of
        //the array.
        for (int i=0;i<100;i++){
            g[i]= new Thread(new Guesser());
        }

        //○ Start all 100 threads.
        for (int i=0;i<100;i++){
            g[i].start();
        }
    }
}
