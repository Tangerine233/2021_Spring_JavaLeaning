/*
Class: CSE 1322L
Section: J03
Term: Spring 2021
Instructor: Joseph Tierno
Name: Kainuo He
Lab#: 4
*/


import java.math.BigDecimal;

//Create a class called “Account”. This will hold things that are true for all account types.
public class Account {
    //○ An attribute which will hold the account number
    public static int accountNum=10001;
    //○ An attribute which will hold the account balance.
    public double balance;
    public static int accountCounter=0;


    //○ default constructor method which opens the account with a balance of 0
    public Account(){
        accountCounter++;
        balance=0;
    }

    //○ An overloaded constructor which opens the account with a specific amount which is
    //passed to the constructor.
    public Account(double d){
        accountCounter++;
        balance = (int)(d*100)/100.0;
    }

    //○ Getter method for accessing the account_number.
    public int getAccountNum(){
        accountCounter++;
        return accountNum;
    }

    //○ Getter/Setter method for accessing the account balance.
    public double getBalance(){
        return balance;
    }
    public void setBalance(double newB){
        balance = newB;
    }

    //○ A withdrawal method which takes a parameter of the amount to be withdrawn and
    //deducts it from the balance.
    public void withdrawal(double drawAmount){
        balance -= drawAmount;
    }

    //○ A deposit method which takes a parameter of the amount to be deposited and adds it to
    //the balance.
    public void deposit(double addAmount){
        balance += addAmount;
        System.out.println("Doing default deposit");
    }
}




//● Create a class called “Checking” which should inherit from Account.
class Checking extends Account {
    //○ You will need an appropriate constructor to set the account balance.
    public Checking(){
    }
    public Checking(double d){
        accountCounter++;
        balance = (int)(d*100)/100.0;
    }


    int accountNum = 10000+accountCounter;

    //○ Modify the withdrawal method you inherited to check for the condition where they try to
    //overdraft their account.
    public void withdrawal(double drawAmount){
        balance -=drawAmount;
        //■ If an overdraft condition occurs you should print out “Charging an overdraft fee
        //of $20 because account is below $0”
        if (balance<0) {
            System.out.println("Charging an overdraft fee of $20 because account is below $0");
            //■ Deduct $20 from their balance.
            balance -= 20;
        }
    }

}





//● Create a class called “Savings” which should inherit from Account.
class Saving extends Account {

    private int depositCounter= 0;
    private double interest =0;

    //○ You will need an appropriate constructor to set the account balance.
    public Saving(){
    }
    public Saving(double d){
        accountCounter++;
        balance = (int)(d*100)/100.0;
    }


    int accountNum = 10000+accountCounter;

    // ○ Modify the withdrawal method so it implements the rules about dropping below $500
    public void withdrawal(double drawAmount) {
        balance = BigDecimal.valueOf(balance).subtract(BigDecimal.valueOf(drawAmount)).doubleValue();
        //■ If they drop below $500, you should print “Charging a fee of $10 because you are
        //below $500”
        if (balance<500) {
            System.out.println("Charging a fee of $10 because you are below $500");
            //■ Deduct $10 from their balance.
            balance -=10;
        }
    }

    //○ Modify the deposit method so it implements the charge for more than 5 deposits.
    public void deposit(double depositAmount) {
        balance += depositAmount;
        //■ As you do the deposit you should print “This is deposit 1 to this account”, where
        //1 would be updated to reflect what number deposit this is.
        depositCounter++;
        System.out.println("This is deposit number "+depositCounter+" to this account");

        //■ If you are doing the 6th or later deposit, print “Charging a fee of $10”, and deduct
        //$10 from their balance.
        if (depositCounter>=6){
            System.out.println("Charging a fee of $10");
            balance -= 10 ;
        }
    }

    //○ Add a method which adds 1.5% interest to the account. (This method will be called by
    //the teller manually once per year).
    public void addInterest() {
        //■ Print out how much the customer earned in interest as follows “Customer earned
        //15.25 in interest”. Of course it should reflect the actual amount.
        System.out.println("Customer earned "+(balance*0.015)+" in interest");
        interest = (int)(balance*1.5)/100.0;

        //■ Add the interest earned to their balance.
        balance+=(int)(interest*100)/100.0;
    }
}
