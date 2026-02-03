package Basics;
// BufferedReader - A class in Java used to read text from an input stream efficiently by buffering characters.


import java.io.IOException;
import java.io.InputStreamReader;
import java.io.BufferedReader;
import java.util.Scanner;

public class UserInput {
    public static void main(String[] args) throws IOException {
        System.out.println("Enter a number:");
        // int num = System.in.read();  // it will give ASCII value of the character. i read one character at a time.


// // BufferedReader to read input more efficiently        
//         InputStreamReader in = new InputStreamReader(System.in);
//         BufferedReader reader = new BufferedReader(in);


//         int num = Integer.parseInt(reader.readLine());        System.out.println("You entered: " + num);

//         reader.close();


// Scanner to read input more efficiently        
       Scanner sc = new Scanner(System.in);
         int num = sc.nextInt(); 
         System.out.println("You entered: " + num);
    }
}
