package Strings;

public class StringPractice {

//Problem 1: Print each character of the String
    static void printString(String str) {
        int n = str.length();
        for (int i = 0; i < n; i++){
            char ch = str.charAt(i);
            System.out.println(ch);
        }
    }

// Problem 2: Count length of String without length()
    static int getLength(String str){
        char [] arr = str.toCharArray();
        int len = arr.length;
        return len;
    }

// Problem 3: Count Vowels in a String
    static  int vowelsCount(String str) {
        int count = 0;
        for (int i = 0; i < str.length(); i++){
            char ch = str.charAt(i);

            if (ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ||
                ch == 'A' || ch == 'E' || ch == 'I' || ch == 'O' || ch == 'U') {
                count++;
            }
        }
        return count;
    }

// Problem 4: Reverse a String
    static String reverseString(String str) {
        String reverse = " ";
        int n = str.length();
        for (int i = n - 1; i >= 0; i--){
            char ch = str.charAt(i);
            reverse = reverse + ch;
        }
        return reverse;
    }

// Problem 5: Check String is a Palindrome or not
    static boolean checkPalindrome(String str1){
        String reverse = "";
        // compare
        for (int i = str1.length() - 1; i >= 0; i--){
            reverse += str1.charAt(i);
        }
        if (str1.equals(reverse)) {
            return true;
        }else{
            return false;
        }
    }


    static void main(String[] args) {
        String str = "Muskan";
        String str1 = "RACECAR";
//        printString(str);
//        System.out.println("Length: " + getLength(str));
//        System.out.println("Vowels Count: " + vowelsCount(str));
//        System.out.println("Reverse String: " + reverseString(str));
        System.out.println("Palindrome: " + checkPalindrome(str1));
    }
}
