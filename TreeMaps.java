
// import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMaps{
  public static void main(String[] args) {



    TreeMap<String,Person>k=new TreeMap<>();



    k.put("rohit",new Person(1,"orhit",4000));
    k.put( "mohit",new Person(2,"mohit",3000));
    k.put( "nanda",new Person(3,"nanda", 90000));
  

    
    for (String key :k.keySet()) {
      System.out.println(key);
  }

  // Print only values sorted by designation (in the order of keys)
  System.out.println("\nValues (Persons) in sorted order by designation:");
  for (Person person : k.values()) {
      System.out.println(person);
  }

  // Print both keys and values
  System.out.println("\nBoth keys and values:");
  for (Entry<String, Person> entry : k.entrySet()) {
      System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
  }

        // System.out.println("\nValues (Persons) in sorted order by designation:");
        // for (Person person : Person.values()) {
        //     System.out.println(person);
        // }

        
      
        for (Entry<String, Person> entry : k.entrySet()) {
            System.out.println(entry);
        }

  }



// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
}
