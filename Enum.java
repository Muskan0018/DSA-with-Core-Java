// Enum is a special data type that enables for a variable to be a set of predefined constants.
// The variable must be equal to one of the values that have been predefined for it.

enum Status{  
    Running, Pending, Completed, Failed;
}

public class Enum {
    public static void main(String[] args) {
        int i = 5;
        // Status s = Status.Running;
        Status[] s = Status.values(); // Accessing enum constant by index
        // System.out.println(s.ordinal()); // prints the index of the enum constant
        // System.out.println(s[2]);
        for( Status s1 : s){
            System.out.println(s1);
        }

    }
}
