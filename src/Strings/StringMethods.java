package Strings;

public class StringMethods {
    static void main() {

        String str = "Pratiksha";
        String name = "PRATIKSHA";

// length()
        System.out.println("Length: " + str.length());

// charAt()
        System.out.println("CharAt: " + str.charAt(5));

// equals()
        System.out.println("Equals: " + str.equals(name));

// equalsIgnoreCase()
        System.out.println("Equals Ignore Case: " + str.equalsIgnoreCase(name));

 // isEmpty() -> length = 0
        String st1 = "";
        System.out.println("IS EMPTY: " + st1.isEmpty());

 // isBlank() -> empty or contain only whitespaces
        String st2 = "   ";
        System.out.println("Is Blank: " + st2.isBlank());

// trim() -> Removes leading and trailing spaces
        String st3 = "   Java   ";
        System.out.println(st3.length());
        st3 = st3.trim();
        System.out.println("Trim: " + st3.length());

        String player = "ViraT KoHli";
 // toUpperCase()
        System.out.println("Upper case: " + player.toUpperCase());

// toLowerCase()
        System.out.println("Lower case: " + player.toLowerCase());

// substring() -> Extracts part of a string
        String s1 = "My name is Muskan Mishra";
        System.out.println("Substring is: " + s1.substring(11,17));

// contains() -> Returns true if and only if this string contains the specified sequence of char values.
        System.out.println("Contains: " + s1.contains("Mishra"));

// valueOf(any type) -> Converts other data types into a string
        int num = 5123;
        String s2 = String.valueOf(num);
         System.out.println(num + 1);  // 5124
        System.out.println(s2 + 1);  // 51231

// startsWith() -> Checks whether a string starts with a given prefix.
        String s3 = "Programming";
        System.out.println("Starts with: " + s3.startsWith("Pro"));

// endsWith() -> Checks whether a string ends with a given suffix.
        String s4 = "Programming";
        System.out.println("Ends with: " + s4.endsWith("ing"));

// toCharArray() -> Converts a string into a character array.
        String s5 = "Java";
        char[] crr = s5.toCharArray();
        System.out.print("toCharArray: ");
        for (char ch : crr) {
            System.out.print( ch + " ");
        }
        System.out.println();

// replace() -> Replaces characters or substrings.
        String st = "Java";
        System.out.println("Replace a with o: " + st.replace('a', 'o'));

// split() -> Splits a string into an array.
        String s6 = "Java Python C++";
        String[] languages = s6.split(" ");
        System.out.print("Split: ");
        for (String lang : languages) {
            System.out.println(lang);
        }

// concat() -> Joins two strings.
        String s7 = "Java";
        System.out.println("Concat: " + s7.concat(" Programming"));

// indexOf() -> Returns the index of the first occurrence of a character or substring.
        String s8 = "Programming";
        System.out.println("indexOf: " + s8.indexOf('g'));

// lastIndexOf() -> Returns the last occurrence of a character.
        String s9 = "Programming";
        System.out.println("last Index of: " + s9.lastIndexOf('g'));

// repeat() (Java 11+) -> Repeats the string a specified number of times.
        String s = "Hi ";
        System.out.println("Repeats: " + s.repeat(3));

    }
}
