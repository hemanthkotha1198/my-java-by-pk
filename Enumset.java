package javaTrainingPart2;
import java.util.*;
import java.util.concurrent.*; 
enum days {  
	  SUNDAY, MONDAY, TUESDAY, WEDNESDAY, THURSDAY, FRIDAY, LAST 
	}  
public class Enumset {
	  public static void main(String[] args) {  
	    Set<days> set1 = EnumSet.of(days.TUESDAY, days.WEDNESDAY);  
	    // Traversing elements  
	    Iterator<days> iter1 = set1.iterator();  
	    while (iter1.hasNext())  
	      System.out.println(iter1.next());  
	    Set<days> set2 = EnumSet.allOf(days.class);  
	    // Traversing elements  
	    Iterator<days> iter2 = set2.iterator();  
	    while (iter2.hasNext())  
	      System.out.println(iter2.next());  
	    System.out.println("END ONE");
	    Set<days> set3 = EnumSet.noneOf(days.class);  
	    // Traversing elements  
	    Iterator<days> iter3 = set3.iterator();  
	    while (iter3.hasNext())  
	      System.out.println(iter3.next());  
	    System.out.println("END TWO");
	    ConcurrentSkipListSet<String> set= new ConcurrentSkipListSet<>();

    // Adding elements to this set
    set.add("Apple");
    set.add("Lemon");
    set.add("Banana");
    set.add("Apple");

    // creating an iterator
    Iterator<String> itr = set.iterator();

    System.out.print("Fruits Set: ");
    while (itr.hasNext()) {
        System.out.print(itr.next() + " ");
    }
	  }
}
