package javaTrainingPart2;

enum Leval
{
    LOW,MID,HIGH;
}
public class Enum2copy {

	
	
	
	
	

	public static void main(String[] args)
	{
	    Leval l=Leval.MID;
	    System.out.println(l);
	    System.out.println(l.ordinal());
	    System.out.println(Leval.valueOf("HIGH").ordinal());
	}   
	    
	
	
	
	
	
	
	
}
