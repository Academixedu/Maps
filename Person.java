public class Person implements Comparable<Person>{
// Write Your Code Here

   private int id;
   private String name;
   private String desg;
   private int sal;
   //getter and setters
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
//constructor
public Person(int id, String name, String desg, int sal) {
    this.id = id;
    this.name = name;
    this.desg = desg;
    this.sal = sal;
}
//tostring
@Override
public String toString() {
    return "Person [id=" + id + ", name=" + name + ", desg=" + desg + ", sal=" + sal + "]";
}
//hashcode 
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + id;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    result = prime * result + ((desg == null) ? 0 : desg.hashCode());
    result = prime * result + sal;
    return result;
}
//equals
@Override
public boolean equals(Object obj) {
    if (this == obj)
        return true;
    if (obj == null)
        return false;
    if (getClass() != obj.getClass())
        return false;
    Person other = (Person) obj;
    if (id != other.id)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (desg == null) {
        if (other.desg != null)
            return false;
    } else if (!desg.equals(other.desg))
        return false;
    if (sal != other.sal)
        return false;
    return true;
}
@Override
public int compareTo(Person o) {
    return this.name.compareTo(o.getName());
}





}

