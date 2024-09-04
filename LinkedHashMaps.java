import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys

  public static void main(String[] args) {
    LinkedHashMap<Integer, String> L =new LinkedHashMap();
    L.put(1, "Kalki");
    L.put(2, "Salaar");
    L.put(3, "Radhe Syam");

   Iterator<Map.Entry<Integer, String>> I = L.entrySet().iterator();
   while (I.hasNext()) {
    System.out.println(I.next());
   }
   for (Map.Entry<Integer,String> string : L.entrySet()) {
    System.out.println(string.getValue());
   }
   for (Map.Entry<Integer,String> string : L.entrySet()) {
    System.out.println(string.getKey());
   }
  }
}
