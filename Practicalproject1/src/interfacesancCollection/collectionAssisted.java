package interfacesancCollection;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.Vector;

public class collectionAssisted {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("ArrayList");
		ArrayList<String>city=new ArrayList<String>();
		city.add("Pune");
		city.add("Bidar");
		System.out.println(city);
		
		System.out.println("\n");
		System.out.println("Vector");
		Vector<Integer>vec=new Vector();
		vec.addElement(10);
		vec.addElement(20);
		System.out.println(vec);
		
		System.out.println("\n");
		System.out.println("LinkedList");
		LinkedList<String>names=new LinkedList<String>();
		names.add("Nisha");
		names.add("Sakshi");
		Iterator<String>itr=names.iterator();
		while(itr.hasNext()) {
		System.out.println(itr.next());
		
		System.out.println("\n");
		System.out.println("HashSet");
		HashSet<Integer>set=new HashSet<Integer>();
		set.add(100);
		set.add(200);
		set.add(300);
		set.add(400);
		System.out.println(set);
		
		System.out.println("\n");
		System.out.println("LinkedHashSet");
		LinkedHashSet<Integer>set2=new LinkedHashSet<Integer>();
		set2.add(10);
		set2.add(20);
		set2.add(30);
		set2.add(40);
		System.out.println(set2);
			
			
			
			
		}
				
	}

}
