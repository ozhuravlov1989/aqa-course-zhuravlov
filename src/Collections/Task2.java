package Collections;

import java.util.HashMap;

public class Task2 {

    public static void main(String[] args) {
        HashMap<Integer, String> users = new HashMap<>();
        users.put(2, "even");
        users.put(13, "odd");

        users.forEach((key, value) -> {
            if (key % 2 == 0) {
                System.out.println(value);
            }
        });
    }
}
