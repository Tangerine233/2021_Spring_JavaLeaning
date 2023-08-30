/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Assignment#: 10
*/

//Create a custom Exception called ColumnFull.
//● It should have a constructor which takes in a message and calls it’s parent’s constructor with
//that message.
class ColumnFull extends Exception{
    ColumnFull(){}
    ColumnFull(String s){
        super(s);
    }
}


//Create a class ConnectFour it should have:
public class ConnectFour {
    //● A two dimensional (2D) array with 6 rows and 7 columns. Each should hold a character
    int row = 6;
    int columns = 7;
    char[][] board = new char[row][columns];
    //● A string which keeps track of who’s turn it is (Red or Yellow)
    String turn = "";
    //● A character which keeps track of the next token to play (R for red or Y for Yellow).
    char token = ' ';

    //● A constructor which takes no parameters
    //○ Initialize all spaces in the 2D array to an empty space ‘ ‘
    //○ Set the turn variable to Red, set the token to R
    ConnectFour(){
        for (int i=0;i<row;i++){
            //○ Initialize all spaces in the 2D array to an empty space ‘ ‘
            for (int j=0;j<columns;j++){
                board[i][j] = ' ';
            }
            //○ Set the turn variable to Red, set the token to R
            turn = "Red";
            token = 'R';
        }
    }

    //● A method called nextTurn which takes no parameters.
    public void nexTurn() {
        //○ If the current turn is Red, set the turn variable to Yellow and the token to Y, otherwise
        //set the turn variable to Red and the token to R
        if (turn.equals("Red")) {
            turn = "Yellow";
            token = 'Y';
        }
        else {
            turn = "Red";
            token = 'R';
        }
    }

    //● A method called nextAvailablePosition which takes in a column number and returns an int.
    //○ This method should look at the column that was passed in, and find the first empty spot
    //in the column.
    public int nextAvailablePosition(int n) {
        //○ I.e. in your 2D array start at the bottom (row 5) in that column and check if that cell is
        //an empty space ‘ ‘. If it is, return 5, otherwise check row 4, then 3, then 2, 1 and finally
        //0. If cell 0 is full return -1 to indicate the column is full.
        for (int i=row-1;i>=0;i--){
            if (board[i][n]==' ') return i;
        }

        return -1;
    }

    //● A method called dropPiece which takes in a column and a token. It places the piece into the
    //appropriate row of the 2D array (use nextAvailablePosition to find this). If the row is full, it
    //should throw an exception called ColumnFull.
    public void dropPiece(int c, char t) throws ColumnFull {
        for (int i=row-1;i>=0;i--){
            if (board[i][c]==' ') {
                board[i][c] = t;
                break;
            }
            if (i==0) throw new ColumnFull("That column is full try again");
        }
    }

    //● Add the following override for toString/ToString so you can see the state of the board:
    @Override
    public String toString() {
        String to_return="  0   1   2   3   4   5   6";
        for(int i=0;i<6;i++) {
            to_return+="\n-----------------------------\n";
            to_return+="| ";
            for(int j=0;j<7;j++) {
                to_return+=board[i][j]+" | ";
            }
        }
        to_return+="\n-----------------------------\n";
        return to_return;
    }

}
