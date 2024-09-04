import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    public static void main(String[] args) {
        // Create a TreeMap with a custom Comparator to sort by id in descending order
        TreeMap<Person, String> tt = new TreeMap<>();

        // Add Person objects to the TreeMap
        tt.put(new Person(48, "Vijay", 30, 50000), "Developer");
        tt.put(new Person(23, "Prameela", 28, 45000), "Manager");
        tt.put(new Person(35, "Bikshapathi", 32, 48000), "Analyst");
        tt.put(new Person(41, "Usha", 29, 47000), "Designer");
        tt.put(new Person(29, "Ramya Sri", 27, 46000), "Consultant");

        // Print only keys in descending order
        System.out.println("Printing Only Keys (Descending order by ID):");
        for (Person key : tt.keySet()) {
            System.out.println(key);
        }

        // Print only values (order by corresponding keys)
        System.out.println("\nPrinting Only Values:");
        for (String value : tt.values()) {
            System.out.println(value);
        }

        // Print both keys and values
        System.out.println("\nPrinting Both Keys and Values:");
        for (Map.Entry<Person, String> entry : tt.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
