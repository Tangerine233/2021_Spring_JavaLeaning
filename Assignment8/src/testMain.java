public class testMain {
    public static void main(String[] args) {
        System.out.println(pblmOne(2));
    }
    public static int pblmOne(int myNum){
        if (myNum <=0) {
            return 1;
        }
        else {
            return pblmOne(myNum-1) + pblmOne(myNum-2);
        }
    }
}
