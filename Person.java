import java.util.Comparator;
public class Person implements Comparable <Person>{
// Write Your Code Here
private int id;
private String name;
private int Age;
private double salary;
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getAge() {
    return Age;
}
public void setAge(int age) {
    Age = age;
}
public double getSalary() {
    return salary;
}
public void setSalary(double salary) {
    this.salary = salary;
}
public Person(int id, String name, int age, double salary) {
    this.id = id;
    this.name = name;
    Age = age;
    this.salary = salary;
}
public Person() {
}
@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", Age=" + Age + ", salary=" + salary + "]";
}
@Override
public int compareTo(Person o) {
    return Integer.compare(o.id, this.id);
}
}
