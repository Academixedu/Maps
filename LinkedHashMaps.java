import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
// Itearatre it using EntrySet
// Print Only Values
// Print Only Keys
  public static void main(String[] args) {
    LinkedHashMap<Integer,String> lg=new LinkedHashMap<>();
    lg.put(2,"chap ra");
    lg.put(3,"adi ra");
    Iterator<Map.Entry<Integer,String>> s =lg.entrySet().iterator();
    while (s.hasNext()) {
      Map.Entry<Integer,String> o=s.next();
      System.out.println(o.getKey()+" "+o.getValue());
      
    }
  }
}
