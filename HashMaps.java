import java.util.HashMap;
import java.util.Map;

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

public class HashMaps {
    public static void main(String[] args) {
        HashMap<String, Person> personMap = new HashMap<>();

        personMap.put("1", new Person("Alice", 30));
        personMap.put("2", new Person("Bob", 25));
        personMap.put("3", new Person("Charlie", 35));

        System.out.println("Iterating over HashMap entries:");
        for (Map.Entry<String, Person> entry : personMap.entrySet()) {
            String key = entry.getKey();
            Person person = entry.getValue();
            System.out.println("Key: " + key + ", Value: " + person);
        }
    }
}

