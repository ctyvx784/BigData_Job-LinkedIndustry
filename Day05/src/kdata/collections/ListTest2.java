package kdata.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
public class ListTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> list = new ArrayList<>();
		
		Vehicle v = new Vehicle(3,"red");
		
		list.add(v);
		list.add(new Vehicle(1,"blue"));
			
		for(int i=0; i<list.size(); i++) {
			Vehicle v3 = list.get(i);
			System.out.println(v3.getNum());
			System.out.println(v3.getColor());
		}
		
		System.out.println();
		
		for(Vehicle v2 : list)
		{
			System.out.println(v2.getNum());
			System.out.println(v2.getColor());	
		}
		
		System.out.println();
		
		Iterator<Vehicle> i = list.iterator();
		while(i.hasNext())
		{
			Vehicle v4 = i.next();
			System.out.println(v4);
		}
		
	}

}
