package javaTrainingPart2;
import java.util.*;  
public class TreeSet1 {
	 public static void main(String args[]){  
	  //Creating and adding elements  
	  TreeSet<String> al=new TreeSet<String>();  
	  al.add("Ravi");  
	  al.add("Vijay");  
	  al.add("Ravi");  
	  al.add("Ajay");  
	  //Traversing elements  
	  Iterator<String> itr=al.iterator();  
	  while(itr.hasNext()){  
	   System.out.println(itr.next());  
	  } 
	  TreeSet cloned_set = new TreeSet();
	  cloned_set = (TreeSet)al.clone();
	  
      // Displaying the cloned_set
      System.out.println("The cloned TreeSet: " + cloned_set);
	  al.clear();
	  
      // Displaying the final tree
      System.out.println("After clearing TreeSet: " + al);
  
	 }  
	}  
	
	

