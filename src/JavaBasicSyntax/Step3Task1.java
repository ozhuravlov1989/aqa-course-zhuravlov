package JavaBasicSyntax;

import java.util.Scanner;

public class Step3Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type any number: ");
        int a = scanner.nextInt();

        if (a > 10) {
            System.out.println("Number greater than 10");
        } else if (a < 10 && a != 0) {
            System.out.println("Number less than 10");
        } else if (a == 0) {
            System.out.println("Number is 0");
        } else {
            System.out.println("Number is 10");
        }
    }
}
