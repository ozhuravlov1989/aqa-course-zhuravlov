package JavaBasicSyntax;

import java.util.Arrays;

public class Step5Task2 {

    public static void main(String[] args) {

        int[] array1 = {13, 42, 43};
        int[] array2 = {4, 5, 6};
        int[] merged = new int[array1.length + array2.length];
        int counter = 0;

        for (int i = 0; i < array1.length; i++) {
            merged[i] = array1[i];
            counter++;
        }
        for (int i : array2) {
            merged[counter++] = i;
        }

        System.out.println(Arrays.toString(merged));

    }
}
