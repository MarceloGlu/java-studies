package b;

import java.util.HashMap;
import java.util.Map;


public class collections3 {

	public static void main(String[] args) {

		Map<Integer, String> map = new HashMap<>();
		map.put(1,  "sun");
		map.put(3,  "tue");
		map.put(6,  "Fri");
		
		System.out.println(map);
		System.out.println(map.get(6));
	

				
	}
}