import java.util.Scanner;

public class Patterns {
    static void main(String[] args) {

// PATTERN 1: Solid Square Pattern
//        int n = 4;
//        for(int row = 1; row <= n; row++) {
//            for(int col = 1; col <= n; col++) {   // for each row -> n column
//                System.out.print("* ");
//            }
//            System.out.println();  // move to next row
//        }

// PATTERN 2: Solid Rectangular Pattern
//        int n = 3;
//        for(int row = 1; row <= n; row++) {
//            for (int col = 1; col <= 5; col++){   //for each row -> 5 column
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 3: Solid Right-Angle Triangle Pattern
//        int n = 5;
//        for(int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 4: Solid Rhombus Pattern
//         int n = 5;
//         for (int row = 1; row <= n; row++){
//             // for each row -> spaces, stars
//
//             //spaces
//             for (int col = 1; col <= n - row; col++){
//                 System.out.print(" ");
//             }
//             //columns
//            for (int col = 1; col <= n; col++){
//                System.out.print("* ");
//            }
//             System.out.println();
//         }

// PATTERN 5: Inverted Right-Angle Triangle Pattern
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//
//            for (int col = 1; col <= 1+(n - row); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 6: Solid Pyramid Pattern
//        int n = 5;
//        for (int row = 1; row <= n; row++) {
//            //space
//            for (int col = 1; col <= n - row; col++){
//                System.out.print(" ");
//            }
//            // stars
//            for (int col = 1; col <= (2 * row - 1); col++){
//                System.out.print("*");
//            }
//            System.out.println();
//        }

 // PATTERN 7: Solid Inverted Pyramid Pattern
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//
//            //spaces
//            int space = row - 1;
//            for (int col = 1; col <= space; col++){
//                System.out.print(" ");
//            }
//            //stars (2n - 2row + 1)
//            for (int col = 1; col <= 2*n-row-space; col++) {
//                System.out.print("*");
//            }
//            System.out.println();
//        }

 // PATTERN 8: Hollow Pattern
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//
//            //for each row -> 6 column
//            for (int col = 1; col <= 6; col++){
//                if (row == 1 || row == n){
//                    System.out.print("* ");
//                }
//                //middle rows
//                else{
//                    if(col == 1 || col == 6){
//                        System.out.print("* ");
//                    }
////                    else if (col == 6) {
////                        System.out.print("* ");
////                    }
//                    else {
//                        //middle columns
//                        System.out.print("  ");
//                    }
//                }
//            }
//            // next row
//            System.out.println();
//        }

// PATTERN 9: Hollow Right-Angle Triangle
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//                if (row == 1 || row == 2 || row == n){
//                    for (int col = 1; col <= row; col++) {
//                        System.out.print("* ");
//                    }
//                }else{
//                    // middle row
//                    System.out.print("* ");  // 1*
//                    // (row - 2) spaces
//                    for (int col = 1; col <= row - 2; col++){
//                        System.out.print("  ");
//                    }
//                    //1*
//                    System.out.print("* ");
//            }
//            System.out.println();
//        }

//  PATTERN 10: Hollow Pyramid Pattern
//        int n = 5;
//        for (int row = 1; row <= 5; row++) {
//            for(int col = 1; col <= n - row; col++){  // spaces
//                System.out.print("  ");
//            }if(row == 1 || row == n){    // stars (for 1st & last line)
//                for (int col = 1; col <= 2 * row - 1; col++) {
//                    System.out.print("* ");
//                }
//            }else {
//                System.out.print("* ");  // 1 star
//                for (int col = 1; col <= 2 * row - 3; col++){      // spaces
//                    System.out.print("  ");
//                }
//                System.out.print("* ");   // 1 start
//            }
//            System.out.println();
//        }

// PATTERN 11: Solid Diamond Pattern
//        int n = 4;
//          // for upper half
//        for (int row = 1; row <= n; row++) {
//            //spaces
//            for (int col = 1; col <= n - row; col++) {
//                System.out.print("  ");
//            }
//            //stars
//            for (int col = 1; col <= 2 * row - 1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // for Lower half
//           for (int row = 1; row <= n; row++){
//               // for skipping row 1
//               if (row == 1){
//                   continue;
//               }
//            //spaces
//            int space = row - 1;
//            for (int col = 1; col <= space; col++){
//                System.out.print("  ");
//            }
//            //stars (2n - 2row + 1)
//            for (int col = 1; col <= 2*n-row-space; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

//PATTERN 12: Hollow Diamond
//        int n = 4;
//     // part 1
//        for (int row = 1; row <= n; row++) {
//            for(int col = 1; col <= n - row; col++){  // spaces
//                System.out.print("  ");
//            }if(row == 1 ){    // stars (for 1st )
//                for (int col = 1; col <= 2 * row - 1; col++) {
//                    System.out.print("* ");
//                }
//            }else {
//                System.out.print("* ");  // 1 star
//                for (int col = 1; col <= 2 * row - 3; col++){      // spaces
//                    System.out.print("  ");
//                }
//                System.out.print("* ");   // 1 start
//            }
//            System.out.println();
//        }
//        // part 2
//        for (int row = 1; row <= n-1; row++) {
//
//            // spaces
//            for (int col = 1; col <= row; col++) {
//                System.out.print("  ");
//            }
//            //stars (Last row)
//            if (row == n - 1) {
//                System.out.print("* ");
//            }
//            // remaining rows
//            else {
//                // 1*
//                System.out.print("* ");
//                // { 2(n-r) - 3 } spaces
//                for (int col = 1; col <= 2 * (n - row) - 3; col++) {
//                    System.out.print("  ");
//                }
//                //1*
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 13: Symmetric Butterfly Pattern
//        int n = 4;
//
//        for (int row = 1; row <= n; row++){
//            // Upper Half
//            //part 1
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            //part 2 (spaces)
//            for (int col = 1; col <= 2 * (n - row); col++ ){
//                System.out.print("  ");
//            }
//            //part 3
//            for (int col = 1; col <= row; col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // Lower Half
//        //part 4
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= 1 + (n - row); col++){
//                System.out.print("* ");
//            }
//            //part 5 (spaces)
//            for (int col = 1; col <= 2 * row - 2; col++){
//                System.out.print("  ");
//            }
//            // part 6
//            for (int col = 1; col <= 1 + (n - row); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 14: Right-Angle Triangle with numeric values
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                System.out.print(col + " ");
//            }
//            System.out.println();
//        }

// PATTERN 15:
//         int n = 5;
//         int count = 1;
//         for (int row = 1; row <= n; row++){
//             for (int col = 1; col <= row; col++){
//                 System.out.print(count + " ");
//                 count++;
//             }
//             System.out.println();
//         }

// PATTERN 16:
//        int n = 5;

        // METHOD 1
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a + b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            System.out.println();
//        }
        // METHOD 2
//        for (int row = 0; row < n; row++){
//            for (char ch = 'A'; ch <= 'A' + row; ch++){
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

// PATTERN 17:
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//            for (int col = 1; col <= row; col++){
//                char ch = (char)((n - col) + 'A');
//                System.out.print(ch + " ");
//            }
//            System.out.println();
//        }

// PATTERN 18: Numeric Solid Pyramid
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            // spaces (part 1)
//            for (int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            // part 2
//            for (int col = 1; col <= row; col++){
//                System.out.print(col + " ");
//            }
//            // part 3
//            int rowValue = row;
//            int decRowValue = row - 1;
//            for (int col = 1; col <= row - 1; col++){
//                System.out.print(decRowValue + " ");
//                decRowValue--;
//            }
//            System.out.println();
//        }

// PATTERN 19: Symmetrical Pyramid Pattern
        // Upper Half
//        int n = 5;
//        for (int row = 1; row <= n; row++){
//
//            //spaces
//            int space = row - 1;
//            for (int col = 1; col <= space; col++){
//                System.out.print("  ");
//            }
//            //stars (2n - 2row + 1)
//            for (int col = 1; col <= 2*n-2*row+1; col++) {
//                System.out.print("* ");
//            }
//            System.out.println();
//        }
//        // Lower Half
//        for (int row = 2; row <= n; row++) {
//            //space
//            for (int col = 1; col <= n - row; col++){
//                System.out.print("  ");
//            }
//            // stars
//            for (int col = 1; col <= (2 * row - 1); col++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

// PATTERN 20: Numeric Pyramid
//         int n = 4;
//         for (int row = 1; row <= n; row++){
//             // spaces (n-row)
//             for (int col = 1; col <= n - row; col++){
//                 System.out.print("  ");
//             }
//             for (int col = 1; col <= 2*row-1; col++){
//                 System.out.print(row + " ");
//             }
//
//             System.out.println();
//         }

// PATTERN 21: Alphabetical Pyramid
//        int n = 4;
//        for (int row = 1; row <= n; row++){
//            // part 1
//            // spaces (n-row)
//             for (int col = 1; col <= n - row; col++){
//                 System.out.print("  ");
//             }
//             // part 2
//            for (int col = 1; col <= row; col++){
//                int a = col;
//                int b = ('A' - 1);
//                int ans = a + b;
//                char finalAns = (char)ans;
//                System.out.print(finalAns + " ");
//            }
//            // part 3
//            for (int col = 1; col <= row - 1; col++){
//                char toPrint = (char) (row + 'A' - 2);
//                System.out.print(toPrint + " ");
//                toPrint--;
//            }
//            System.out.println();
//        }
    }
}
