package javaTrainingPart2;
import java.util.*;
public class LinkhashMap {

		public static void main(String args[])
		{
			LinkedHashMap<Integer, String> hm1= new LinkedHashMap<Integer, String>();
			hm1.put(3, "Geeks");
			hm1.put(2, "For");
			hm1.put(1, "Geeks");
			System.out.println(hm1);
			Set s=hm1.entrySet();
			System.out.println(s);
//			for(object o:s)
//			{
//				System.out.println(o);
//			}
			for (Map.Entry<Integer, String> mapElement :hm1.entrySet()) {
				System.out.println(mapElement.getKey()+" : "+mapElement.getValue());
			}
		}
	}

	
	
	
	
	
	
	

