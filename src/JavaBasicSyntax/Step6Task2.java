package JavaBasicSyntax;

import java.util.Arrays;

public class Step6Task2 {

    public static void main(String[] args) {
        String str = "Lorem ipsum is java simply dummy text of the printing and typesetting industry";
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