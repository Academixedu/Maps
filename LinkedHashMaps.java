 import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
  public static void main(String[] args) {
    Map<Integer,Person> map = new LinkedHashMap<Integer,Person>();
    hashmaps.put(1,new Person("Bharath",22, "Developer"));
    hashmaps.put(2,new Person("Shashi",23, "dev"));
    hashmaps.put(3,new Person("manas",28, "prodev"));
    hashmaps.put(1,new Person("Acadamix", 77, "HR"));
    System.out.println("Keys:");
    for(Integer i : map.keySet()){
      System.out.println(i);
    }
    System.out.println("\nValues:");
    for(Person p : map.values()){
      System.out.println(p);
    }
  }
  
}
