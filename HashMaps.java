import java.util.HashMap;
import java.util.Map;


public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
 Map<Integer,Person> p = new HashMap<>();
 p.put(1,new Person("fayaz", 21, "dev", 25000));
 p.put(3,new Person("karthik", 21, "hr", 26000));
 p.put(2,new Person("sai", 21, "dev", 27000));
 for(Map.Entry<Integer, Person> per:p.entrySet()){
  System.out.println(per);;
 }


}
}