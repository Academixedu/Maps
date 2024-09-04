import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps {
    // Prepare a Logic to add Person Class Objects using Tree Maps
    // Print Only Keys By sorting order of desg
    // Print Only Values By sorting order of desg
    // Print both keys and values
    public static void main(String[] args) {
        
        TreeMap<Person, Integer> h = new TreeMap<>(new DesgComparator());

        
        h.put(new Person(9, "A", "dev", 2000), 1);
        h.put(new Person(7, "B", "web", 2300), 2);
        h.put(new Person(2, "C", "tester", 1200), 3);
        h.put(new Person(9, "N", "tester", 1200), 4);

        
        System.out.println("Keys Sorted By desg:");
        for (Person key : h.keySet()) {
            System.out.println(key);
        }

        
        System.out.println("\nValues Sorted By desg:");
        for (Integer value : h.values()) {
            System.out.println(value);
        }

        
        System.out.println("\nBoth Keys and Values:");
        for (Map.Entry<Person, Integer> entry : h.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }

   
    static class DesgComparator implements Comparator<Person> {
        @Override
        public int compare(Person p1, Person p2) {
            return p1.getDesg().compareTo(p2.getDesg());
        }
    }
}
