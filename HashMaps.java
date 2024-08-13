import java.util.HashMap;
import java.util.Map;

public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    Map<Integer,Person00> p=new HashMap<>();
      p.put(4,new Person00("RJ.RTN",789,98745,"TL"));
      p.put(2,new Person00("RTS",456,63210,"AL"));
      p.put(3,new Person00("PJB",123,12365,"Jl"));
    for (Map.Entry<Integer,Person00> e : p.entrySet()) {
      System.out.println(e);

    }
  }

}