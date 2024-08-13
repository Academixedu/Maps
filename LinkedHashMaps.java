import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    
  
 Map<Integer,Person> h=new HashMap<>();
h.put(3,new Person("sai",23,3455,"dev"));
h.put(5,new Person("Fayaz", 21, 1234, "hr"));
h.put(4,new Person("karthik", 034,4321, "manager"));
for(Integer i:h.keySet()){
System.out.println(i);
}
for(Person p:h.values()){
  System.out.println(p);
}

}
}