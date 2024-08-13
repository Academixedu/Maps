import java.util.LinkedHashMap;
import java.util.Map;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
   LinkedHashMap<Integer,Person> p = new LinkedHashMap<>();
   p.put(1, "Mahesh");
   p.put(1, "PSVSAI");
   p.put(2, "Venkata");
   for(Integer i:p.keySet()){
    System.out.println(i);
   }
   for(Person a: p.values()){
    System.out.println(a);
   }
   for (Map.Entry<Integer, Person> entry : p.entrySet()) {
    System.out.println(entry);
}
}
  }

