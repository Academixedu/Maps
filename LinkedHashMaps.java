import java.util.*;
public class LinkedHashMaps{
// Preapare a Logic to print LinkedHashMaps in Java 
  // Itearatre it using EntrySet
  // Print Only Values
  // Print Only Keys
  public static void main(String[] args) {
  Map<Person,Integer>L1=new LinkedHashMap<>();
  L1.put(new Person("Ajay",12,"coder",10),1);
  L1.put(new Person("mani",2,"code",15),2);
  L1.put(new Person("Rahul",3,"coding",20),3);
  Iterator<Map.Entry<Person,Integer>>x=L1.entrySet().iterator();
  while(x.hasNext()){
    System.out.println(x.next());
  }
  
  for (Map.Entry<Person,Integer>L:L1.entrySet()) {
    System.out.println(L.getValue());
  }
  for (Map.Entry<Person,Integer>L:L1.entrySet()) {
    System.out.println(L.getKey());
  }
  
  }
}
