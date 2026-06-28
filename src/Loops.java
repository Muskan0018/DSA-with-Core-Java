public class Loops {
    static void main() {

        System.out.println("----------- For Loop --------");
    // for Loop
        for (int value = 2; value <= 10; value += 2) {
            System.out.println(value);
        }

//        for(int i = 1; i <= 3; i++){
//            for(int j = 1; j <= 3; j++){
//                System.out.print("* ");
//            }
//            System.out.println();
//        }

        System.out.println("----------- For loop with break --------");
        for(int i = 1; i<= 10; i++){
            if(i == 5){
                break;
            }
            System.out.println(i);
        }

        System.out.println("------------- For loop with continue ------");
        for (int n = 1; n <= 10; n++){
            if (n == 2){
                continue;
            }
            System.out.println(n);
        }

   // While Loop
        System.out.println("------------- While Loop ----------");

                int count = 1;       //initialization

                while (count <= 5) {     //condition
                    System.out.println(count);
                    count++;     //updation
                }
        System.out.println("----------- Nested While loop ------------");

                int num = 1;

                while (num <= 2){
                    int j = 1;       // important: reset for each row

                    while (j <= 3){
                        System.out.println("num = " + num + ", j = " + j);
                        j++;
                    }
                    num++;
                }

        System.out.println("----------------- do-while loop ----------");
                int revisionRound = 1;

                do {
                    System.out.println("Revision Round: " + revisionRound);
                    revisionRound++;
                } while (revisionRound <= 3);
    }
}
