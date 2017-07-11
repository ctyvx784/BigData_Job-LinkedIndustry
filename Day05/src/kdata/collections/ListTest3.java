package kdata.collections;

import java.util.ArrayList;
import java.util.List;

public class ListTest3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<Vehicle> list = new ArrayList<>();
		

		list.add(new Car(3,"red",3));
		list.add(new Vehicle(4,"blue"));

	
		
		for(int i=0; i<list.size(); i++)
		{
			Vehicle v = list.get(i);
			
			if(v instanceof Car)
			{
				System.out.println(v.getNum());
				System.out.println(v.getColor());
				System.out.println(((Car) v).getDoor());
			
			}
			else{
			System.out.println(v.getNum());
			System.out.println(v.getColor());
			}
		}
		
		
		
	}

}
