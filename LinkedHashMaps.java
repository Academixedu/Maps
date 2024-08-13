import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> lm= new LinkedHashMap<>();
    lm.put(1, "Ritesh");
    lm.put(2, "Gopal");
    lm.put(3, "Gopal");
    lm.put(4, "ALekha");
    lm.put(5, "Niranjan");
    lm.put(6, "Niraa");
    System.out.println("Linked Hasrh Map: "+lm);
System.out.println("------printing values--------");
    for (String value : lm.values()) {
      System.out.println(value);
  }
  System.out.println("------printing keys--------");
   for (Integer key : lm.keySet()){
    System.out.println(key);
   }

  }
}
