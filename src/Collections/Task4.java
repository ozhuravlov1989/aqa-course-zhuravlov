package Collections;

import java.util.Map;
import java.util.TreeMap;

public class Task4 {

    public static Map<String, String> sortMap(Map<String, String> map) {
        Map<String, String> sorted = new TreeMap<>();
        map.forEach((key, value) -> {
            if (key.length() == 3) {
                sorted.put(key, value);
            }
        });
        return sorted;
    }
}