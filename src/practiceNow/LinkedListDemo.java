package practiceNow;

import java.util.Iterator;
import java.util.LinkedList;

public class LinkedListDemo {
	
	public static void main(String[] args) {
		
		LinkedList l = new LinkedList();
		
		l.add(34);
		l.add("Oranium");
		l.add(34.45);
		l.add(false);
		l.add('*');
		l.add("Chrompet");
		l.add("Oranium");
		l.add(null);
		
		System.out.println(l);
		
		l.set(2, 45.34);
		
		System.out.println(l);
		
		System.out.println("Iteration using Normal For Loop");
		
		for(int i=0; i<l.size(); i++)
		{
			System.out.println(l.get(i));
		}
		
		System.out.println("Iteration using Enhaced For Loop");
		
		for(Object k : l)
		{
			System.out.println(k);
		}
		
		System.out.println("Iteration using Lambda Expression");
		
		l.forEach(k->System.out.println(k));
		
		System.out.println("Iteration using Iterator");
		
		
		Iterator i = l.iterator();
		
		while(i.hasNext())
		{
			System.out.println(i.next());
		}
		
		
	}

}
