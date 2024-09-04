public class Person implements Comparable<Person>{
    private int eid;
    private String name;
    private double salary;
    public int getEid() {
        return eid;
    }
    public void setEid(int eid) {
        this.eid = eid;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public double getSalary() {
        return salary;
    }
    public void setSalary(double salary) {
        this.salary = salary;
    }
    public Person(int eid, String name, double salary) {
        this.eid = eid;
        this.name = name;
        this.salary = salary;
    }
    public Person() {
    }
    @Override
    public String toString() {
        return "Person [eid=" + eid + ", name=" + name + ", salary=" + salary + "]";
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + eid;
        result = prime * result + ((name == null) ? 0 : name.hashCode());
        long temp;
        temp = Double.doubleToLongBits(salary);
        result = prime * result + (int) (temp ^ (temp >>> 32));
        return result;
    }
    @Override
    public boolean equals(Object obj) {
        if (this == obj)
            return true;
        if (obj == null)
            return false;
        if (getClass() != obj.getClass())
            return false;
        Person other = (Person) obj;
        if (eid != other.eid)
            return false;
        if (name == null) {
            if (other.name != null)
                return false;
        } else if (!name.equals(other.name))
            return false;
        if (Double.doubleToLongBits(salary) != Double.doubleToLongBits(other.salary))
            return false;
        return true;
    }
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.eid,o.eid);
    }
    
// Write Your Code Here
}
