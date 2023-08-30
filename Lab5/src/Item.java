/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 5
*/

//Create an abstract class called Item.
abstract class Item {
    //title - A private attribute of type string.
    private String title;


    // A getter/setter for title
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }

    //A constructor that takes no arguments and sets title to empty string
    public Item(){
        title = "";
    }

    //A constructor which takes a title and sets the title attribute.
    public Item(String s){
        title = s;
    }

    //getListing() is an abstract method that returns a string and is implemented in classes Book
    //and Periodicals.
    abstract public String getListing();


    //An override of toString/ToString which returns the title

    @Override
    public String toString() {
        return title;
    }
    public String ToString(){
        return title;
    }
}


