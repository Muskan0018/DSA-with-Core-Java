public class PatternThree {

   static void pattern11(int n) {
    int start = 1;
      for(int i = 0; i < n; ++i) {
         if (i % 2 == 0) {
            start = 1;
         } else {
            start = 0;
         }

         for(int j = 0; j <= i; ++j) {
            System.out.print(start + " ");
            start = 1 - start;
         }

         System.out.println();
      }

   }

   static void pattern12(int n) {
     // Initial number of spaces in the first row
        int spaces = 2 * (n - 1);

        // Outer loop for the number of rows
        for (int i = 1; i <= n; i++) {
            
            // Inner loop to print numbers in increasing order
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            
            // Inner loop to print spaces in the middle
            for (int j = 1; j <= spaces; j++) {
                System.out.print(" ");
            }
            
            // Inner loop to print numbers in decreasing order
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            
            // Move to the next line after printing the row
            System.out.println();
            
            // Decrease spaces by 2 after each row
            spaces -= 2;
        }

   }

   static void pattern13(int n) {
      int num = 1;

      for(int i = 1; i <= n; i++) {
         for(int j = 1; j <= i; j++) {
            System.out.print(num + " ");
            num++;
         }

         System.out.println();
      }

   }

   static void pattern14(int n) {
      for(int i = 0; i < n; ++i) {
         for(char ch = 'A'; ch <= 'A' + i; ++ch) {
            System.out.print(ch + " ");
         }

         System.out.println();
      }

   }

   static void pattern15(int n) {
      for(int i = 0; i < n; i++) {
         for(char ch = 'A'; ch <= 'A' + (n - i - 1); ++ch) {
            System.out.print(ch + " ");
         }

         System.out.println();
      }

   }

   public static void main(String[] var0) {
      int n = 5;
      System.out.println("--------------------------------------------------------");
      pattern11(n);
      System.out.println("--------------------------------------------------------");
      pattern12(n);
      System.out.println("--------------------------------------------------------");
      pattern13(n);
      System.out.println("--------------------------------------------------------");
      pattern14(n);
      System.out.println("--------------------------------------------------------");
      pattern15(n);
      System.out.println("--------------------------------------------------------");
   }
} 

