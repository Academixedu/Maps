/**
 * Person
 */
import java.util.Comparator;
public class Person implements Comparable<Person> {

    private int sid;
    private String sname;
    private String desg;
    public int getSid() {
        return sid;
    }
    public void setSid(int sid) {
        this.sid = sid;
    }
    public Person(int sid, String sname, String desg) {
        this.sid = sid;
        this.sname = sname;
        this.desg = desg;
    }
    @Override
    public String toString() {
        return "Person [sid=" + sid + ", sname=" + sname + ", desg=" + desg + "]";
    }
    public Person(){
        
    }
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + sid;
        result = prime * result + ((sname == null) ? 0 : sname.hashCode());
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
        if (sid != other.sid)
            return false;
        if (sname == null) {
            if (other.sname != null)
                return false;
        } else if (!sname.equals(other.sname))
            return false;
        if (desg == null) {
            if (other.desg != null)
                return false;
        } else if (!desg.equals(other.desg))
            return false;
        return true;
    }
    public String getSname() {
        return sname;
    }
    public void setSname(String sname) {
        this.sname = sname;
    }
    public String getDesg() {
        return desg;
    }
    public void setDesg(String desg) {
        this.desg = desg;
    }
    
       
   
    @Override
    public int compareTo(Person o) {
        return Integer.compare(this.sid, o.getSid());
    }
}