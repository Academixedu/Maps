import java.util.HashMap;
import java.util.Map;

public class HashMaps{
  // Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    HashMap<Person,String>ln=new HashMap<>();
    ln.put(new Person(1,"oreo",'A',"good"),"haaa");
    ln.put(new Person(2,"pari",'B',"ok"),"ooo" );
    for(Map.Entry<Person,String>n:ln.entrySet()){
      System.out.println(n.getKey()+" "+n.getValue());
    }
  }
}
