import java.util.Map.Entry;
import java.util.TreeMap;
public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    TreeMap<Integer,Person2> p = new TreeMap<Integer,Person2>();
    p.put(1,new Person2("swarupa", 21, 1));
    p.put(2,new Person2("sujatha", 22, 2));
    
    

         for (Person2 s : p.values()) {
             System.out.println(s);
          }
          for (Integer i : p.keySet()) {
             System.out.println(i);
          }
          for ( Entry<Integer,Person2>e:p.entrySet()) {
          System.out.println(e);
        }
        }
}