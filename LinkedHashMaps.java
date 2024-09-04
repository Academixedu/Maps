import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,String>v=new LinkedHashMap<>();
    v.put(1, "hllo");
  v.put(2, "chalo");
    v.put(1, "hllo");
    for(Map.Entry<Integer,String>d:v.entrySet()){
      System.out.println(d.getKey());
    }
    for(Map.Entry<Integer,String>d:v.entrySet()){
      System.out.println(d.getValue());
    }
  }
  
}


    
      

       
       
        
