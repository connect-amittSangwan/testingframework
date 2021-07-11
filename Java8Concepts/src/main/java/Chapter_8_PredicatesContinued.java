import java.util.function.Predicate;

public class Chapter_8_PredicatesContinued {
    /*

        Refer to the example for predicate joins concept.

     */
    public static void main(String args[]){

        Predicate<Integer> evenNumberPredicagte = i -> i%2==0;

        Predicate<Integer> moreThen10 = i -> i>10;

        Predicate<Integer> lessThen100 = i->i < 100 ;
        // # Predicate joi ns:

        // Predicatge to check if number is even and more then then
        // And Method
        evenNumberPredicagte.and(moreThen10).test(100);

        // Predicate to check either the number should be more then 10 or even
        // Or Methods
        evenNumberPredicagte.or(moreThen10).test(100);

        //Not Method
        // Which does not satisfy the condition
        evenNumberPredicagte.negate().test(122);

        // Miltipe conditions.
        evenNumberPredicagte.and(moreThen10).and(lessThen100).test(1000);

    }
}
