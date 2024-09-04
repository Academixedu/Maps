import java.util.LinkedHashMap;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,Person> p = new LinkedHashMap<>();
    p.put(1,new Person("shubham",21,345678,"sh"));
    p.put(2,new Person("vijay",21,987665,"vi"));
         for (Person s : p.values()) {
             System.out.println(s);
          }
          for (Integer i : p.keySet()) {
             System.out.println(i);
          }
        }

}