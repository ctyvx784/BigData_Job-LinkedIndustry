package kdata.maps;

import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;

public class MapTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Map<Integer, String> map = new HashMap<Integer, String>();
		
		map.put(10, "A");
		map.put(20, "B");
		map.put(30, "C");
		
		
		
		for(Integer s : map.keySet())
			System.out.println(s);
		
		Iterator it = map.keySet().iterator();
		//iterator�� List �� Set���� Map xx ����Ÿ���̿��ؼ� iterator ��� ex)keySet ��ȯŸ�� Set
		while(it.hasNext())
			System.out.println(it.next());
		
	
			
		
		for(Map.Entry<Integer, String> s : map.entrySet())
		{
			System.out.println(s.getKey());
			System.out.println(s.getValue());
		}
		
	}

}
