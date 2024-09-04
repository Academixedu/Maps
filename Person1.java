public class Person1 implements Comparable<Person1>{
    private int pid;
    private String name;
    private double sal;
    private String desg;

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
    public Person1(int pid, String name, double sal, String desg) {
        this.pid = pid;
        this.name = name;
        this.sal = sal;
        this.desg = desg;
    }
    @Override
    public String toString() {
        return "Person1 [pid=" + pid + ", name=" + name + ", sal=" + sal + ", desg=" + desg + "]";
    }
    @Override
    public int compareTo(Person1 o) {
        return this.name.compareTo(o.getDesg());
    }
    
}
