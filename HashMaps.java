import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    
    HashMap<Person,String>hs=new HashMap<>();
    
    hs.put(new Person(2,"vijay",220,"dev"),"hello");
    hs.put(new Person(4,"mello",250,"dig"),"world");

    for (Map.Entry<Person,String> s : hs.entrySet()) {
      System.out.println(s.getKey()+" "+s.getValue());
    }
   Iterator<Map.Entry<Person,String>>is=hs.entrySet().iterator();
  while (is.hasNext()) {
    System.out.println(is.next());
  }
  
    
 }
}
