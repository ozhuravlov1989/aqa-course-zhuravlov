package JavaBasicSyntax.Step2;

import java.util.Scanner;
public class Task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Enter \"a\" side length:");
            double a = scanner.nextDouble();
        System.out.println("Enter \"b\" side length:");
            double b = scanner.nextDouble();
        System.out.println("Enter \"c\" side length:");
            double c = scanner.nextDouble();

        if (a+b>c & a+c>b & b+c>a){
            double p = (a+b+c)/2;
            double s = Math.sqrt(p*(p-a)*(p-b)*(p-c));
            System.out.println("Area of triangle is:" + s);
        }
        else {
            System.out.println("Such triangle cannot exist");
        }
    }
}