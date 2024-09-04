import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;

public class LinkedHashMaps{
  public static void main(String[] args) {
    System.out.println("KEYS");
    LinkedHashMap<Integer,String>l=new LinkedHashMap<>();
    l.put(22, "aman");
    l.put(23, "oman");
    l.put(24, "baddy");
    Iterator<Map.Entry<Integer,String>>i=l.entrySet().iterator();
    while (i.hasNext()) {
      System.out.println(i.next().getKey());
    }
    System.out.println("VALUES ");
    LinkedHashMap<Integer,String>m=new LinkedHashMap<>();
    m.put(22, "aman");
    m.put(23, "oman");
    m.put(24, "baddy");
    Iterator<Map.Entry<Integer,String>>j=m.entrySet().iterator();
    while (j.hasNext()) {
      System.out.println(j.next().getValue());
    }
  }

}
