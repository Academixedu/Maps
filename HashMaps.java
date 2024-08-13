 import java.util.HashMap;
import java.util.Map;

public class HashMaps{

  public static void main(String[] args) {
    Map<Integer,Person> hashmaps = new HashMap<Integer,Person>();
    hashmaps.put(1,new Person("Bharath",22, "Developer"));
    hashmaps.put(2,new Person("Shashi",23, "dev"));
    hashmaps.put(3,new Person("manas",28, "prodev"));
    hashmaps.put(1,new Person("Acadamix", 77, "HR"));
    for(Map.Entry<Integer,Person> p : hashmaps.entrySet()){
      System.out.println(p);
    }
  }
}
