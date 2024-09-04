import java.util.Map;
import java.util.HashMap;
public class HashMaps{
  public static void main(String[] args) {
    HashMap<Person,Integer>h=new HashMap<>();
    h.put(new Person(1,"lily",5.2,"clerk"),1);
    h.put(new Person(2,"frody",5.6,"developer"),2);
    h.put(new Person(3,"pari",5.3,"analyst"),3);
    for ( Map.Entry<Person,Integer>h1:h.entrySet()) {
      System.out.println(h1);
    }
  }

}
