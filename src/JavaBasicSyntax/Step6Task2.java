package JavaBasicSyntax;

import java.util.Arrays;
import java.util.Scanner;

public class Step6Task2 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any sentence: ");
        String str = scanner.nextLine();
        String reversed = "";
        String[] uppercase = str.split(" ");

        if (str.contains("java")) {
            for (int i = 0; i < str.length(); i++) {
                reversed = str.charAt(i) + reversed;
            }
            System.out.println(reversed);
        } else {
            for (int i = 0; i < uppercase.length; i += 2) {
                uppercase[i] = uppercase[i].toUpperCase();
            }
            System.out.println(Arrays.toString(uppercase));
        }
    }
}