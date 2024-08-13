import java.util.Comparator;

public class Person00{
// Write Your Code Here
private String name;
private int id;
private int sal;
private String desg;
public Person00(String name, int id, int sal, String desg) {
    this.name = name;
    this.id = id;
    this.sal = sal;
    this.desg = desg;
}
@Override
public String toString() {
    return "Person [name=" + name + ", id=" + id + ", sal=" + sal + ", desg=" + desg + "]";
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public int getId() {
    return id;
}
public void setId(int id) {
    this.id = id;
}
public int getSal() {
    return sal;
}
public void setSal(int sal) {
    this.sal = sal;
}
public String getDesg() {
    return desg;
}
public void setDesg(String desg) {
    this.desg = desg;
}  
static class DesignationComparator implements Comparator<Person00> {
    @Override
    public int compare(Person00 p1, Person00 p2) {
        return p1.getDesg().compareTo(p2.getDesg());
    }
}

        }




