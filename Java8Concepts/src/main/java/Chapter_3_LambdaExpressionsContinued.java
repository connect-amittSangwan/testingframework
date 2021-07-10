interface printInterface {

    void m1();
}

interface calculateInterface {

    int calculate(int a, int b);
}

public class Chapter_3_LambdaExpressionsContinued {
    //
    public static void main(String[] args) {

        printInterface obj = () -> System.out.println("Running m1 implementation");
        obj.m1();

        calculateInterface calculateInterfaceObj = (a, b) -> a + b;
        System.out.println(calculateInterfaceObj.calculate(3, 4));

        calculateInterfaceObj = (a, b) -> a * b;
        System.out.println(calculateInterfaceObj.calculate(3, 4));

        /*
        CalculatorInterfaceObj: Reference Variable
        (a,b):  Parameter for the abstract method of the interface
        {...}:  Implementation body of the abstract method of the interface.
         */
        calculateInterfaceObj = (a, b) -> {
            if (a > b) {
                return a + b;
            } else
                return a * b;
        };
        System.out.println(calculateInterfaceObj.calculate(3, 5));
        System.out.println(calculateInterfaceObj.calculate(4, 2));
    }
}