package JavaBasicSyntax.Step2;

public class Task2 {
    public static void main(String[] args) {
        int a = 12;
        System.out.println("Post increment - current value: " + a + ", used value: " + a++ + " " + "final value: " + a);
        System.out.println("Pre increment - current value: " + a + ", used value: " + ++a + " " + "final value: " + a);
        System.out.println("Post decrement - current value: " + a + ", used value: " + a-- + " " + "final value: " + a);
        System.out.println("Pre decrement - current value: " + a + ", used value: " + --a + " " + "final value: " + a);
    }
}
