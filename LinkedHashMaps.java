import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps {
    public static void main(String[] args) {
        LinkedHashMap<String, String> linkedHashMap = new LinkedHashMap<>();
        linkedHashMap.put("1", "Alice");
        linkedHashMap.put("2", "Bob");
        linkedHashMap.put("3", "Charlie");

        System.out.println("Values in LinkedHashMap:");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getValue());
        }
        System.out.println("\nKeys in LinkedHashMap:");
        for (Map.Entry<String, String> entry : linkedHashMap.entrySet()) {
            System.out.println(entry.getKey());
        }
    }
}

