package kdata.collections;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class SetTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Set<String> set = new HashSet<>();	
		set.add("hello");
		set.add("hello");
		set.add("hello123");
		set.add("ge");
	
		for(String t : set)
			System.out.println(t);

		System.out.println();
		
		Iterator it = set.iterator();
		
		while(it.hasNext())
				System.out.println(it.next());
	
		
	}

}
