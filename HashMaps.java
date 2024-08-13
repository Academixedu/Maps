import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
   public static void main(String[] args) {
    Map<Integer,Person> map = new HashMap<Integer,Person>();
    map.put(1, "PSVSAI");
    map.put(2, "sai");
    map.put(3, "hi");

    for(Map.Entry<Integer,Person> p : map.entrySet()){
      System.out.println(p);
    }
  }
}
