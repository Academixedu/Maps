import java.util.Comparator;
import java.util.Map;
import java.util.TreeMap;

public class TreeMaps{
// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
  public static void main(String[] args) {
    TreeMap<Person1, Integer> h = new TreeMap<>(new DesgComparator());
    h.put(new Person1(1, "Revathi",20000,"HR"), 1);
    h.put(new Person1(2, "Bhavya", 25000, "Dev"), 2);
    h.put(new Person1(3, "Lavanya",30000, "tester"), 3);
    h.put(new Person1(4, "Prasanna", 30000,"tester"), 4);
    System.out.println("Keys Sorted By desg:");
    for (Person1 key : h.keySet()) {
      System.out.println(key);
    }
    System.out.println("Values Sorted By desg:");
    for (Integer value : h.values()) {
      System.out.println(value);
    }
    System.out.println("Keys and Values:");
    for (Map.Entry<Person1, Integer> entry : h.entrySet()) {
      System.out.println(entry.getKey() + ", Value: " + entry.getValue());
    }
  }
  static class DesgComparator implements Comparator<Person1> {
    @Override
    public int compare(Person1 p1, Person1 p2) {
      return p1.getDesg().compareTo(p2.getDesg());
    }
  }
}