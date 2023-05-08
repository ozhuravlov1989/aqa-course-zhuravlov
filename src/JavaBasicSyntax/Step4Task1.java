package JavaBasicSyntax;

import java.util.Scanner;

public class Step4Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any number: ");
        int a = scanner.nextInt();

        if (a <= 0) {
            System.out.println("Error: Number must be greater than 0");
        } else {
            for (int i = 1; i <= a; i++) {
                if (i % 2 == 0 && i % 3 != 0) {
                    System.out.println("Value " + i + "\nThe value is even. " + "Value " + i);
                } else if (i % 3 == 0) {
                    System.out.println("The value is multiple to 3. " + "Value " + i);
                } else {
                    System.out.println("Value " + i);
                }
            }
        }
    }
}
