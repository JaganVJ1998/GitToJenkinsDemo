package practiceNow;

import java.util.HashSet;
import java.util.Iterator;

public class HashSetDemo {
	
	public static void main(String[] args) {
		
		HashSet h = new HashSet();
		
		h.add(27);
		h.add("Oranium");
		h.add("Tech");
		h.add(21.34);
		h.add(false);
		h.add(27);
		h.add(null);
		h.add('%');
		
		System.out.println(h);
		
		h.remove(27);
		
		System.out.println(h);
		
		Object arr[] = h.toArray();
		
		System.out.println("Iterating using Normal For Loop");
		
		for(int i = 0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
		}
		
		System.out.println("Iterating using Enhanced For Loop");
		
		for(Object k : h)
		{
			System.out.println(k);
		}
		
		System.out.println("Iterating using Lambda Expression");
		
		h.forEach(k->System.out.println(k));
		
		System.out.println("Iterating using Iterator");
		
		Iterator i = h.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
		
		
		
		
		
		
	}

}
