public class Person implements Comparable<Person>{
    // prepare a Person class here and  implmenet Getters and Setters,constructor,tostring,Comparable
    private int id;
    private String desg;
    public int getId() {
        return id;
    }
    public void setId(int id) {
        this.id = id;
    }
    public String get() {
        return desg;
    }
    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
   
    public Person(int id, String desg) {
        this.id = id;
        this.desg = desg;
    }
    @Override
    public String toString() {
        return "Person [id=" + id + ", name=" + desg + "]";
    }
    @Override
    public int compareTo(Person o) {
        // TODO Auto-generated method stub
        return Integer.compare(this.id, o.id);
    }
    
    
    
    }
    