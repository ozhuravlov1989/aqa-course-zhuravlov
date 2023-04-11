package JavaBasicSyntax;

import java.util.Scanner;

public class Step4Task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.print("Enter your age: ");
            int a = scanner.nextInt();
            if (a <= 0 || a > 140) {
                System.out.println("Error: Enter your real age!");
            }
            else {
                System.out.println("Ok! Your age is " + a);
                break;
            }
        }
    }
}
