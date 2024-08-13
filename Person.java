public class Person 
{
// Write Your Code Here
private String Pname;
private int pid;
private int psal;
private String Pdeg;

//CONSTRUCTOR
public Person(String pname, int pid, int psal, String pdeg) {
    Pname = pname;
    this.pid = pid;
    this.psal = psal;
    Pdeg = pdeg;
}
//GETER AND SETTERS

public String getPname() {
    return Pname;
}

public void setPname(String pname) {
    Pname = pname;
}

public int getPid() {
    return pid;
}

public void setPid(int pid) {
    this.pid = pid;
}

public int getPsal() {
    return psal;
}

public void setPsal(int psal) {
    this.psal = psal;
}

public String getPdeg() {
    return Pdeg;
}

public void setPdeg(String pdeg) {
    Pdeg = pdeg;
}

//TO STRING
@Override
public String toString() {
    return "Person [Pname=" + Pname + ", pid=" + pid + ", psal=" + psal + ", Pdeg=" + Pdeg + "]";
}

//HashCode and Equals
@Override
public int hashCode() {
    final int prime = 31;
    int result = 1;
    result = prime * result + ((Pname == null) ? 0 : Pname.hashCode());
    result = prime * result + pid;
    result = prime * result + psal;
    result = prime * result + ((Pdeg == null) ? 0 : Pdeg.hashCode());
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
    if (Pname == null) {
        if (other.Pname != null)
            return false;
    } else if (!Pname.equals(other.Pname))
        return false;
    if (pid != other.pid)
        return false;
    if (psal != other.psal)
        return false;
    if (Pdeg == null) {
        if (other.Pdeg != null)
            return false;
    } else if (!Pdeg.equals(other.Pdeg))
        return false;
    return true;
}






 



}