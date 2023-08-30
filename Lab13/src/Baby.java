import java.util.Random;

//● CCreate a Baby class which implements Runnable
public class Baby implements Runnable{
    //● It should have variables: time (int) and name (String).
    int time =0;
    String name ="";


    //● Write a constructor which takes in a name
    //○ Set the name variable in the object with the name you were passed.
    //○ Create a Random object
    //○ Set the time variable to your Random Object’s .nextInt(5000)
    public Baby(String s){
        name =s;
        Random rand = new Random();
        time = rand.nextInt(5000);
    }


    //● Create a method run() with no parameters
    //○ Print out “My name is X I am going to sleep for Yms” X should be the objects name, Y
    //should be the time you randomly chose.
    //○ Call Thread.sleep(time);
    //○ Print out “My name is X, I am awake, feed me!!!”
    //○ You will need to wrap the contents of your run method in a try/catch block, catching
        @Override
        public void run () {
        try {
            //○ Print out “My name is X I am going to sleep for Yms” X should be the objects name, Y
            //should be the time you randomly chose.
            System.out.println("My name is " + name + " I am going to sleep for " + time + "ms");

            //○ Call Thread.sleep(time);
            Thread.sleep(time);

            //○ Print out “My name is X, I am awake, feed me!!!”
            System.out.println("My name is " + name + ", I am awake, feed me!!!");

            //○ You will need to wrap the contents of your run method in a try/catch block, catching InterruptException
        } catch (InterruptedException e){
            System.out.println("InterruptedException: "+e.getMessage());
        } catch (Exception e){
            System.out.println("Exception: "+ e.getMessage());
        }
    }

}
