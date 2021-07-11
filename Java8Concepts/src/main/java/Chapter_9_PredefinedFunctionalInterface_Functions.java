import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Function;

class Student {
    int marks;
    String name;

    Student(String name, int marks) {
        this.name = name;
        this.marks = marks;
    }
}

public class Chapter_9_PredefinedFunctionalInterface_Functions {
/*
Functions

import java.util.function.*;

Return type and parameter type needs to be declared while making an object of Function interface

function<String, String> makeUpper = i -> i.toUpperCase();
 */

    public static void main(String[] args) {


        // Function to make string upper case
        Function<String, String> makeUpperFun = i -> i.toUpperCase();

        // Function interface have apply() abstract method.
        System.out.println(makeUpperFun.apply("amit sangwan"));


        // Input Data
        Student s1 = new Student("amit", 12);
        Student s2 = new Student("ram", 92);
        Student s3 = new Student("sam", 42);
        ArrayList<Student> studentList = new ArrayList<>();
        studentList.add(s1);
        studentList.add(s2);
        studentList.add(s3);


        // Function to find Grade
        Function<Student, String> getGrade = i -> {
            String grade = (i.marks > 80) ? "First Class "
                    : (i.marks > 60) ? "Second Class"
                    : (i.marks < 40) ? "Fail"
                    : "not found";
            return grade;
        };

        for(Student student : studentList ){
            System.out.println("Student Name: " + student.name + " Result: " + getGrade.apply(student));
        }

    }

    /*
    Function Chaining:
    Syntax:
    f1.andThen(f2).apply(i)
    // f1 followed by f2 function

    f1.compose(f2).apply(i)
    // first f2 and then f1

     */
}



