import java.util.HashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
 Map<Integer,Person> p = new HashMap<>();
 p.put(1,new Person("Mani", 21, "dev", 25000));
 p.put(3,new Person("karthik", 21, "hr", 26000));
 p.put(2,new Person("sai", 21, "dev", 27000));
 for(Map.Entry<Integer, Person> per:p.entrySet()){
  System.out.println(per);;
 }


}
}
