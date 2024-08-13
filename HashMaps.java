import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
   public static void main(String[] args) {
    HashMap<Integer,Person2> p = new HashMap<>();
        p.put(1,new Person2("Swarupa", 21, 1));
        p.put(2,new Person2("Sujatha", 22, 2));
      
        for ( Entry<Integer,Person2>e:p.entrySet()) {
          System.out.println(e);
        }
    }


}