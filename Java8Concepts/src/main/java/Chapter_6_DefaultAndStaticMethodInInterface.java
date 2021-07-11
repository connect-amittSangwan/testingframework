public class Chapter_6_DefaultAndStaticMethodInInterface {

    // Anonymous inner class can extend a normal class.
    // Anonymous inner class can extend an abstract class.
    // Anonymous inner class can implement an interface which contains any number of abstract methods.

    // Lambda expression can implement an interface which contains a single abstract method only.

    // Anonymous inner class concepts are more powerfull then lambda expressions.

//----------------------------------------------------------------------------------------------------------------------

/*
Default Methods:
1. Interface can have default methods or static methods inside an interface after java 1.8 version came oit.
   ( Earlier all methods in a interface used to be public and abstract.)

2. After java 1.9 version, private methods are also allowed inside Interface
   ( Although, No enhancement regarding variables happen. )

3. Default method | Virtual Extension method | Defender method.

Why Default method is introduce?

- If a interface have 4 methods and n number of classes implements the interface.
Later, another method is added to the interface then all the classes which implements the interface needs to implement the newly added method.
So to overcome the problem, default methods are introduced so that new default method can be added without effecting implemented classes.

- Default methods can be override if any change needs to be done in a particular class.

- Default method method can not be declared inside a class, but only in interface. As in class default is a modifier ( Keyword ) .
to override, public method needs to be declared inside the class.

- Object class methods can not be declared as default method in interface, as all classes are child of Object class and all object class
methods are available in all the classes.

- Multple inheritance is allowed with interface, defaults method.

Syntax: default void m3(){
<-- statements-->
}
 */

}
