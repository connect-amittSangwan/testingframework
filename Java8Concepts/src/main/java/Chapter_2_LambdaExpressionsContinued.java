public class Chapter_2_LambdaExpressionsContinued {

//         # How to call/invoke lambda expressions ?
//          - Using Functional Interfaces
//          - Functional interface objects is used to refer the lambda expressions.
//          - Functional interface reference is used to hold lambda expressions
    public static void main(String args[]){

    }

    @FunctionalInterface
    interface functionalInterface
    {
        public abstract void m1();

        default void m2(){

        }

        static  void m3(){

        }
    }

    // More then 1 abstract method, so its not an functional interface
    interface NonfunctionalInterface
    {
        public abstract void m1();
        public abstract void m5();

        default void m2(){

        }

        static  void m3(){

        }
    }

    /*

   #Interfaces examples:

   ### IMPORTANT NOTE: AFTER JAVA 1.8, Interface can contains default method and static methods.  ###

   default void m1(){

   }

   static void m2(){

   }

   // Restriction is only for abstract methods, any number of default or static methods can be there for below example:

   Random Note: The interfaces which contains single abstract method are called functional interface.

   - Runnable ( contains run() method only )
   - Callable ( contains call() method only )
   - Comparable ( contains compareTo() method only ) etc.

   Random Note: The interface which does not contain any method is called marker interface.
   Just after implementing the interface interface object gets any ability

   - Serializable ( does not contain any method )
   - RandomAccess ( does not contain any method )
   - Cloneable ( does not contain any method )
   - SingleThreadModel ( does not contain any method ) etc.

   Random Note: Throwable is a Class which is the root class of Java Exception Hierarchy.


   @FunctionalInterface
   - Annotation tells explicitly that the interface is functional interface.
   - By default if only one abstract method is there in the interface the interface is functional interface.

    */

}
