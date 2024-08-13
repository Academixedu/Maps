import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;


public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each

  public static void main(String[] args) {
    Map<Integer,String>p=new HashMap();
    p.put(1, "sarvesh");
    p.put(3, "ratan");
    p.put(2, "abhi");
    p.put(4, "choko");
    p.put(1, "saru");

    for ( Entry<Integer,String>string:p.entrySet()) {
      System.out.println(string);
  }




      
    
  }




}
