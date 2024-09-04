import java.util.*;

class Person {
  private int n;
  private String name;

  public Person(int n, String name) {
    this.n = n;
    this.name = name;
  }

  public int getN() {
    return n;
  }

  public void setN(int n) {
    this.n = n;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }

  @Override
  public String toString() {
    return "Person [n=" + n + ", name=" + name + "]";
  }

  @Override
  public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + n;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    return result;
  }

  @Override
  public boolean equals(Object obj) {
    if (this == obj)
      return true;
    if (obj == null)
      return false;
    if (getClass() != obj.getClass())
      return false;
    Person other = (Person) obj;
    if (n != other.n)
      return false;
    if (name == null) {
      if (other.name != null)
        return false;
    } else if (!name.equals(other.name))
      return false;
    return true;
  }

}

public class HashMaps {
  // Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    HashMap<Person, String> person = new HashMap<Person, String>();
    person.put(new Person(10, "John"), "John");
    person.put(new Person(10, "John"), "hello");
    person.put(new Person(23, "oops"), "kkp");
    for (Map.Entry<Person, String> entry : person.entrySet()) {
      System.out.println(entry.getKey() + "values are :" + entry.getValue());
    }

  }

}
