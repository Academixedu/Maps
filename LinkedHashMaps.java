import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args){
    LinkedHashMap<Integer, Person>h=new LinkedHashMap<>();
    h.put(1, new Person(1, "A", "Developer", 50000));
    h.put(2, new Person(2, "B", "Analyst", 60000));
    h.put(3, new Person(3, "C", "Manager", 70000));
    h.put(3, new Person(3, "C", "HR", 7000));

  System.out.println("Iterating using EntrySet:");
  for(Entry<Integer, Person> entry:h.entrySet()){
    System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
 }

 System.out.println("\nPrint  Values:");
        for (Person value : h.values()) {
            System.out.println(value);
        }

System.out.println("\nPrint Keys:");
        for (Integer key : h.keySet()) {
            System.out.println(key);
        }
}
}
