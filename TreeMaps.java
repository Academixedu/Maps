import java.util.*;

public class TreeMaps{
    // Preapare a Logic to add Person Class Objects using Tree Maps
    // Print Only Keys By sorting order of desg
    // Print Only Values By sortin order of desg
    // print both keys and values
    public static void main(String[] args) {
        TreeMap<String, Person> treeMaps = new TreeMap(Collections.reverseOrder());
        treeMaps.put("person 1", new Person("person 1", 1, 'A', 1234567890));
        treeMaps.put("person 2", new Person("person 2", 2, 'B', 1234567891));
        treeMaps.put("person 3", new Person("person 3", 3, 'C', 1234567892));
        treeMaps.put("person 4", new Person("person 4", 4, 'D', 1234567893));

        for (Map.Entry<String, Person> entry : treeMaps.entrySet()) {
            System.out.println("Key : " + entry.getKey());
        }

        for (Map.Entry<String, Person> entry : treeMaps.entrySet()) {
            System.out.println("Value : " + entry.getValue());
        }

        for (Map.Entry<String, Person> entry : treeMaps.entrySet()) {
            System.out.println(entry);
        }
    }
}
