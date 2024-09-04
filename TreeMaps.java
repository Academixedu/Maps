import java.util.Comparator;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class TreeMaps {
  public static void main(String[] args) {
    Scanner s=new Scanner(System.in);
    Comparator<Person>c=new desg();
 System.out.println("Write the function u want to get");
String x=s.next();

   

System.out.println("PRINTING KEYS ONLY SORTING ORDER OF DESG");

  TreeMap<Person,String>t=new TreeMap<>(c);
  t.put(new Person(1,"miss",5.0,"web-developer"),"hi");
  t.put(new Person(2,"mister",5.9,"Analyst"),"hlo");
  t.put(new Person(3,"bruh",5.8,"clerk"),"hey");
  if (x.contains("keys")) {
  for (Map.Entry<Person,String>t1:t.entrySet()){
    System.out.println(t1.getKey());}
  }
  // System.out.println("PRINTING VALUES ONLY SORTING ORDER OF DESG");
  else if (x.contains("value")) {
  for (Map.Entry<Person,String>t1:t.entrySet()){
    System.out.println(t1.getValue());
  }}
  // System.out.println("PRINTING BOTH KEYS AND VALUES ");
  else if (x.contains("both")) {
  for (Map.Entry<Person,String>t1:t.entrySet()){
    System.out.println(t1);
  }}


  

// Preapare a Logic to add Person Class Objects using Tree Maps
  // Print Only Keys By sorting order of desg
  // Print Only Values By sortin order of desg
  // print both keys and values
}
}