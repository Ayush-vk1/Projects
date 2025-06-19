import java.util.Scanner;
import java.lang.System;

class Project1 {
    public static void main(String args[]) {
        int f;
        int rd = (int) (Math.random() * 100);
        System.out.println("The random number is selected...");
        int number = -2;
        Scanner sc = new Scanner(System.in);
        int i = 10;
        do {
            i--;
            System.out.println("Enter your number:[From 0 to 99]");
            System.out.println("Enter -1 to quit...");
            number = sc.nextInt();
            if (number == -1) {
                break;
            } else if (number < rd) {
                System.out.println("Greater than: " + number);
                System.out.println("Attempts left: " + i);
            } else if (number > rd) {
                System.out.println("Smaller than: " + number);
                System.out.println("Attempts left: " + i);
            } else {
                System.out.println("You have guessed it right!!!");
                f = (int) i * 10;
                System.out.println("Marks obtained: " + f);
                break;
            }
        } while (i >= 1);
        sc.close();
    }

}
