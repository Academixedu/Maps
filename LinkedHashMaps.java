import java.util.LinkedHashMap;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
public static void main(String[] args) 
{
   LinkedHashMap <Integer,String> li=new LinkedHashMap<>();
   li.put(1, "Shreyash");
   li.put(0, "Abhi");
   li.put(2, "Ratan");

  for (String value : li.values()) 
  {
    System.out.println(value);  
  }
  for(Integer Key : li.keySet())
  {
    System.out.println(Key);
  }
}

}
