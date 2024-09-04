import java.util.LinkedHashMap;
import java.util.Map.Entry;


public class LinkedHashMaps{
  public static void main(String[] args) {
    
  
  LinkedHashMap<Integer, String>v=new LinkedHashMap<>(); 
  v.put(1,"rohit"); 
  v.put(2, "mohit"); 
  v.put (1, "nanda"); 
  
  for (Entry<Integer, String> d:v.entrySet()) 
  { 
    System.out.println(d.getKey()); 
  }
  
  for(Entry<Integer, String> d:v.entrySet())
  { System.out.println(d.getValue());
  }
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
}
}
