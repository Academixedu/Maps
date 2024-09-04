import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    Comparator s1=new Basedondesg();
    TreeMap<Person,String> s2=new TreeMap<>();
    s2.put(new Person(1,"ekadiki",'a',"impressive"),"podam");
    s2.put(new Person(2,"chappu",'b',"not bad"),"sarey");
    for(Map.Entry<Person,String> h1:s2.entrySet()){
      System.out.println("key: "+h1.getKey());
    }
    for(Map.Entry<Person,String> h1:s2.entrySet()){
      System.out.println("value: "+h1.getValue());
    }
    for(Map.Entry<Person,String> h1:s2.entrySet()){
      System.out.println(h1.getKey()+" "+h1.getValue());
    }
  }
}
