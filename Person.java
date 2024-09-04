public class Person implements Comparable<Person>{
private int number;
private String name;
private double height;
private String desg;
public int getNumber() {
    return number;
}

@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + number;
    result = prime * result + ((name == null) ? 0 : name.hashCode());
    long temp;
    temp = Double.doubleToLongBits(height);
    result = prime * result + (int) (temp ^ (temp >>> 32));
    result = prime * result + ((desg == null) ? 0 : desg.hashCode());
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
    if (number != other.number)
        return false;
    if (name == null) {
        if (other.name != null)
            return false;
    } else if (!name.equals(other.name))
        return false;
    if (Double.doubleToLongBits(height) != Double.doubleToLongBits(other.height))
        return false;
    if (desg == null) {
        if (other.desg != null)
            return false;
    } else if (!desg.equals(other.desg))
        return false;
    return true;
}

public Person(int number, String name, double height, String desg) {
    this.number = number;
    this.name = name;
    this.height = height;
    this.desg = desg;
}
public void setNumber(int number) {
    this.number = number;
}
public String getName() {
    return name;
}
public void setName(String name) {
    this.name = name;
}
public double getHeight() {
    return height;
}
public void setHeight(double height) {
    this.height = height;
}
public String getDesg() {
    return desg;
}
public void setSex(String desg) {
    this.desg = desg;
}
@Override
public String toString() {
    return "Person [number=" + number + ", name=" + name + ", height=" + height + ", desg=" + desg + "]";
}
@Override
public int compareTo(Person o) {
   return Integer.compare(this.number, o.number);
}
}
