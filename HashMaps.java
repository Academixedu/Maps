
import java.util.*;
import java.util.HashMap;


public class HashMaps{
// Preapare a Code that It Should add Person Class Objects
  // Itearate HashMaps using For-Each
  public static void main(String[] args) {
    HashMap<Integer,String>h1=new HashMap<Integer,String>();
    h1.put(1,"Rahul");
    h1.put(2,"vijay");
    h1.put(3,"Mahesh");
    h1.put(4,"Rohan");
    for(Map.Entry<Integer,String>i:h1.entrySet()){
      System.out.println(i.getKey()+" "+i.getValue());
    }
    Iterator<Map.Entry<Integer,String>>e=h1.entrySet().iterator();
    while(e.hasNext()){
      System.out.println(e.next());
    }
    
    HashMap<Person,Integer>h2=new HashMap<>();
    h2.put(new Person("ravi",10,"Dev", 1000),1);
    h2.put(new Person("Rahul",20,"Dev", 2000),2);
    h2.put(new Person("vijay",30,"Dev", 3000),3);
    h2.put(new Person("Mahesh",40,"Dev", 4000),4);
    for(Map.Entry<Person,Integer>i:h2.entrySet()){
      System.out.println(i);

    }
  }
}
