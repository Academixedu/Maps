
  import java.util.LinkedHashMap;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,Person2> p = new LinkedHashMap<>();
    p.put(2,new Person2("Sujatha", 22, 2));
    
         for (Person2 s : p.values()) {
             System.out.println(s);
          }
          for (Integer i : p.keySet()) {
             System.out.println(i);
          }
  }
}
