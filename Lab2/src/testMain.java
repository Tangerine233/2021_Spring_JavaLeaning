import java.util.Scanner;

public class testMain {
    public static void main(String[] args) {
        float price = (float) 1.1234;
        char letters[]=new char[5];

        letters[0]='a';
        letters[1]='b';
        letters[2]='c';
        letters[3]='d';
        letters[4]='e';

        String x="";
        for(int i=4;i>=2;i--) {
            x+=letters[i];
        }
        System.out.println(x);


        do_stuff_1();
    }
    public static void do_stuff_1() {
        System.out.println("hi");
        return;
    }
    public static int do_stuff_2() {
        return 2;
    }
    public static char do_stuff_3() {
        return 'c';
    }
    public static boolean do_stuff_4() {
        return false;
    }
}
