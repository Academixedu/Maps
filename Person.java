import java.util.Comparator;

public class Person implements Comparable<Person>{
// Write Your Code Here
    private int id;
    private String name;
    private char rank;
    private String designation;
    public Person(int id, String name, char rank, String designation) {
        this.id = id;
        this.name = name;
        this.rank = rank;
        this.designation = designation;
    }
    public Person(int i, Object object, int j) {
        //TODO Auto-generated constructor stub
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
    public char getRank() {
        return rank;
    }
    public void setRank(char rank) {
        this.rank = rank;
    }
    public String getDesignation() {
        return designation;
    }
    public void setDesignation(String designation) {
        this.designation = designation;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + name + ", rank=" + rank + ", designation=" + designation + "]";
    }
    @Override
    public int compareTo(Person o) {
         return Integer.compare(this.id,o.id);
    }
}
class Basedondesg implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        return o1.getDesignation().compareTo(o2.getDesignation());
    }
    

}
