package kdata.collections;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class MapTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Vehicle,String> map = new HashMap<>();
		
		
		map.put(new Vehicle(1,"red"), "bmw1");
		map.put(new Vehicle(1,"red"), "bmw2");
		map.put(new Vehicle(2,"black"), "bmw2");
		
		for(Vehicle s : map.keySet())
			System.out.println(s);
		
		Iterator it = map.keySet().iterator();
		
		
		
		System.out.println(map);
		
		
	}

}

