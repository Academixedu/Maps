
import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
   public static void main(String[] args) {
    HashMap<Integer,Person> p = new HashMap<>();
        p.put(1,new Person("sujatha",21,345678,"xYZ"));
        p.put(2,new Person("swarupa",21,987665,"DFG"));
      
        for ( Entry<Integer,Person>e:p.entrySet()) {
          System.out.println(e);
        }
    }


}
