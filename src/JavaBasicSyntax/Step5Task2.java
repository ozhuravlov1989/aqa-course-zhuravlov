package JavaBasicSyntax;

import java.util.ArrayList;
import java.util.Arrays;

public class Step5Task2 {

    public static void main(String[] args) {
        ArrayList<String> listOne = new ArrayList<>(Arrays.asList("a", "b", "c"));
        ArrayList<String> listTwo = new ArrayList<>(Arrays.asList("c", "d", "e", "qweqwe"));
        ArrayList<String> listSum = new ArrayList<>(listOne);
        listSum.addAll(listTwo);

        System.out.println(listSum);
    }
}
