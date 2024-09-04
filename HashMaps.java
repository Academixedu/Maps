import java.util.HashMap;
import java.util.Map;

public class HashMaps{
    // Preapare a Code that It Should add Person Class Objects
    // Itearate HashMaps using For-Each
    public static void main(String[] args) {
        HashMap<Integer,String> myHashMap = new HashMap<>();
        myHashMap.put(1,"One");
        myHashMap.put(3,"Three");
        myHashMap.put(2,"Two");
        myHashMap.put(5,"Five");
        myHashMap.put(4,"Four");
        for(Map.Entry<Integer, String> i : myHashMap.entrySet()){
            System.out.println("key :" + i.getKey() + " Value :" + i.getValue());
        }
    }
}
