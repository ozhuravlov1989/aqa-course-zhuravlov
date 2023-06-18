package Collections;

import java.util.ArrayList;
import java.util.HashSet;

public class Task3 {

    public static void main(String[] args) {
        HashSet<String> namesSet = new HashSet<>();
        ArrayList<String> namesList = new ArrayList<>();
        ArrayList<String> all = new ArrayList<>();

        namesSet.add("Olya");
        namesSet.add("Natasha");
        namesSet.add("Polina");
        namesSet.add("Vlad");

        namesList.add("Bohdan");
        namesList.add("Oleksandr");
        namesList.add("Vlad");
        namesList.add("Natasha");

        all.addAll(namesSet);
        all.addAll(namesList);

        System.out.println(all);

    }
}
