import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    HashMap<Person,String> p = new HashMap<>();
    p.put(new Person(1, "Revathi", 'F', 25000),"Person 1");
    p.put(new Person(3, "Lavanya", 'F', 26000),"Person 2");
    p.put(new Person(2, "Prasanna", 'F', 27000),"Person 3");
    p.put(new Person(2, "Bhavya", 'F', 27000),"Person 4");
    for(Map.Entry<Person,String> per:p.entrySet()){
      System.out.println(per);
    }
  }
}
