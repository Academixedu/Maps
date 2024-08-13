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
h.put(3,new Person("pavs",22,30000,"developer"));
h.put(5,new Person("gani", 22, 35000, "hr"));
h.put(4,new Person("rams",184,40000, "manager"));
for(Integer i:h.keySet()){
System.out.println(i);
}
for(Person p:h.values()){
  System.out.println(p);
}

}
}