public interface Chapter_6_Cont {
/*
Interface static methods are not avaialble by default in the implementation class.
Interface static methods can be called with interface name only. ( does not matter if the class implements the interface or not)

If we don't need to create an object and are using all static method then why to use class, can use instead interface
which is lightweight as compared to class. ( Todo: need to dig deep )

Why Required?
General Utility methods like add, multiple etc static methods used to defined inside class where we don't need to create object.
All methods are static,
We can do it now in interface.


 */

    // It is possible after 1.8 version: main method inside interface
    public static void main(String args[]){
        System.out.println("method running from interface.");
    }
}

class test{
    public static void main(String[] args) {
        Chapter_6_Cont.main(null);
    }
}
