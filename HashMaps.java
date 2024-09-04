import java.util.HashMap;
import java.util.Map;
public class HashMaps {
    // Prepare a Code that It Should add Person Class Objects
    // Iterate HashMap using For-Each
    public static void main(String[] args) {
        HashMap<Person, String> tt = new HashMap<>();
        tt.put(new Person(48,"vijay",23,50000), "fullstak");
        tt.put(new Person(01,"kushal",26,40000), "tesingg");
        tt.put(new Person(46,"virender",27,50000), "backend");
        tt.put(new Person(45,"ravinder",29,50000), "frontend");
 
        for (Map.Entry<Person, String> mm : tt.entrySet()) {
            System.out.println("Key: " + mm.getKey() + ", Value: " + mm.getValue());
        }
    }
}
