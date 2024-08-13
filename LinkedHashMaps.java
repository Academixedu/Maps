import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
  public static void main(String[] args) {
    Map<Integer,Person> map = new LinkedHashMap<Integer,Person>();
    map.put(1,new Person("Karthik",21, "DEV"));
    map.put(2,new Person("Sai",20, "DEV"));
    map.put(3,new Person("Fayaz",21, "TESTER"));
    map.put(1,new Person("Karthik", 22, "HR"));
    
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
