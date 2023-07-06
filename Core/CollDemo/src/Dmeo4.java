import java.util.*;
public class Dmeo4 {

	public static void main(String[] args) {
		//List
		//set 
		//set + list = map
			//HashSet al  = new HashSet<>(); // no duplicate
			//LinkedHashSet al  = new LinkedHashSet<>(); // no duplicate + user entered order
			//TreeSet al  = new TreeSet();// no dup + sorted order
		//HashMap  map = new HashMap<>(); // no duplicate
		//LinkedHashMap map = new LinkedHashMap(); no dup + user netred order
		
		TreeMap map = new TreeMap<>();
		map.put(111,"Suresh");
		map.put(555,"Ramesh");
		map.put(666,"Abhi");
		map.put(234,"chandan");
		map.put(777,"Pratha");
		map.put(666,"Mavith");
		
		Set s = map.entrySet();
			
			Iterator i = s.iterator();
			while(i.hasNext()) {
				System.out.println(i.next());
				
			}

	}

}
