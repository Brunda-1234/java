package vivrithi;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.concurrent.ConcurrentHashMap;

public class HashMapDemo{
	
	public static void main(String[] args) {
		
		Map<Integer, Integer> map = new HashMap<Integer, Integer>();
		
	ConcurrentHashMap<Integer, Integer> map1 = new ConcurrentHashMap<Integer, Integer>();
	map1.put(1, 23);
	map1.put(2, 43);
	map1.put(3, 56);
		
	for(Map.Entry<Integer, Integer> entry : map.entrySet()) {
		
	    
		
	}
		
		map.put(1, 23);
		map.put(2, 43);
		map.put(3, 56);
		System.out.println(map);
		
		for(Map.Entry<Integer, Integer> entry:map.entrySet()) {
			System.out.println(entry.getKey());
			map.put(4, 5);
			/*
			 * if im trying to insert the new data into the hash map while iterating
			 * 
			 * we got 
			 * Exception in thread "main" java.util.ConcurrentModificationException
	at java.base/java.util.HashMap$HashIterator.nextNode(HashMap.java:1597)
	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1630)
	at java.base/java.util.HashMap$EntryIterator.next(HashMap.java:1628)
	at practice/vivrithi.HashMapDemo.main(HashMapDemo.java:16)
	
	
	so we use ConsurrentHashMap  to over come this
			 */  
			System.out.println(entry);
		}
	}

}
