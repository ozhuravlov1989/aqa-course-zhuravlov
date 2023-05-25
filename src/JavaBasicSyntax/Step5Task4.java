package JavaBasicSyntax;

import java.util.Arrays;

public class Step5Task4 {

    public static void main(String[] args) {
        int[] array = {4, 23, 55, 3, 1, 122};

        for (int i = 0; i < array.length - 1; i++) {
            for (int j = i + 1; j < array.length; j++) {
                if (array[i] > array[j]) {
                    int k = array[i];
                    array[i] = array[j];
                    array[j] = k;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
