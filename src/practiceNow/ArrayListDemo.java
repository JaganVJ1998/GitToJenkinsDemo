package practiceNow;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;

public class ArrayListDemo {
	
	public static void main(String[] args) {
		
		ArrayList a = new ArrayList();
		
		a.add("Oranium");
		a.add(27);
		a.add(35);
		a.add('$');
		a.add(true);
		a.add(35);
		a.add(12.35);
		a.add("Tech");
		a.add(35);
		a.add(35);
		a.add(87);
		a.add(35);
		a.add(35);
		
		
		System.out.println(a);
		
		HashSet h = new HashSet();
		h.addAll(a);
		
		System.out.println(h);
		
		
		
	}
}
