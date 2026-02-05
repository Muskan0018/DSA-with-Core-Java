public class PatternThree {
    static void pattern11(int n){
        int start = 1;
        for(int i = 0; i < n; i++){
            if(i % 2 == 0){
                start = 1;
            }else{
                start = 0;
            }
            for(int j = 0; j <= i; j++){
                System.out.print(start + " ");
            // if start = 1 then make it 0 and if start = 0 then make it 1
                start = 1 - start;   
            }
            System.out.println();
        }
    }
    public static void main(String[] args) {
        int n = 5;

        System.out.println("--------------------------------------------------------");
        pattern11(n);
        System.out.println("--------------------------------------------------------");

    }
}

