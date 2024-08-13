public class Person{
    // prepare a Person Data With Getters and Setters,Constructor,ToString and Override HashCode & Equals Methods in it
    private int p_id;
    private String p_name;
    private int p_age;
       public Person(int p_id,String p_name,int p_age){
            this.p_id=p_id;
            this.p_name=p_name;
            this.p_age=p_age;
    
        }
    public int getP_id() {
        return p_id;
    }
    @Override
        public int hashCode() {
            final int prime = 31;
            int result = 1;
            result = prime * result + p_id;
            result = prime * result + ((p_name == null) ? 0 : p_name.hashCode());
            result=prime* result+p_age;
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
            if (p_id != other.p_id)
                return false;
            if (p_name == null) {
                if (other.p_name != null)
                    return false;
            } else if (!p_name.equals(other.p_name))
                return false;
            if (p_age != other.p_age)
                return false;
         return true; }
            
    public void setP_id(int p_id) {
        this.p_id = p_id;
    }
    public String getP_name() {
        return p_name;
    }
    public void setP_name(String p_name) {
        this.p_name = p_name;
    }
    public int getP_age() {
        return p_age;
    }
    public void setP_age(int p_age) {
        this.p_age = p_age;
    }
    @Override
    public String toString() {
        // TODO Auto-generated method stub
    return "pid = " + p_id + ", pname = " + p_name + " p_age = " +p_age;
    
    }
    }
    