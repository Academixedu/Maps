import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
 public static void main(String[]args){
  
  HashMap<Integer,Person> p=new HashMap<>();
  
  p.put(1,new Person(1, "A","dev" , 2000));
  p.put(3,new Person(3, "B", "web", 2300));
  p.put(2,new Person(2, "C", "tester", 1200));
  p.put(2,new Person(2, "N", "tester", 1200));
  
  for (Map.Entry<Integer, Person> entry : p.entrySet()) {
    Integer key = entry.getKey();
    Person value = entry.getValue();
    System.out.println("Key: " + key + ", Value: " + value);
}
 } 
}
