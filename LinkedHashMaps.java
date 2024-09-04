import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
   
    LinkedHashMap<Integer, String> map = new LinkedHashMap<>();
    map.put(1, "vijay");
    map.put(2, "dinesh");
    map.put(3, "bikshu");
    map.put(4, "modi");
    map.put(5, "leon");
    
    System.out.println("Printing Only Values:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getValue());
    }
    System.out.println("\nPrinting Only Keys:");
    for (Map.Entry<Integer, String> entry : map.entrySet()) {
        System.out.println(entry.getKey());
    }
}
}
