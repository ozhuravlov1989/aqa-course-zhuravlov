package JavaBasicSyntax;

public class Step5Task3 {

    public static void main(String[] args) {
        int[] array = {34, 342, 220, 50};
        int max = array[0];

        for (int i : array) {
            if (i > max) {
                max = i;
            }
        }
        System.out.println(max);
    }
}
