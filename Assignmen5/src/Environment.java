/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 5
*/

//● Create an Environment class:
class Environment {
    //○ It should store the current temperature as an int in a private attribute.
    private int tempe;

    //○ It should have getters/setters for the temperature.

    public int getTempe() {
        return tempe;
    }
    public void setTempe(int tempe) {
        this.tempe = tempe;
    }

    //○ It should have a constructor which sets the current temperature.
    public Environment(){
        this(0);
    }
    public Environment(int tempe){
        this.tempe = tempe;
    }
}


//● Create a Cricket class:
class Cricket{
    //○ Create a method getChirpCount() which takes in an Environment object as a
    //parameter.
    public int getChirpCount(Environment e) {
        int chirp;

        //○ Using the above formula return the number of chirps you expect to hear given the
        //temperate set in the Environment.
        chirp = e.getTempe()*4 - 40;

       return chirp; //○ Return the number of chirps we’ll hear.
    }
}



//● Create a ClemsonCricket class:
class ClemsonCricket extends Cricket{ //○ Inherit from the cricket class

    //○ Override the getChripCount() method.
    @Override
    public int getChirpCount(Environment e) { //■ It should take an Environment object as a parameter
        //■ Calculate the number of chirps for a Clemson Cricket which chirps 20%
        //slower than the other Crickets.
        return (int)(super.getChirpCount(e)*0.8);
    }
}