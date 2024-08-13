import java.util.*;
public class LinkedHashMaps
{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys

  public static void main(String[] args) 
  {
  LinkedHashMap <Object,Object> m=new LinkedHashMap();

    m.put(101,"Java");
    m.put("Java",1000);
    m.put (null,null);
    m.put(105,"Java");

    for(Object obj1: m.keySet())
    {
      System.out.println(obj1);
    }
    System.out.println("--------------------");
    for(Object obj2: m.values())
    {
      System.out.println(obj2);
    }
  
  }
  

}
