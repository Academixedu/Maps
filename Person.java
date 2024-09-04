public class Person {
// Write Your Code Here
    private int pid;
    private String pname;
    private char gen;
    private double sal;

    public int getPid() {
        return pid;
    }
    public void setPid(int pid) {
        this.pid = pid;
    }
    public String getPname() {
        return pname;
    }
    public void setPname(String pname) {
        this.pname = pname;
    }
    public char getGen() {
        return gen;
    }
    public void setGen(char gen) {
        this.gen = gen;
    }
    public double getSal() {
        return sal;
    }
    public void setSal(double sal) {
        this.sal = sal;
    }
    public Person(int pid, String pname, char gen, double sal) {
        this.pid = pid;
        this.pname = pname;
        this.gen = gen;
        this.sal = sal;
    }
    @Override
    public String toString() {
        return "Person [pid=" + pid + ", pname=" + pname + ", gen=" + gen + ", sal=" + sal + "]";
    }
}