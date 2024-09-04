import java.util.TreeMap;
import java.util.Map;
import java.util.Scanner;
import java.util.Comparator;
public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
  Comparator d=new desg();
  Scanner y=new Scanner(System.in);
  System.out.println("Enter any value");
  String m=y.next();
  
  TreeMap<Person,String> n=new TreeMap<>(d);
  n.put(new Person(1,"rello","head"),"1");
  n.put(new Person(2,"hohit","Hr"),"2");
  n.put(new Person(3,"arbaz","Hr"),"1");
 if(m.contains("KEYS")){
   for(Map.Entry<Person,String> v:n.entrySet()){
  System.out.println(v.getKey());
   }
   else if(m.contains("values")){
     for(Map.Entry<Person,String> v:n.entrySet()){
       System.out.println(v.getValue());
        }

}
 }
  // // for (Map.Entry<String, Person> v:m.entrySet()) {
  //   //     System.out.println(v.getKey()); 
  //   // }
  //   System.out.println("Keys sorted by desg:");
  // System.out.println("values sorted by desg:");
}
}