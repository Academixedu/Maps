import java.util.HashMap;
import java.util.Map;

public class HashMaps{

  public static void main(String[] args) {
    Map<Integer,Person> hashmaps = new HashMap<Integer,Person>();
    hashmaps.put(1,new Person("Karthik",21, "Dev"));
    hashmaps.put(2,new Person("Sai",20, "DEV"));
    hashmaps.put(3,new Person("Fayaz",21, "TESTER"));
    hashmaps.put(1,new Person("Karthik", 22, "HR"));
    for(Map.Entry<Integer,Person> p : hashmaps.entrySet()){
      System.out.println(p);
    }
  }
}
