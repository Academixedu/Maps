import java.util.LinkedHashMap;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,Person> p = new LinkedHashMap<>();
    p.put(1,new Person("sujatha",21,345678,"dev"));
    p.put(2,new Person("swarupa",21,987665,"hr"));
         for (Person s : p.values()) {
             System.out.println(s);
          }
          for (Integer i : p.keySet()) {
             System.out.println(i);
          }
        }

}
