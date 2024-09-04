import java.util.Comparator;

public class BasedOnDesg implements Comparator<Person>{

    @Override
    public int compare(Person o1, Person o2) {
        // TODO Auto-generated method stub
        return o1.getDesg().compareTo(o2.getDesg());
    }

   
    
}
