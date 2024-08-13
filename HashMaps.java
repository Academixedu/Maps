import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    Map<Integer,Person> p=new HashMap<>();
    p.put(1,new Person("pavs",1,45000,"developer"));
    p.put(2,new Person("gani",2,50000,"hr"));
    p.put(3,new Person("rams",3,70000,"manager"));
    for (Map.Entry<Integer,Person> e : p.entrySet()) {
      System.out.println(e);

    }
  }

}

