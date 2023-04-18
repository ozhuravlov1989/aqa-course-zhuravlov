package JavaBasicSyntax;

import java.util.Scanner;

public class Step6Task3 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Type any sentence: ");
        String str = scanner.nextLine();
        System.out.print("Choose any symbol: ");
        char[] ltr = scanner.nextLine().toCharArray();
        int counter = 0;

        for (int i = 0; i < str.length(); i++) {
            if (str.charAt(i) == ltr[0]) {
                counter += 1;
            }
        }
        System.out.println("There is " + counter + " symbols " + "\"" + ltr[0] + "\"" + " in this sentence");
    }
}
