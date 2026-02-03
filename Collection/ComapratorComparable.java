package Collection;
// COMPARATOR - An interface used to define a custom sorting order for objects.
// COMPARABLE - An interface that defines the natural ordering of objects.


import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student implements Comparable<Student> {    // implementing Comparable interface
    String name;
    int age;

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Student [name=" + name + ", age=" + age + "]";
    }

    public int compareTo(Student that) {      // natural ordering by age
        return Integer.compare(this.age, that.age);
    }

}

public class ComapratorComparable {
    public static void main(String[] args) {

 // implementing Comparator interface using anonymous class       
        // Comparator<Student> comparator = new Comparator<Student>() {  // custom ordering by age
        //     @Override
        //     public int compare(Student i, Student j) {
        //         if(i.age > j.age)
        //            return 1;
        //         else
        //            return -1;
        //     }
        // };

        List<Student> stud = new ArrayList<>();
        stud.add(new Student("Alice", 20));
        stud.add(new Student("Bob", 22));
        stud.add(new Student("Charlie", 19));
        stud.add(new Student("David", 21));

    //    Collections.sort(stud, comparator);

         Collections.sort(stud);

       for (Student s : stud) {
        
           System.out.println(s);
       }
    }
}
