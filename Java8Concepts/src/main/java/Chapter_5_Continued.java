interface multipleMethodInterfac {

    void m1();

    void m2();
}

public class Chapter_5_Continued {

    public static void main(String[] args) {

        multipleMethodInterfac interObj = new multipleMethodInterfac() {
            // Anonymous inner class
            // Lambda expressions can not be used as there are MORE THEN 1 abstract method.
            @Override
            public void m1() {
                System.out.println("m1 running");
            }

            @Override
            public void m2() {
                System.out.println("m2 running");

            }
        };
        interObj.m1();
        interObj.m2();

    }
}
