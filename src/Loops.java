public class Loops {
    static void main() {

    // for Loop
        for (int value = 2; value <= 10; value += 2) {
            System.out.println(value);
        }

        for(int i = 1; i <= 3; i++){
            for(int j = 1; j <= 3; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
    }
}
