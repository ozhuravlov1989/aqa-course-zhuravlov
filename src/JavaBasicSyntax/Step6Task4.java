package JavaBasicSyntax;

import java.util.Scanner;

public class Step6Task4 {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type any sentence in 'PascalCase' style");
        String str = scanner.nextLine().replaceAll("(.)([A-Z])", "$1 $2");
        System.out.println(str);
    }
}

