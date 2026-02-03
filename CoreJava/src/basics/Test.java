package basics;

class Test{
    public static void main(String args[]){
        System.out.print("Hello World!!");
        System.out.println("Hello World!");

        int x = 18;
        int y = 45;
        int result = x + y;
        String s = "Jonny";
        System.out.println("result of " + s +" is: "+ result);
//    Type Casting
        int a = 50;
        double d = a;  // implicit typecasting
        System.out.println(d);

        double myval = 34.25;
        int myint = (int)myval;  // Explicit typecasting
        System.out.println(myval);
        System.out.println(myint);
// Conditional statements
        int n = 81;
    // if-else Ladder
        if(n > 90){
            System.out.println(n + " Grade A");
        }
        else if(n > 80 && n <= 90){
            System.out.println(n + " Grade B");
        }
        else{
            System.out.println(n + " Grade C");
        }
    // Nested if
        int num = 142;
        if (num > 0){
            if (num%2 ==0){
                System.out.println(" No. is even or greater than 0");
            }
        }
// Switch Statement
       String day = "MON";
        switch(day){
            case "MON":
                System.out.println("Monday");
                break;
            case "TUES":
                System.out.println("Tuesday");
                break;
            case "WED":
                System.out.println("Wednesday");
                break;
            default:
                System.out.println("Invalid");
        }
// Loops
    // for loop
        int m = 10;
        for (int i=1; i<=m; i++){
            System.out.print(m*i + " ");
        }
        System.out.println();
    // while loop
        int p = 100;
        while(p <= 108){
            System.out.print(p + " ");
            p++;
        }
    // do while loop
//        do{
//            // statements
//        }
//        while();
        System.out.println();
    // for each loop (enhanced for loop)
        int nums[] = {18, 45, 17, 1};
        int add = 0;
        for (int j : nums){
            add = add + j;
        }
        System.out.print("Sum is: " + add);

// Break & Continue Statement
        // Break - loops terminate on specified condition
        // Continue - continue loop with next iteration

        for (int i = 1; i <= 100; i++){
            System.out.println(i);
            if(i==50){
                continue;
            }
            if(i == 50){
                break;
            }
            System.out.println("end");
        }

    }
}