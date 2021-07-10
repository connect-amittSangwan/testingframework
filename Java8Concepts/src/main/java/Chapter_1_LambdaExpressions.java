public class Chapter_1_LambdaExpressions {
/*
Java 8 mojor changes:
1. Lambda Expressions
2. Functional Interfaces
3. Default Methods
            Predefined Functional Interfaces
4. Predicates
5. Functions
            Suppliers
            Consumers
6. Double Color Operator
            (Constructor and Method reference)
7. Stream API
8. Date and Time API
            ( JODA Time API)
*/

    public static void main(String[] args) {
    // Lambda expressions are anonymous functions/nameless functions., also called closures.
    // Syntax: (parameters) -> {body}
    // No Name, No Return Type, No Modifiers

        int a =5 ;

        System.out.println();

    }

//Example 1:

    public void m1(){
        System.out.println("Hello Function");
    }

  // ### Convert above method to lambda expression:

    // m1 Name : Not Required
    // void return type: Not Required
    // public modifier: Not Required

    // m1 method converted to lambda expression:  () -> { System.out.println("Hello Function");}
    // Curly braces are also optional so it become: () -> System.out.println("Hello Function");
    // Curly braces are used when body contains more then 1 statement.

//Example 2:

    public void add(int a , int b){
        System.out.println(a+b);
    }
    // ### Convert above method to lambda expression:

    // (int a, int b ) -> System.out.println(a+b);
    // (a,b) -> System.out.println(a+b);

//Example 3:

    public int square(int n){
        return n*n;
    }

    // ### Convert above method to lambda expression:
    // (n) -> n*n;

/*
Conclusion:
1. Any number of arguments can be passed in lambda expressions.
2. For one-argument lambda expression parenthesis are optional.
3. For one-statement body curly braces are optional.

*/

}