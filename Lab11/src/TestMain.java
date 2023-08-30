public class TestMain {
    public static void main(String[] args) {
        try{
            doS();

            System.out.println("X");
        }catch (Exception e){
            System.out.println(e);
        }
    }

    public static void doS(){
        int[] n = new int[2];
        n[2] = 1;
    }
}
