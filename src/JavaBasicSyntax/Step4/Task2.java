package JavaBasicSyntax.Step4;

import java.util.Scanner;

public class Task2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any number: ");
        int a = scanner.nextInt();
        int factorial = 1;

        for (int i=1; i<=a; i++){
            factorial *= i;
        }

        System.out.println("Factorial of " + a + " = " + factorial);
    }
}