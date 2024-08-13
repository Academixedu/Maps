import java.util.LinkedHashMap;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  
public static void main(String[] args) {
  LinkedHashMap<Integer,String>li=new LinkedHashMap<>();
  li.put(1, "Abhishek");
  li.put(0,"Ratan");
  li.put(2, "Shreyash");
  for (String value : li.values())
   {
   System.out.println(value); 
  }
for (Integer key : li.keySet()) {
  System.out.println(key);
}
}



}
