package JavaBasicSyntax;

public class Step5Task1 {

    public static void main(String[] args) {
        int[] array = {12, 18, 20, 50};
        int sum = 0;

        for (int i : array) {
            sum += i;
        }
        System.out.println(sum);
    }
}
