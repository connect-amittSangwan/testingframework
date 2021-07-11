import java.util.ArrayList;
import java.util.Collections;

class SetData {
    String name;
    int id;

    SetData(int id, String name) {
        this.name = name;
        this.id = id;
    }

    public String toString() {       // Overriding toString() method of Object class
        return id + " : " + name;
    }
}

public class Chapter_5_AnonymousInnerClassVsLambdaExpressions {

    static Runnable r1 = new Runnable() {
        // Anonymous class can extend a class or can implement an interface.
        // Example of an anonymous inner class
        public void run() {
            System.out.println("Runnable Running from Thread T1");
        }
    };

    static Thread t1 = new Thread(r1);

      /*
      Anonymous Inner Class: The class that does not have a name
       */
    static Thread t2 = new Thread() {
        // Writing a class that extends the Thread class
        // This is the child class of the Thread class but it does not have any name, is called anonymous inner class.
        // It extends Thread class.

    };

    public static void main(String[] args) {

        t1.start();

        ArrayList<SetData> dataSet = new ArrayList<>();
        dataSet.add(new SetData(3, "a"));
        dataSet.add(new SetData(5, "b"));
        dataSet.add(new SetData(32, "as"));
        dataSet.add(new SetData(1, "fss"));
        dataSet.add(new SetData(90, "s"));

        System.out.println(dataSet);// Internally calling toString() method

        // Sorting based on numberic order
        Collections.sort(dataSet, (obj1, obj2) -> (obj1.id > obj2.id) ? 1 : (obj1.id < obj2.id) ? -1 : 0);
        System.out.println(dataSet);

        // Sorting bassed on alphabetical order
        // Comparable Interface : CompareTo() method
        // Comparator Interface: Compare() method  // Functional Interface

        Collections.sort(dataSet, (obj1, obj2) -> obj1.name.compareTo(obj2.name));
        System.out.println(dataSet);
    }
}
