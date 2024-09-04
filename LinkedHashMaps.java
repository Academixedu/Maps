
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
    // Preapare a Logic to print LinkedHashMaps in Java
    // Itearatre it using EntrySet
    // Print Only Values
    // Print Only Keys
    public static void main(String[] args) {
    LinkedHashMap<String,Integer> linkedHashMaps = new LinkedHashMap();
    linkedHashMaps.put("A", 1);
    linkedHashMaps.put("B", 2);
    linkedHashMaps.put("C", 3);
    linkedHashMaps.put("D", 4);
    linkedHashMaps.put("E", 5);

         for (Map.Entry<String, Integer> entry : linkedHashMaps.entrySet()) {
              System.out.println( "Value :"+ entry.getValue());
         }
        for (Map.Entry<String, Integer> entry : linkedHashMaps.entrySet()) {
            System.out.println("key :"+entry.getKey());
        }

    }
}
