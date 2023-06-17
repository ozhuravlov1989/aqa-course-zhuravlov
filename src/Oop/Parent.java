package Oop;

public class Parent {

    private String name;
    private String email;

    public Parent(String name, String email) {
        this.email = email;
        this.name = name;
    }

    {
        System.out.println("Parent non static initialization block");
    }

    static {
        System.out.println("Parent static initialization block");
    }
}
