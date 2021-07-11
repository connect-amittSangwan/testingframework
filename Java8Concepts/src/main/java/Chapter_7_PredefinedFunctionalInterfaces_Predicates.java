import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.function.Predicate;

public class Chapter_7_PredefinedFunctionalInterfaces_Predicates {
    /*
    #Available in java.util.function package.

    Predefined Functional ( contains only 1 abstract method) Interfaces:
    1. Predicate
    2. Function
    3. Consumer
    4. Supplier

    Two argument predefined functional interfaces:
    1. BiPredicate
    2. BiFunction
    3. BiConsumer

    Primitive Functional Interfaces
    1. IntPredicate
    2. IntFunction
    3. IntConsumer

    #Functional interface is used to give the reference to lambda expressions.

 1. Predicate (I):
 public abstract boolean test(T t);

 For checking any booleon expression/conditions, predicate function can be used.

 Return type is always booleon however parameter passed can be different so the type needs to be specified.


     */
    static class Employee{
        public String name ;
        public int number;

        Employee(int number , String name){
            this.number = number;
            this.name = name;
        }

    }
    public static void main(String args[]){

        Predicate<Integer> p1 = i -> i%2==0;
        Predicate<Character> p2 = j -> j=='a' || j=='e'|| j=='i' || j=='u' || j=='o';
        Predicate<Employee> p3 = i -> i.name=="amit" && i.number == 13 ;

        // Write a predicate where length of string is greater then 5 or not.
        Predicate<String> lengthCheckPredicate = i -> i.length() >5;

        // Write a predicate to find the entries in a array whose length is greater then 5
        //Input Data
        String[] nameList = {"amit", "anu" , "sumit", "raman","raman raghav"};

        //Predicate having length >5
        Predicate<String> lengthGreaterThen5 = i -> i.length() > 5 ;

        //Predicate having length is in even numbers
        Predicate<String> evenLengh = i -> i.length()%2==0;

        for(String name : nameList){
            if(lengthGreaterThen5.test(name)){
                System.out.println(name + "Length is greater then 5");
            }

            if(evenLengh.test(name)){
                System.out.println("length is also a even number for : " + name);
            }
        }
        Employee emp1 = new Employee(13 , "amit");
        Employee emp2 = new Employee(13 , "anu");

        System.out.println(p2.test('c'));
        System.out.println(p2.test('e'));

        System.out.println("is Even: " + p1.test(3));
        System.out.println("is Even: " + p1.test(4));

        System.out.println(p3.test(emp1));
        System.out.println(p3.test(emp2));

        System.out.println(lengthCheckPredicate.test("amit"));
        System.out.println(lengthCheckPredicate.test("amit sangwan"));
    }

}
