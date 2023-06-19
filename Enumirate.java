package javaTrainingPart2;
enum Level {
	  LOW,
	  MEDIUM,
	  HIGH
	}
public class Enumirate {
	 public static void main(String[] args) {
		    Level myVar = Level.LOW;

		    switch(myVar) {
		      case LOW:
		        System.out.println("Low level");
		        break;
		      case MEDIUM:
		         System.out.println("Medium level");
		        break;
		      case HIGH:
		        System.out.println("High level");
		        break;
		    }
		    System.out.println(myVar.ordinal());
		    System.out.println(Level.valueOf("LOW").ordinal());
		    for(Level X:Level.values())
		    {
		    	System.out.println(X);
		    }
	 
	 }
}
