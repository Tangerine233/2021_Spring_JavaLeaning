import java.util.Random;

//● Create a class called Guesser. It must have:
public class Guesser implements Runnable{
    //○ A public threadID (int)
    public int threadID=0;
    //○ A public static nextThreadID (int) initialized to 0
    public static int nextThreadID=0;

    //○ A constructor which takes no parameters that sets the threadID to the
    //nextThreadID, then increments the nextThreadID
    public Guesser(){
        threadID=nextThreadID;
        nextThreadID++;
    }

    //○ A method run() which takes no parameters and returns void
    @Override
    public void run() {
        //■ Create an object of type Random
        Random rand = new Random();
        int myNum=0;
        int guess=0;

        //■ Write a loop which keeps going until the Random number generator picks
        //the number 123456.
        do {
            guess++;

            //● Each time through the loop pick a new number between 0 and 1000000
            myNum= rand.nextInt(1000000);

            //● When it picks 123456 print the message “I’m thread X, I just
            //found the number on guess Y”.
            //● You should replace X with the threadID
            //● You should replace Y with the number of guesses you’ve tried so
            //far.
            if (myNum==123456) System.out.println("I’m thread "+threadID
                    +", I just found the number on guess "+guess);

            //● The loop and method should end once the target number (123456)
            //is picked.
        }while (myNum!=123456);

    }
}
