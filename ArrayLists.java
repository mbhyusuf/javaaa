import java.util.ArrayList;
import java.util.Collections;
public class ArrayLists {

	public static void main(String[] args) {
		
		ArrayList<String> li = new ArrayList<String>();
		li.add("Duh");
		li.add("ah");
		li.add("Boohoo");
		System.out.println(li);
		Collections.sort(li);
		System.out.println(li);
		li.set(1, "Yo");
		System.out.println(li);
		li.clear();
		System.out.println(li);
		
		ArrayList<Integer> nli = new ArrayList<Integer>();
		for (int i=2;i<15;i=i+2) {
			nli.add(i);
		}
		System.out.println(nli);
		Collections.shuffle(nli);
		System.out.println(nli);
		System.out.println(nli.get(3));

	}

}
