import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    Map<Integer,Person> p = new TreeMap<>();
    p.put(1, "PSVSAI");
    p.put(1, "PSVSAI");
    p.put(2, "sai");
    p.put(3, "hi");
    for (Integer key : p.keySet()) {
      System.out.println(key);
  }
  for (Person person : p.values()) {
    System.out.println(person);
}
   
  }
}
