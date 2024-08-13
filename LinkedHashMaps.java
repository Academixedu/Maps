import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {


 Map<Integer,Person00> h=new HashMap<>();
h.put(3,new Person00("RJ.RTN",789,98745,"TL"));
h.put(2,new Person00("RTS",456,63210,"AL"));
h.put(3,new Person00("PJB",123,12365,"Jl"));
for(Integer i:h.keySet()){
System.out.println(i);
}
for(Person00 p:h.values()){
  System.out.println(p);
}

}
}