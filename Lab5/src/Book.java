/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 5
*/

//Create a Book class which inherits from Item.
class Book extends Item {
    //● isbn_number - A private attribute which holds an ISBN number (13 digits) to identify
    //the book
    private int isbn_number;
    //● author - A private attribute which holds the authors name (string)
    private String author;


    //● getters/setters for the attributes in this class.
    public int getIsbn_number() {
        return isbn_number;
    }

    public void setIsbn_number(int isbn_number) {
        this.isbn_number = isbn_number;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }


    //● A constructor which takes no arguments
    public Book() {
        setTitle("");
        isbn_number = 0;
        author = "";
    }

    //● An overloaded constructor which sets all the attributes in the Book class as well as the
    //Item class.
    public Book(String title, int isbn_number, String author) {
        setTitle(title);
        this.isbn_number = isbn_number;
        this.author = author;
    }

    //● A concrete version of the getListing() method which should return a string that contains
    //the following:
    //Book Name - Title
    //Author - Author
    //ISBN # - ISBN number
    @Override
    public String getListing() {
        return "Book Name - " + getTitle() +
                "\nAuthor - " + author +
                "\nISBN# - " + isbn_number;
    }
}
