package kdata.collections;

import java.util.HashSet;
import java.util.Set;

public class SetTest2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Set<Vehicle> set = new HashSet<>();
		
		set.add(new Vehicle(1,"red"));
		set.add(new Vehicle(2,"blue"));
		set.add(new Vehicle(1,"red"));
		
		System.out.println(set);
		
		for(Vehicle v : set){
	    System.out.println(v.getNum());
		System.out.println(v.getColor());
		}
	}

}
