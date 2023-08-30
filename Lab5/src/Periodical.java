/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 5
*/

//Create a Periodical class which inherits from Item.
class Periodical extends Item {
    //● issueNum - A private attribute which holds the issue number (e.g. 103)
    private int issueNum;

    //● getter/setter for issueNum
    public int getIssueNum() {
        return issueNum;
    }

    public void setIssueNum(int issueNum) {
        this.issueNum = issueNum;
    }

    //● A constructor which takes no arguments
    public Periodical() {
        setTitle("");
        issueNum = 0;
    }

    //● An overloaded constructor which sets all the attributes in the Periodical class as well as
    //the Item class.
    public Periodical(String title, int issueNum) {
        setTitle(title);
        this.issueNum = issueNum;
    }

    //● A concrete version of the getListing() method which should return a string that contains
    //the following:
    //Periodical Title - Title
    //Issue # - Issue number
    @Override
    public String getListing() {
        return "Periodical Title - " + getTitle() +
                "\nIssue # - " + issueNum;
    }

}
