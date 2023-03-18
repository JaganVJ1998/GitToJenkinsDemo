package practiceNow;

import java.util.Iterator;
import java.util.LinkedHashSet;

public class LinkedHashSetDemo {
	
	public static void main(String[] args) {
		
		LinkedHashSet l = new LinkedHashSet();
		
		l.add(27);
		l.add("Oranium");
		l.add("Tech");
		l.add(21.34);
		l.add(false);
		l.add(27);
		l.add(null);
		l.add('%');
		
		System.out.println(l);
		
		System.out.println("Iteration using Enhanced for Loop");
		
		for(Object k :l)
		{
			System.out.println(k);
		}
		
		System.out.println("Iteration using lambda Expression");
		
		l.forEach(k->System.out.println(k));
		
		System.out.println("Iteration using Iterator");
		
		Iterator i = l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
	}
	
	

}
