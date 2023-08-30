/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 1
*/


public class Lab1 {
    public static void main(String[] args) {
        // create a two dimensional array of characters with 4 rows and 13 columns
        char[][] myArr = new char[4][13];
        //Call the make_forward() method and store the result in the new array.
        myArr = make_forward();

        //Using loops, print out the array contents character by character.
        for (int i =0; i < myArr.length;i++){
            for (int j =0; j < myArr[0].length; j++){
                System.out.print(myArr[i][j]);
            }
            System.out.println("");
        }


        //create another 2d array of characters of the same size (4x13). Call the
        //make_mirror() method, passing it the original array returned from the make_forward() method.
        //Store the result in your new array.
        char[][] myArrInversed = new char[4][13];
        myArrInversed = make_mirror(myArr);

        //Print out the mirrored 2D array.
        for (int i =0; i < myArrInversed.length;i++){
            for (int j =0; j < myArrInversed[0].length; j++){
                System.out.print(myArrInversed[i][j]);
            }
            System.out.println("");
        }

        //print the forward and mirrored image on the same lines, so that
        //they face each other as if having a head on collision…
        for (int i =0; i < myArr.length;i++){
            for (int j =0; j < myArr[0].length; j++){
                System.out.print(myArr[i][j]);
            }
            for (int j =0; j < myArrInversed[0].length; j++){
                System.out.print(myArrInversed[i][j]);
            }
            System.out.println("");
        }
    }






    //Write a new method called make_mirror(). It should take a two dimensional array as a
    //parameter and return a mirrored version of that 2D array
    public static char[][] make_mirror(char[][] oldArr) {
        char[][] newArr = new char[oldArr.length][oldArr[0].length];

        for (int i =0; i < oldArr.length;i++){
            for (int j =0; j < oldArr[0].length; j++){
             switch (oldArr[i][j]){
                 case '(': newArr[i][oldArr[0].length-1-j] = ')';break;
                 case ')': newArr[i][oldArr[0].length-1-j] = '(';break;
                 case '/': newArr[i][oldArr[0].length-1-j] = '\\';break;
                 case '\\': newArr[i][oldArr[0].length-1-j]= '/';break;
                 default: newArr[i][oldArr[0].length-1-j] = oldArr[i][j];
                 }
            }
        }

        return newArr;
    }



    //copied array method from Lab1 instruction
    public static char[][] make_forward() {
        char[][] pixel = new char[4][13];
        pixel[0][0] = ' ';
        pixel[0][1] = ' ';
        pixel[0][2] = '_';
        pixel[0][3] = '_';
        pixel[0][4] = '_';
        pixel[0][5] = '_';
        pixel[0][6] = '_';
        pixel[0][7] = '_';
        pixel[0][8] = ' ';
        pixel[0][9] = ' ';
        pixel[0][10] = ' ';
        pixel[0][11] = ' ';
        pixel[0][12] = ' ';
        pixel[1][0] = ' ';
        pixel[1][1] = '/';
        pixel[1][2] = '|';
        pixel[1][3] = '_';
        pixel[1][4] = '|';
        pixel[1][5] = '|';
        pixel[1][6] = '_';
        pixel[1][7] = '\\';
        pixel[1][8] = '\'';
        pixel[1][9] = '.';
        pixel[1][10] = '_';
        pixel[1][11] = '_';
        pixel[1][12] = ' ';
        pixel[2][0] = '(';
        pixel[2][1] = ' ';
        pixel[2][2] = ' ';
        pixel[2][3] = ' ';
        pixel[2][4] = '_';
        pixel[2][5] = ' ';
        pixel[2][6] = ' ';
        pixel[2][7] = ' ';
        pixel[2][8] = ' ';
        pixel[2][9] = '_';
        pixel[2][10] = ' ';
        pixel[2][11] = '_';
        pixel[2][12] = '\\';
        pixel[3][0] = '=';
        pixel[3][1] = '\'';
        pixel[3][2] = '-';
        pixel[3][3] = '(';
        pixel[3][4] = '_';
        pixel[3][5] = ')';
        pixel[3][6] = '-';
        pixel[3][7] = '-';
        pixel[3][8] = '(';
        pixel[3][9] = '_';
        pixel[3][10] = ')';
        pixel[3][11] = '-';
        pixel[3][12] = '\'';
        return pixel;
    }
}