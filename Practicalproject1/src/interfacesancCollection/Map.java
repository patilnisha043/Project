package interfacesancCollection;

import java.util.HashMap;
import java.util.Map.Entry;
import java.util.TreeMap;

public class Map {

	public static void main(String[] args) {
		// map
		
		HashMap<Integer,String>hm=new HashMap<Integer,String>();
		hm.put(1,"Nisha");
		hm.put(2,"Sakshi");
		hm.put(3,"Mahi");
		
		System.out.println("\nThe elements of Hashmap are");
		for(Entry<Integer, String> m:hm.entrySet()) {
			System.out.println(m.getKey()+""+m.getValue());
		}
		
		HashMap<Integer,String>ht=new HashMap<Integer,String>();
		
		ht.put(4,"Chaitra");
		ht.put(5,"Sanju");
		ht.put(6,"Sony");
		ht.put(7,"Sumit");
		
		System.out.println("\nThe elements of HashTable are");
		for(Entry<Integer, String> n:ht.entrySet()) {
			System.out.println(n.getKey()+""+n.getValue());
		}
		
		TreeMap<Integer,String>map=new TreeMap<Integer,String>();
		map.put(8,"Amar");
		map.put(9,"Amit");
		map.put(10,"Aman");
		
		System.out.println("\nThe elements of TreeMap are");
		for(Entry<Integer, String> l:map.entrySet()){
			System.out.println(l.getKey()+""+l.getValue());
		}
	}

}
