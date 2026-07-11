package Strings;

import java.util.Scanner;

public class StringBasics {
    static void main() {

// Taking String Input
        Scanner sc = new Scanner(System.in);
        System.out.println("What is your name: ");
        String name = sc.nextLine();
        System.out.println("Ans: " + name);

        System.out.println("What is your name: ");
        String name1 = sc.next();
        System.out.println("Ans2: " + name1);

        // Compare two String
        String str1 = "Love";
        String str2 = "LOVE";

// Using equals()
        if (str1.equals(str2)) {
//            System.out.println("Both strings are equal");
        }else {
//            System.out.println("Both strings are not equal");
        }

// Using equalsIgnoreCase()
        if (str1.equalsIgnoreCase(str2)) {
//            System.out.println("Both strings are equal");
        }else {
//            System.out.println("Both strings are not equal");
        }

        String s1 = new String("Java");
        String s2 = new String("Java");

// Using ==
//        System.out.println(("Using == : " + s1 == s2));           // They are different objects, so == returns false

// Using compareTo()
//        System.out.println("Using compareTo(): " + (s1.compareTo(s2)));   // if it returns 0 then, Strings are equal, Negative number → First string comes before the second,Positive number → First string comes after the second (alphabetically)

        String firstName = "Virat";
        String lastName = "Kohli";
//        System.out.println("Name: " + firstName + " " + lastName);

// Accessing the Element inside the String
//        System.out.println(firstName.length());      // for accessing the length
//        System.out.println(firstName.charAt(1));    // Know the Character at particular index
    }
}
