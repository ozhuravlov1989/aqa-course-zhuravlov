package JavaBasicSyntax;

import java.util.Scanner;

public class Step3Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type any number: ");
        double a = scanner.nextDouble();

        if (a % 2 == 0) {
            System.out.println("Number is even");
        } else {
            System.out.println("Number is odd");
        }
    }
}
