import java.util.*;

public class HashMaps {
  // Preapare a Logic to print LinkedHashMaps in Java
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer, String> ls = new LinkedHashMap<Integer, String>();
    ls.put(12, "hello");
    ls.put(98, "oops");
    ls.put(76, "yup");
    ls.put(86, "yeah");
    Iterator<Map.Entry<Integer, String>> it = ls.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Integer, String> entry = it.next();

      System.out.println(" " + entry.getKey() + "=" + entry.getValue());
    }


  }

}
