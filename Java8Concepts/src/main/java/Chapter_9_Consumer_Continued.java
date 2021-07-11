import java.sql.Time;
import java.util.Date;
import java.util.Locale;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Chapter_9_Consumer_Continued {
    /*
        Consumer never returns anything, it only takes the argument and the argument type needs to be defined.

        Consumer interface contains accept() method.
     */

    public static void main(String[] args) {

        Consumer<String> consumer = str -> {
            System.out.println(str.toUpperCase(Locale.ROOT));
        };

        consumer.accept("my name is amit");

/*
Supplier:

It does not take any input only return type needs to be specified.

interface Supplier<R>
{
    public R get();
        // R represents return type
}

 */
        Supplier<Date> getDate = () -> new Date();
        System.out.println(getDate.get());

    }

}
