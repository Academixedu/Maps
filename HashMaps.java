import java.util.*;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) 
  {
     HashMap <Integer,Person> h=new HashMap<>();
     h.put(1,new Person("Shreyash", 1, 357899, "Developer") );
     h.put(2,new Person("Abhi", 3, 35789, "Developer") );
     h.put(3,new Person("Ratan", 2, 3599, "Developer") );
     for (Map.Entry<Integer,Person> entry:h.entrySet()) 
     {
        Integer key=entry.getKey();
        Person value=entry.getValue();
        System.out.println("Key => "+key+" , "+" Value => "+value); 
     }
     


  }
}