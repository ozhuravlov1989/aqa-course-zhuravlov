package Oop;

public class Main {

    public static void main(String[] args) {

        User user1 = new User("wer", "sadasd", "asdasd", "Viewer");

        try {
            user1.setPhoneNumber("412313");
        } catch (PhoneException e) {
            System.out.println(e);
        }

        user1.printUserInfo();

    }
}
