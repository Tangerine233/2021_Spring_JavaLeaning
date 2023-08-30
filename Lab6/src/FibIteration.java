/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 6
*/


//● Begin by creating an interface FindFib. It should have one method calculate_fib().
//○ calculate_fib() should take in an integer, and should return an integer.
interface FindFib{
    int calculate_fib(int i);
}



//● Next, create a class FibIteration that implements FindFib.
class FibIteration implements FindFib{

    //○ calculate_fib() should take in the same parameters and return the same type as the
    //interface version.
    //○ To calculate Fibonacci iteratively you start by checking if you are being asked to
    //calculate the Fibonacci of 1 or 2, if so you return 1. Otherwise, you’ll use a loop
    //to keep adding up the previous numbers until you arrive at the answer.
    @Override
    public int calculate_fib(int n) {
        int fib=0;
        int n1=0;
        int n2=1;

        if (n==1||n==2) fib =1;
        else {
            for (int i = 0;i<n-1;i++){
                fib = n1+n2;
                n1 = n2;
                n2 = fib;
            }
        }
        return fib;
    }
}



//● Next, create a class FibFormula that implements FindFib.
class FibFormula implements FindFib{

    //○ calculate_fib() should take in the same parameters and return the same type as the
    //interface version.
    //○ To calculate Fibonacci by formula, plug in to Binet's Formula:
    //■ F(n) = (((1+sqrt(5))/2)^n - ((1-sqrt(5))/2)^n) / sqrt(5)
    @Override
    public int calculate_fib(int i) {
        int fib;

        fib = (int) ((Math.pow( ((1+Math.sqrt(5)) /2) ,i ) - Math.pow( ((1-Math.sqrt(5))/2),i) ) / Math.sqrt(5));

        return fib;
    }
}