
// By default, String objects are immutable in Java.

class StringExample {
    public static void main(String a[]) {
        String name = new String("Muskan");  // creating object of java.lang.String class

        System.out.println("Hello " + name);
        // System.out.println(name.hashCode());
        System.out.println(name.charAt(0));
        System.out.println(name.concat(" Mishra"));
    }
}


// Mutable -> Changeable
// Immutable -> Unchangeable