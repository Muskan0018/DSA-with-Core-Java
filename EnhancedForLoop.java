public class EnhancedForLoop {
    public static void main(String[] args) {
        int digit[] = new int[6];
        digit[0] = 10;
        digit[1] = 20;
        digit[2] = 30;
        digit[3] = 40;
        // digit[4] = 50;
        // digit[5] = 60;

        // for (int i = 0; i < digit.length; i++) {
        //     System.out.println(digit[i]);
        // }

        for(int n : digit){
            System.out.println(n);
        }
    }


}
