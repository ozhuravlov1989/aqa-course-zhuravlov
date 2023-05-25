package JavaBasicSyntax;

import java.util.Scanner;

public class Step6Task1 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any sentence: ");
        String str = scanner.nextLine().replaceAll("\\s", "").toUpperCase();
        char[] result = str.toCharArray();

        for (int i = 0; i < result.length; i++) {
            System.out.println(result[i]);
        }
    }
}
