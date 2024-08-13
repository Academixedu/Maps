import java.util.Map;
import java.util.TreeMap;

// Person class
class Person {
    private int p_id;
    private String p_name;
    private int p_age;

    public Person(int p_id, String p_name, int p_age) {
        this.p_id = p_id;
        this.p_name = p_name;
        this.p_age = p_age;
    }

    public int getP_id() {
        return p_id;
    }

    public String getP_name() {
        return p_name;
    }

    public int getP_age() {
        return p_age;
    }

    @Override
    public String toString() {
        return "Person [p_id=" + p_id + ", p_name=" + p_name + ", p_age=" + p_age + "]";
    }
}

public class TreeMaps {
    public static void main(String[] args) {
        // Creating a TreeMap with Integer keys and Person values
        TreeMap<Integer, Person> h = new TreeMap<>();
        h.put(1, new Person(1, "sri", 22));
        h.put(2, new Person(2, "sanky", 23));
        h.put(3, new Person(3, "keer", 21));

        // Print only keys
        System.out.println("Keys:");
        for (Integer key : h.keySet()) {
            System.out.println("KEY => " + key);
        }

        // Print only values
        System.out.println("\nValues:");
        for (Person value : h.values()) {
            System.out.println("VALUES => " + value);
        }

        // Print both keys and values
        System.out.println("\nKeys and Values:");
        for (Map.Entry<Integer, Person> entry : h.entrySet()) {
            Integer key = entry.getKey();
            Person value = entry.getValue();
            System.out.println("Key => " + key + " Value => " + value);
        }
    }
}
