package practiceNow;

import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class HashMapDemo {
	
	public static void main(String[] args) {
		
		HashMap<String, Object> h = new HashMap<>();
		
		h.put("Tamil", null);
		h.put("English", null);
		h.put("Maths", null);
		h.put("Science", "Fourty Five");
		h.put(null, null);
		
		
		System.out.println(h);
		
		System.out.println(h.containsKey("Maths"));
		
		System.out.println(h.get("Social"));
		
		h.replace("Maths", 78, 87);
		
		System.out.println(h);
		
		
		Set k = h.keySet();
		
		for( Object o: k)
		{
			System.out.println(o);
		}
		
		Collection v = h.values();
		
		for(Object o : v)
		{
			System.out.println(o);
		}
		
		Set<Entry<String,Object>> s = h.entrySet();
		
		for(Map.Entry<String,Object> o :s)
		{
			System.out.println(o.getKey()  + "  " + o.getValue());
		}
		
		System.out.println("Iteration using Lambda Expression");
		
		s.forEach(o->System.out.println(o.getKey() + "   " + o.getValue()));
		
		System.out.println("Iteration using Iterator");
		
		 Iterator<Entry<String, Object>> i = s.iterator();
		
		while(i.hasNext())
		{
			Entry<String, Object> z = i.next();
			System.out.println(z.getKey());
			System.out.println(z.getValue());
		}
		
		
		
		}
		
		

}
