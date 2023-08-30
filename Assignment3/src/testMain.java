abstract class A {
    public int do_stuff1() {
        return 3;
    }
    public int do_stuff2() {
        return 7;
    }
}

class B extends A {
    @Override
    public int do_stuff1() {
        return 4;
    }

    public int do_stuff2() {
        return 2;
    }
}

class Main {
    public static void main(String[] args) {

        //Note the polymorphism:
        A myB = new B();
        System.out.println(myB.do_stuff1());
        System.out.println(myB.do_stuff2());
    }
}