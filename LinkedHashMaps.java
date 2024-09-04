import java.util.*;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
     LinkedHashMap<Integer,String>lh=new LinkedHashMap<>();
     lh.put(3, "vijay");
     lh.put(5, "marsh");

     Iterator<Map.Entry<Integer,String>> il=lh.entrySet().iterator();
     while (il.hasNext()) {
      Map.Entry<Integer,String> in=il.next();
      System.out.println(in.getKey()+ " " +in.getValue());
      
     }


  }
}
