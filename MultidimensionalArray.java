public class MultidimensionalArray {
    public static void main(String[] args) {
        int numb[][] = new int [3][4];
        int random = 0;
        
        
         for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
               numb[i][j] = (int)(Math.random() * 10);
            //    System.out.println(numb[i][j]);
            }
            // System.out.println();
        }

        for(int i = 0; i < 3; i++){
            for(int j = 0; j < 4; j++){
                // numb[i][j] = i + j;
                System.out.print(numb[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();

        for(int n[] : numb){
            for(int m : n){
                System.out.print(m + " ");
            }
            System.out.println();
        }
    }
}
