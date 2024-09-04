import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each

  public static void main(String[] args) {
    HashMap<Person, Integer> H = new HashMap<Person, Integer>();
    H.put(new Person(1, "Kalki"), 1);
    H.put(new Person(2, "Salaar"), 2);
    H.put(new Person(3, "Radhe Syam"), 1);

    for (Map.Entry<Person,Integer> string : H.entrySet()) {
      System.out.println(string);
      
    }

  }
}
