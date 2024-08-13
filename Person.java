public class Person{
// Write Your Code Here

          private String Ename;
          private int Eid;
          private String Edesg;
          
          
        public Person(String ename, int eid, String edesg, ) {
            Ename = ename;
            Eid = eid;
            Edesg = edesg;
           
        }
        public String getEname() {
            return Ename;
        }
        public void setEname(String ename) {
            Ename = ename;
        }
        public int getEid() {
            return Eid;
        }
        public void setEid(int eid) {
            Eid = eid;
        }
        public String getEdesg() {
            return Edesg;
        }
        public void setEdesg(String edesg) {
            Edesg = edesg;
        }
        
        @Override
        public String toString() {
            return "Person [Ename=" + Ename + ", Eid=" + Eid + ", Edesg=" + Edesg  + "]";
        }
}

