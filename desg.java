import java.util.Comparator;

public class desg implements Comparator<Person> {

    @Override
    public int compare(Person o1, Person o2) {
      return o1.getDesg().compareTo(o2.getDesg());
    }

  
    
}
