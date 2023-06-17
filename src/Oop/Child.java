package Oop;

public class Child extends Parent {

    public Child(String name, String email) {
        super(name, email);
    }

    {
        System.out.println("Child non static initialization block");
    }

    static {
        System.out.println("Child static initialization block");
    }


}
