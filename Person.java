package okay;

import java.util.Comparator;

public class Person implements Comparable<Person> {
    // Write Your Code Here
    private String name;
    private int age;
    private float marks;
    private String designation;

    public Person(String name, int age, float marks, String designation) {
        this.name = name;
        this.age = age;
        this.marks = marks;
        this.designation = designation;

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

    public float getMarks() {
        return marks;
    }

    public void setMarks(float marks) {
        this.marks = marks;
    }

    public String getDesignation() {
        return designation;
    }

    public void setDesignation(String designation) {
        this.designation = designation;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", age=" + age + ", marks=" + marks + ", designation=" + designation + "]";
    }

    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.age, o.age);
    }

}

class basedondesg implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDesignation().compareTo(o2.getDesignation());
    }

}
