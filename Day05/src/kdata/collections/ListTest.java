package kdata.collections;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.NoSuchElementException;
public class ListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> list = new ArrayList<>();
		
		list.add("È«±æµ¿");
		list.add("ÀÌÁ¾·ü");
		list.add("ÀÌ¼ø½Å");
		
		
		//for(int i=0; i<list.size(); i++)
			//System.out.println(list.get(i));
		
		//for(String s : list)
			//System.out.println(s);
		
		Iterator<String> it = list.iterator();

		boolean check = true;
		while(check)
		{
			check = it.hasNext();
			System.out.println(it.next());
			
		}

	}

}
