import java.util.TreeMap;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Map;

public class TreeMaps{
  public static void main(String[] args) {
    Map<Integer,Person> map = new TreeMap<Integer,Person>();
    map.put(1,new Person("Karthik",21, "DEV"));
    map.put(2,new Person("Sai",20, "DEV"));
    map.put(3,new Person("Fayaz",21, "TESTER"));
    map.put(1,new Person("Karthik", 22, "HR"));

    System.out.println("Keys:");
    List<Integer> keys = new ArrayList<>(map.keySet());
    keys.sort((k1, k2) -> {
      Person p1 = map.get(k1);
      Person p2 = map.get(k2);
      return p1.getDesg().compareTo(p2.getDesg());
    });
    for(Integer key :  keys){
      System.out.println(key);
    }

    System.out.println("\nValues:");
    List<Person> values = new ArrayList<>(map.values());
    Collections.sort(values, new BasedOnDesg());
    for(Person person : values){
      System.out.println(person);
    }

    System.out.println("\nKeys and Values:");
    for(Map.Entry<Integer,Person> p : map.entrySet()){
      System.out.println(p);
    }
  }
}
