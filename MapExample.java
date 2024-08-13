import java.util.HashMap;
import java.util.Map;


public class MapExample {
    public static void main(String[] args) {
        HashMap <Integer,Person> h=new HashMap<>();
        h.put(1,new Person(1,"sri",22) );
        h.put(2,new Person(2,"sanky",23) );
        h.put(3,new Person(3,"keer",21) );


        for (Map.Entry<Integer,Person> entry:h.entrySet()) 
        {
            Integer key=entry.getKey();
            Person value=entry.getValue();
            System.out.println("Key => "+key+" , "+" Value => "+value); 
}}}