
// import java.util.Map;
import java.util.Map.Entry;
import java.util.TreeMap;

public class TreeMaps{
  public static void main(String[] args) {



    TreeMap<Person,String>k=new TreeMap<>();



    k.put(new Person(1,"orhit",4000), "rohit");
    k.put(new Person(2,"mohit",3000), "mohit");
    k.put(new Person(3,"nanda", 90000), "nanda");
  

    
        for (Entry<Person, String> key :k.entrySet()) {
            System.out.println(key);
        }

        // System.out.println("\nValues (Persons) in sorted order by designation:");
        // for (Person person : Person.values()) {
        //     System.out.println(person);
        // }

        
      
        for (Entry<Person, String> entry : k.entrySet()) {
            System.out.println(entry);
        }

  }



// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
}
