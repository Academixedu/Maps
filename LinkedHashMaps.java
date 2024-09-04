import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,String> p = new LinkedHashMap<>();
    p.put(1,"Revathi");
    p.put(2,"Lavanya");
    p.put(3,"Prasanna");
    p.put(4,"Bhavya");
    p.put(4,"Bhavya");
    System.out.println("LinkedHashMap Entries--");
    for(Map.Entry<Integer,String> h:p.entrySet()){
      System.out.println(h);
    }
    System.out.println("Printing the values:");
    for (String val : p.values()) {
      System.out.println(val);
    }
    System.out.println("Printing the keys:");
    for (Integer key : p.keySet()) {
       System.out.println(key);
    }
  }
}
