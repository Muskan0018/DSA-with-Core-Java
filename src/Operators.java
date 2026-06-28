public class Operators {

        public static void main(String[] args) {

 // Arithmetic Operators
            System.out.println("_________________________ Arithmetic Operator ____________________________");
            int solvedThisWeek = 25;
            int solvedLastWeek = 15;

            int total = solvedThisWeek + solvedLastWeek;
            int difference = solvedThisWeek - solvedLastWeek;
            int projected = solvedThisWeek * 4;
            int average = solvedThisWeek / 7;
            int remainder = solvedThisWeek % 7;

            System.out.println(total);
            System.out.println(difference);
            System.out.println(projected);
            System.out.println(average);
            System.out.println(remainder);

            System.out.println("_________________________ Assignment Operator ____________________________");

// Assignment Operator
            int ratingPoints = 100;

                    ratingPoints += 20;  // ratingPoints = ratingPoints + 20
                    System.out.println(ratingPoints);
                    ratingPoints -= 10;  // ratingPoints = ratingPoints - 10
                    System.out.println(ratingPoints);
                    ratingPoints *= 2;   // ratingPoints = ratingPoints * 2
                    System.out.println(ratingPoints);
                    ratingPoints /= 4;   // ratingPoints = ratingPoints / 4
                    System.out.println(ratingPoints);
                    ratingPoints %= 30;  // ratingPoints = ratingPoints % 30
                    System.out.println(ratingPoints);

            System.out.println("_________________________ Relational Operators ____________________________");

// Relational Operators
            int currentStreak = 45;
            int targetStreak = 50;

                    System.out.println(currentStreak == targetStreak);
                    System.out.println(currentStreak != targetStreak);
                    System.out.println(currentStreak > targetStreak);
                    System.out.println(currentStreak < targetStreak);
                    System.out.println(currentStreak >= targetStreak);
                    System.out.println(currentStreak <= targetStreak);
            System.out.println("________________________ Logical Operators _____________________________");
// Logical Operators
            boolean completedDSA = true;
                    boolean completedCore = false;

                    System.out.println(completedDSA && completedCore);
                    System.out.println(completedDSA || completedCore);
                    System.out.println(!completedCore);

            System.out.println("_______________________________ Unary Operator ______________________");

// Unary Operator
            int activeUsers = 100;

                    int prefix = ++activeUsers;
                    int postfix = activeUsers++;

                    System.out.println(prefix);
                    System.out.println(postfix);
                    System.out.println(activeUsers);

            System.out.println("___________________________ Bitwise Operator __________________________");
// Bitwise Operator
            int x = 6;  // 00000110
                    int y = 3;  // 00000011

                    System.out.println(x & y);
                    System.out.println(x | y);
                    System.out.println(x ^ y);
                    System.out.println(~x);
                    System.out.println(x << 1);
                    System.out.println(x >> 1);

            System.out.println("___________________________ instanceof Operator __________________________");
// instanceof Operator
            String track = "CodeHelp ONE";

            boolean result = track instanceof String;

            System.out.println(result);

            System.out.println("___________________________ Ternary Operator __________________________");
// Ternary Operator
            int solvedProblems = 320;

            String level = (solvedProblems >= 300) ? "Advanced" : "Intermediate";

            System.out.println(level);
        }
}
