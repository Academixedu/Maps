public class Person implements Comparable<Person>{
// Write Your Code Here
private String name;
private int age;
private String desg;
private int sal;

public Person(String name, int age, String desg, int sal) {
    this.name = name;
    this.age = age;
    this.desg = desg;
    this.sal = sal;
}

public String getName() {
    return name;
}

public void setName(String name) {
    this.name = name;
}

public int getAge() {
    return age;
}

public void setAge(int age) {
    this.age = age;
}

public String getDesg() {
    return desg;
}

public void setDesg(String desg) {
    this.desg = desg;
}

public int getSal() {
    return sal;
}

public void setSal(int sal) {
    this.sal = sal;
}

@Override
public String toString() {
    return "Person [name=" + name + ", age=" + age + ", desg=" + desg + ", sal=" + sal + "]";
}

@Override
public int compareTo(Person p) {
    return 0;

}

}
