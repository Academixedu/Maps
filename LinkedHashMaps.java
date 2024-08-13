import java.util.Map;
import java.security.KeyStore.Entry;
import java.util.LinkedHashMap;
// import java.util.Map.Entry;


public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
public static void main(String[] args) {
  
  Map<Integer,String>s=new LinkedHashMap<Integer,String>();

  s.put(1,"Sarvesh");
  s.put(4,"Abhi");
  s.put(1,"Saru");
  s.put(3,"ratan");
  s.put(2,"choco");

for(Map.Entry<Integer,String> entry:s.entrySet()){

Integer key=entry.getKey();
String value=entry.getValue();
System.out.println("kays:"+key+" value:"+value);


}










}

}
