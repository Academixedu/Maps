import java.util.*;
import java.util.Map;


public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
  Map<Person,Integer>L2=new TreeMap<>(BasedOnrole());
  L2.put(new Person("jay",12,"coder",10),1);
  L2.put(new Person("anirudh",2,"SoundEngineer",15),2);
  L2.put(new Person("Rakul",3,"programmer",20),3);
  
  for (Map.Entry<Person,Integer>c:L2.entrySet()) {
    System.out.println(c.getValue());
  }
  for (Map.Entry<Person,Integer>c:L2.entrySet()) {
    System.out.println(c.getKey());
  }
  for (Map.Entry<Person,Integer>c:L2.entrySet()) {
    System.out.println(c);
  }
}
}
