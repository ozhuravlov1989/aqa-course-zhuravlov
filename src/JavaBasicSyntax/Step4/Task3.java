package JavaBasicSyntax.Step4;

import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any number: ");
        int a = scanner.nextInt();
        int maxDivisor = 1;

        for (int i=1; i<=a/2; i++){
            if (a % i == 0){
                maxDivisor = i;
            }
        }
        System.out.println(maxDivisor);


    }
}
