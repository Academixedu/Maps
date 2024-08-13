public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps

  import java.util.Map;
import java.util.TreeMap;
import java.util.TreeSet;
import java.util.Comparator;

public class TreeMaps {
  // Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
}
  // print both keys and valueszz
    public static void main(String[] args) {
        // Create a TreeMap with a Comparator to sort based on 'desg' of Person
        Map<Integer, Person> p = new TreeMap<Integer,Person>();

        // Add Person objects to the TreeMap
        p.put(1, new Person("fayaz", 21, "dev", 25000));
        p.put(3, new Person("karthik", 21, "hr", 26000));
        p.put(2, new Person("sai", 21, "dev", 27000));

        // Print only keys by sorting order of 'desg'
        for (Integer key : p.keySet()) {
            System.out.println(key);
        }

        // Print only values by sorting order of 'desg'
        for (Person person : p.values()) {
            System.out.println(person);
        }

        // Print both keys and values
        for (Map.Entry<Integer, Person> entry : p.entrySet()) {
            System.out.println(entry);
        }
    }
  }
