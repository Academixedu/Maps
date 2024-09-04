import java.util.Comparator;
import java.util.Iterator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    
    Comparator c1=new basedondesg();
    
    TreeMap<Person,String>h1=new TreeMap<>();
     h1.put(new Person(1,"vijay",230,"dev"), "hello");
     h1.put(new Person(2,"mello",240,"dig"), "hii");

    for (Map.Entry<Person,String> e1:h1.entrySet()) {
      System.out.println("Key: " + e1.getKey());
    }
   Iterator<Map.Entry<Person,String>> a1=h1.entrySet().iterator();
   while (a1.hasNext()) {
    System.out.println(a1.next());
   }
   for (Map.Entry<Person,String> e1:h1.entrySet()) {
    System.out.println("Key: " + e1.getKey()+ "value" + e1.getValue());
   }
  }
}