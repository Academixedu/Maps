package okay;

import java.util.*;

public class TreeMaps {
  // Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    Comparator p12 = new basedondesg();
    TreeMap<Person, String> map = new TreeMap<Person, String>(p12);
    Person p = new Person("hello", 21, 34, "Developer");
    map.put(p, "hello");
    p = new Person("world", 18, 27, "Manager");
    map.put(p, "world");
    p = new Person("global", 23, 27, "worker");
    map.put(p, "global");

    for (Map.Entry<Person, String> entry : map.entrySet()) {
      System.out.println("Key: " + entry.getKey());
    }
    Iterator<Map.Entry<Person, String>> it = map.entrySet().iterator();
    while (it.hasNext()) {
      Map.Entry<Person, String> pair = it.next();
      System.out.println("Value: " + pair.getValue());
    }
    for (Map.Entry<Person, String> entry : map.entrySet()) {
      System.out.println("Keys: " + entry.getKey() + ", Values: " + entry.getValue());
    }
  }
}
