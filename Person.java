public class Person {

    private String name;
    private int id;
    private String desg;

    public Person(String name, int id, String desg) {
        this.name = name;
        this.id = id;
        this.desg = desg;
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

    public String getDesg() {
        return desg;
    }

    public void setDesg(String desg) {
        this.desg = desg;
    }

    @Override
    public String toString() {
        return "Person [name=" + name + ", id=" + id + ", Address=" + desg + "]";
    }
    

}
