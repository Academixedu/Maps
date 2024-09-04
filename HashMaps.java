import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
 public static void main(String[] args) {
  

   HashMap<Person,String>v=new HashMap<>();
   v.put(new Person(1,"rohit","head"),"Hi");
   v.put(new Person(2,"rohit","Hr"),"hh");
   v.put(new Person(1,"hello","Hr"),"oo");
   for(Map.Entry<Person,String>r:v.entrySet()){
       System.out.println(r);

}
}
}