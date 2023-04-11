package JavaBasicSyntax;

import java.util.Scanner;

public class Step4Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any number: ");
        int a = scanner.nextInt();
        int i = 0;

        if (a < 0){
            System.out.println("Error: Number must be greater than 0");
        }
        else{
            while (i <= a){
                if (i % 2 == 0 && i % 3 !=0 ) {
                    System.out.println("The number is even: " + i);
                    i++;
                }
                else if (i % 3 == 0) {
                    System.out.println("The number multiple to 3");
                    i++;
                }
                else{
                    System.out.println(i);
                    i++;
                }
            }
        }
    }
}
