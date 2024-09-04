import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    TreeMap<Integer,Person> p = new TreeMap<>();
    p.put(1,new Person("shubham",21,345678,"sh"));
    p.put(2,new Person("vijsy",21,987665,"vi"));

         for (Person s : p.values()) {
             System.out.println(s);
          }
          for (Integer i : p.keySet()) {
             System.out.println(i);
          }
          for ( Entry<Integer,Person>e:p.entrySet()) {
          System.out.println(e);
        }
        }
}
