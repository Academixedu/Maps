import java.util.Set;
import java.util.TreeMap;
import java.util.*;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values

  public static void main(String[] args) 
  {
    TreeMap <String , Person> t=new TreeMap<>();
    t.put("Sh", new Person("Shreyash", 2, 985031, "Developer"));
    t.put("A", new Person("Abhishek", 1, 985, "Software Engineer"));
    t.put("R", new Person("Ratan", 3, 9850, "Frontend Developer"));
    t.put("Sa", new Person("Sarvesh", 0, 98503, "Backend Developer"));


    for(String key : t.keySet())
    {
      System.out.println("KEY => "+key);
    }
    System.out.println("-----------------------------------");
    for(Person Value : t.values())
    {
      System.out.println("VALUES => "+Value );
    }
    System.out.println("-----------------------------------");
   

    for(Map.Entry<String,Person> entry : t.entrySet())
    {
      String Key=entry.getKey();
      Person Value=entry.getValue();
      System.out.println("Key => "+Key+" Value => "+Value );
    }
    System.out.println("-----------------------------------");

  }
}