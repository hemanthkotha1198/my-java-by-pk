package javaTrainingPart2;
import java.util.*;
public class Hashmap1 {
		public static void main(String[] args)
		{
			HashMap<String, Integer> map = new HashMap<>();
			map.put("vishal", 10);
			map.put("sachin", 30);
			map.put("vaibhav", 20);
//			System.out.println("Size of map one is:- "+ map.size());
//			System.out.println(map);
//			HashMap<String, Integer> map1 = new HashMap<>();
//			map1.putAll(map);
//			System.out.println(map1);
//			System.out.println("the value of the vishal is "+map.get("vishal"));
//			System.out.println(map.remove("sachin"));
//			System.out.println(map);
//			System.out.println(map.remove("vishal",10));
//			System.out.println(map);
//			map1.replace("vaibhav",40);
//			System.out.println(map1);
//			map1.replace("vaibhav",40,99);
//			System.out.println(map1);
////			map.replaceAll((k,v) -> 100);
////			System.out.println("final updated list is --->");
////			System.out.println(map1);
//			System.out.println(map1.containsKey("vishal"));
//			System.out.println(map1.containsValue(99));
//			System.out.println(map);
//			System.out.println(map1);
//			System.out.println(map.equals(map1));
//			map1.clear();
//			System.out.println(map1);
//			
//			if (map.containsKey("vishal")) {
//			Integer a = map.get("vishal");
//			System.out.println("value for key"	+ " \"vishal\" is:- " + a);
//
			System.out.println(map);
			Set s=map.keySet();
			System.out.println(s);
			Collection s1= map.values();
			System.out.println(s1);
			Set s2=map.entrySet();
			Iterator i= s2.iterator();;
			while(i.hasNext()) {
			Object o=i.next();
			Map.Entry e=(Map.Entry)o;
			System.out.println(e.getKey());
			System.out.println(e.getValue());
			
			}}
		}
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	

