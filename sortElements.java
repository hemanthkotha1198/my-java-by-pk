package javaTrainingPart2;
import java.util.*;
public class sortElements {
	  public static void main(String[] args) {  
LinkedList l=new LinkedList();
l.add(10);
l.add(12);
l.add(10);
l.add(15);
l.add(1);
l.add(2);
l.add(3);
l.add(4);
l.add(15);
l.add(6);
l.add(12);
System.out.println(l);
Set s= new TreeSet(l);
System.out.println(s);
}
}