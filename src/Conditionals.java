public class Conditionals {
        public static void main(String[] args) {

            System.out.println("___________ if Statement ______________");
            int dailyPractice = 12;

            if (dailyPractice >= 10) {
                System.out.println("Good consistency!");
            }

            System.out.println("____________ if-else Statement ______________");
                    int score = 42;

                    if (score >= 50) {
                        System.out.println("Pass");
                    } else {
                        System.out.println("Fail");
                    }
            System.out.println("___________ if-else-if Ladder ______________");
                    int accuracy = 78;

                    if (accuracy >= 90) {
                        System.out.println("Excellent");
                    }
                    else if (accuracy >= 75) {
                        System.out.println("Good");
                    }
                    else if (accuracy >= 60) {
                        System.out.println("Average");
                    }
                    else {
                        System.out.println("Needs Improvement");
                    }

            System.out.println("________________ Nested if-else __________________");
                    boolean hasSubscription = true;
                    int solvedProblems = 220;

                    if (hasSubscription) {

                        if (solvedProblems >= 200) {
                            System.out.println("Unlock Advanced Sheet");
                        } else {
                            System.out.println("Practice More Problems");
                        }

                    } else {
                        System.out.println("Upgrade to Premium");
                    }
            System.out.println("_______________ Ternary Operator __________________");
                    int streakDays = 35;

                    String status = (streakDays >= 30) ? "Consistent" : "Irregular";

                    System.out.println(status);
            System.out.println("_________________ Switch Statement ________________");
                    int dayNumber = 3;

                    switch (dayNumber) {
                        case 1:
                            System.out.println("Monday");
                            break;

                        case 2:
                            System.out.println("Tuesday");
                            break;

                        case 3:
                            System.out.println("Wednesday");
                            break;

                        default:
                            System.out.println("Invalid day");
                    }

            System.out.println("----------------- END OF CONDITIONALS -------------");
        }
}
