import java.security.Permission;
import java.util.HashMap;
import java.util.Map;

public class HashMaps{
  public static void main(String[] args) {
    HashMap<Person,String>l=new HashMap<>();
    l.put(new Person(1,"rohit",5000), "first person");
    l.put(new Person(2,"mohit",54500), "second person");
    l.put(new Person(3,"nanda",5003450), "third person");
    l.put(new Person(1,"rohit",54534000), "forth person");
  
  for(Map.Entry<Person,String>k:l.entrySet()){
    
    System.out.println(k);
    
  }
    // Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
}
}

