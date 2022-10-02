package at.ac.fhcampuswien;

import java.util.Scanner;

public class App {

    //todo Task 1
    public void sayHelloWorld(){
        // input your solution here
        System.out.println("Hello World!");
    }
    // Console Output "Hello World!"

    //todo Task 2
    public void helloRobot(){
        // input your solution here
        System.out.println("0123456789012345678901");
        System.out.println("         __");
        System.out.println(" _(\\    |@@|");
        System.out.println("(__/\\__ \\--/ __");
        System.out.println("   \\___|----|  |   __");
        System.out.println("       \\ }{ /\\ )_ / _\\");
        System.out.println("       /\\__/\\ \\__O (__");
        System.out.println("      (--/\\--)    \\__/");
        System.out.println("      _)(  )(_");
        System.out.println("     `---''---`");

    }
    // Several Console Outputs, which contain the image of a roboter;
    // Backslashes need to be written twice, so it comes out as one Backslash


    //todo Task 3
    public void sumOfLiterals(){
        // input your solution here
        char n1 = 'Z';
        int n2 = 0xface;
        int n3 = 012;
        long n4 = 80L;
        float n5 = 44e-1f;
        float n6 = 5.5f;
        double n7 = 8.88e1;
        double n8 = 99.9;
        // the different Literals as char, int, long, float and double

        int sum = n2 + n3 + (int) n1 + (int) n4 + (int) n5 + (int) n6 + (int) n7 + (int) n8;
        // the sum (as int) created by adding the int values of each literal

        System.out.println(sum);
        // Console output of the sum
    }

    //todo Task 4
    public void addTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);
        int a = scan.nextInt();
        int b = scan.nextInt();
        // Console Input for two numbers (a & b)

        int sum = a + b;
        // sum of the two Console input numbers (a & b)

        System.out.println(sum);
        // Console output of the sum
    }

    //todo Task 5
    public void swapTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.println("Before Swap:");
        System.out.print("x: ");
        int x = scan.nextInt();
        System.lineSeparator();

        System.out.print("y: ");
        int y = scan.nextInt();
        System.lineSeparator();

        // Console Output "Before Swap:", "x:", and the console input value for x
        // "y:" and the console input for y

        x = x * y; // multiplying x and y to generate the new x value
        y = x / y; // dividing the y value from the new x value, so y is now the old x value
        x = x / y; // dividing the new y value (old x value) from the product of x * y, so x has the old y value

        System.out.println("After Swap:");
        System.out.println("x: " + x);
        System.out.println("y: " + y);
        // Console output for the x & y value after the swap
    }

    //todo Task 6
    public void compareTwoNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("n1: ");
        int n1 = scan.nextInt();
        System.lineSeparator();

        System.out.print("n2: ");
        int n2 = scan.nextInt();
        System.lineSeparator();

        if (n1 > n2) {
           System.out.println("n1 > n2");
        }

        if (n2 > n1) {
            System.out.println("n2 > n1");
        }
        if (n1 == n2) {
            System.out.println("n1 == n2");
        }

    }

    //todo Task 7
    public void ratingSalesPerson(){
        // input your solution here


        Scanner scan = new Scanner(System.in);

        System.out.print("Enter annual Revenue: ");
        int a = scan.nextInt();
        System.lineSeparator();
        // input for annual revenue

        if (a < 0 || a >= 100000) {
            System.out.println("Invalid Revenue");
        }

        if (0 <= a && a < 20000) {
            System.out.println("Poor Sales Revenue");
        }

        if (20000 <= a && a < 50000) {
            System.out.println("Average Sales Revenue");
        }

        if (50000 <= a && a < 80000) {
            System.out.println("Good Sales Revenue");
        }

        if (80000 <= a && a < 100000) {
            System.out.println("Excellent Sales Revenue");
        }
        // different requirements (as 'if'-loops) for the different sales revenue classes

    }

    //todo Task 8
    public void getCommissionRate(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        double provision;

        System.out.print("Enter CommissionClass: ");
        int comclass = scan.nextInt();

        String comclassString;
        switch (comclass) {
            case 1: provision = 0.01;
            break;
            case 2: provision = 0.02;
            break;
            case 3: provision = 0.03;
            break;
            case 4: provision = 0.04;
            break;
            default: provision = 0.00;
        }

        System.out.println("Your Commission Rate was set to " + provision);
        // System.lineSeparator();

    }

    //todo Task 9
    public void leapyear(){
        // input your solution here

        Scanner scan = new Scanner(System.in);
        System.out.print("Year: ");
        int year = scan.nextInt();
        System.lineSeparator();

        if (year % 4 != 0 || year % 100 == 0 && year % 400 != 0) {
            System.out.println("Not a Leapyear");
        } else {
            System.out.println("Leapyear");
        }

    }

    //todo Task 10
    public void transposedNumbers(){
        // input your solution here
        Scanner scan = new Scanner(System.in);

        System.out.print("Number: ");
        int number = scan.nextInt();
        System.lineSeparator();

        int a = number / 100;
        int b = number / 10 % 10;
        int c = number % 10;

        number = a + 10 * b + 100 * c;

        System.out.println("Number: " + number);

    }


    public static void main(String[] args){
        App exercise1 = new App();

        System.out.println("Task 1: Say Hello World");
        exercise1.sayHelloWorld();

        System.out.println("\nTask 2: Hello Robot");
        exercise1.helloRobot();

        System.out.println("\nTask 3: Literals");
        exercise1.sumOfLiterals();

        System.out.println("\nTask 4: Add two Numbers");
        exercise1.addTwoNumbers();

        System.out.println("\nTask 5: Swap two Numbers without using a helper variable");
        exercise1.swapTwoNumbers();

        System.out.println("\nTask 6: Compare two Numbers");
        exercise1.compareTwoNumbers();

        System.out.println("\nTask 7: Rating Sales Person");
        exercise1.ratingSalesPerson();

        System.out.println("\nTask 8: Commission Rate");
        exercise1.getCommissionRate();

        System.out.println("\nTask 9: Leapyear");
        exercise1.leapyear();

        System.out.println("\nTask 10: Transposed Numbers");
        exercise1.transposedNumbers();
    }
}