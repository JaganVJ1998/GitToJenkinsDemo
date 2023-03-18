package practiceNow;

import java.util.Iterator;
import java.util.TreeSet;

public class TreeSetDemo {
	
	public static void main(String[] args) {
		
		TreeSet t = new TreeSet();
		
		t.add(27);
		t.add(45);
		t.add(12);
		t.add(78);
		t.add(9);
		t.add(12);
		t.add(23);
		t.add(12);
		t.add(3);
		t.add(12);
		t.add(29);
		t.add(12);
		
		
		System.out.println(t);
		
		Object arr[] = t.toArray();
		
		for(int i = arr.length- 1; i>=0; i--)
		{
			System.out.println(arr[i]);
		}
		
	}

}
