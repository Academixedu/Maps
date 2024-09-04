import java.util.*;

public class Person implements Comparable<Person> {
private int id;
private String name;
private float marks;
private String designation;
    
        
    
    public Person(int id, String name, float marks, String designation) {
        this.id = id;
        this.name = name;
        this.marks = marks;
        this.designation = designation;
    }
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
        return "Person [id=" + id + ", name=" + name + ", marks=" + marks + ", designation=" + designation + "]";
    }
    @Override
    public int compareTo(Person o) {
      return Integer.compare(this.id, o.id);
    }

    }
class basedondesg implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDesignation().compareTo(o2.getDesignation());
    }

}

    




