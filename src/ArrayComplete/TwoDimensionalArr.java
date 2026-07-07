package ArrayComplete;

public class TwoDimensionalArr {
    static void main() {

        // Declaration
        int [][] arr;
        // Allocation
        arr = new int[3][3];
        // Initialization
        int [][] brr = {
                          {10, 20},
                          {40, 50, 60},
                          {70, 80, 90, 100}
                       };
//        System.out.println(brr[0][2]);

        int rowlen = brr.length;
//        int colLength = brr[0].length;   // for square matrix
//        System.out.println(colLength);

        // For printing Whole matrix
//        System.out.println("Matrix is: ");
//        for (int row = 0; row <= rowlen - 1; row++) {
            // for Jagged Array
            // Jaise hi main kisi new row me aaya
            // Same point par maine uss row ka colLength find out krliya
            // Current row -> brr[row]
            // isme kitne columns -> brr[row].length
//            int colLength = brr[row].length;
//            for (int col = 0; col <= colLength - 1; col++){
//                System.out.print(brr[row][col] + " ");
//            }
//            System.out.println();
//        }

// Traversal 2D Array
        System.out.println("Matrix is: ");
         for (int rowIndex = 0; rowIndex < brr.length; rowIndex++) {
             for (int colIndex = 0; colIndex < brr[rowIndex].length; colIndex++) {
                 System.out.print(brr[rowIndex][colIndex] + " ");
             }
             System.out.println();
         }

    }
}
