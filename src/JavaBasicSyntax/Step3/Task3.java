package JavaBasicSyntax.Step3;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Type any number: ");
        float a = scanner.nextFloat();

        if (a % 2 == 0 && a > 10 || a == 15){
            System.out.println("First message");
        }
        else{
            System.out.println("Second message");
        }
    }
}
