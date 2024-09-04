import java.util.Map;
import java.util.TreeMap;

class Person {
    private String name;
    private int age;

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    @Override
    public String toString() {
        return "Person{name='" + name + "', age=" + age + "}";
    }
}

public class TreeMaps {
    public static void main(String[] args) {
        TreeMap<String, Person> treeMap = new TreeMap<>();

        treeMap.put("3", new Person("Alice", 30));
        treeMap.put("1", new Person("Bob", 25));
        treeMap.put("2", new Person("Charlie", 35));

        System.out.println("Keys in TreeMap:");
        for (String key : treeMap.keySet()) {
            System.out.println(key);
        }

        System.out.println("\nValues in TreeMap:");
        for (Person person : treeMap.values()) {
            System.out.println(person);
        }
        System.out.println("\nKeys and Values in TreeMap:");
        for (Map.Entry<String, Person> entry : treeMap.entrySet()) {
            System.out.println("Key: " + entry.getKey() + ", Value: " + entry.getValue());
        }
    }
}
