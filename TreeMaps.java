import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    TreeMap<Person, Integer> T = new TreeMap(new BasedOnDesg());
    T.put(new Person(1, "Designer"), 1);
    T.put(new Person(2, "Tester"), 2);
    T.put(new Person(3, "Developer"), 3);

    for (Map.Entry<Person, Integer> string :T.entrySet() ) {
      System.out.println(string.getKey());
      
    }

    for(Map.Entry<Person, Integer> value:T.entrySet()){
      System.out.println(value.getValue());
    }

    for(Map.Entry<Person, Integer> t: T.entrySet()){
      System.out.println(t);
    }
  }
  
}
