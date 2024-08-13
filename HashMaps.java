import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    Map<Integer,Person> p=new HashMap<>();
    p.put(4,new Person("sai",21,345,"dev"));
    p.put(2,new Person("fayaz",21,653,"hr"));
    p.put(3,new Person("karthik",54,2345,"manager"));
    for (Map.Entry<Integer,Person> e : p.entrySet()) {
      System.out.println(e);
      
    }
  }

}
