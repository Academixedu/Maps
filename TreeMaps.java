
import java.util.Map;
import java.util.TreeMap;
import java.util.Comparator;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
   
    Map<Integer, Person> map = new TreeMap<>();

    map.put(3, new Person("Sai", 23, 3455, "Developer"));
    map.put(5, new Person("Fayaz", 21, 1234, "manager"));
    map.put(4, new Person("Karthik", 34, 4321, "hr"));

   
    Map<String, Person> sortedByDesignation = new TreeMap<>();
    for (Person person : map.values()) {
        sortedByDesignation.put(person.getDesg(), person);
    }

    
    System.out.println("Keys (Designations) in sorted order:");
    for (String key : sortedByDesignation.keySet()) {
        System.out.println(key);
    }

    System.out.println("\nValues  in sorted order by designation:");
    for (Person person : sortedByDesignation.values()) {
        System.out.println(person);
    }

    System.out.println("\nKeys and Values:");
    for (Map.Entry<String, Person> entry : sortedByDesignation.entrySet()) {
        System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
    }
}
}
