package b;

import java.util.HashMap;
import java.util.Map;


public class dictionary {

	public static void main(String[] args) {

		Map<String, String> map = new HashMap<>();
		map.put("Java",  "A programming language");
		map.put("Pizza",  "An italian food");
		map.put("Holydays",  "A desired period in life");
		
		System.out.println(map);
		System.out.println(map.get("Pizza"));
		
		for(String key: map.keySet()) {
			System.out.println(key + ": " + map.get(key));
		}
	

				
	}
}