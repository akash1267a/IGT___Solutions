import java.util.*;
public class Demo3 {

	public static void main(String[] args) {
		//List : will alllow the duplicates
		//ArrayList al = new ArrayList<>();
		//LinkedLIst al = new LinkedList();
		//Vector al = new Vector<>(); legacy class : old class : 1995, Limited methods
		//Stack al = new Stack<>(); // duplicagtees
		//LinkedHashset al = new LinkedHashSet<>(); no duplicates + user entered order
		TreeSet al = new TreeSet();// no dup + sorted order
		
		al.add(100);
		al.add(100);
		al.add(200);
		al.add(200);
		al.add(700);
		al.add(450);
		al.add(987);
		al.add(600);
//		al.add("ABC"); 1
//		al.add("XYZ");4
//		al.add("LMN");3
//		al.add("DEF");2
		
		Iterator i = al.iterator();
		while(i.hasNext()) {
			System.out.println(i.next());
		}
	}

}

//List                         set
//=================================================
// duplicate				not allow
// will maintain order
//							hashset: no order
//							LinkedhasSet : no uplicate + mainatin order
//							TreeSet : no dup + sorted order
