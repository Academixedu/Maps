import java.util.HashMap;
import java.util.Map.Entry;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
   public static void main(String[] args) {
    HashMap<Integer,Person> p = new HashMap<>();
        p.put(1,new Person("shubham",21,345678,"HGGH"));
        p.put(2,new Person("vijay",21,987665,"fdg"));

        for ( Entry<Integer,Person>e:p.entrySet()) {
          System.out.println(e);
        }
    }


}



  