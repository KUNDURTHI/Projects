package fortuneminds;

import java.util.HashMap;
import java.util.Map;

public class Duplicates implements FortuneStrings {

	 public String getDupli(String s1) throws FortuneException {
		char[] ch = s1.toCharArray();

		Map<Character, Integer> map = new HashMap<>();

		for (char c : ch) {
			if (map.containsKey(c)) {
				int i = map.get(c);
				map.put(c, ++i);
			} else {
				map.put(c, 1);
			}
		}
		// Duplicate Characters in a String
		for (char c : map.keySet()) {
			
			
			if (map.get(c) > 1 && !Character.isWhitespace(c)) {
			//char[] c1 = new char[c];
				
				System.out.println("Duplicate characters::" + c);
			}else if(Character.isUpperCase(c)) {
				System.out.println("Duplicate characters Case::" + c);
			}
			

		}
		//Distinct Characters of a String
		for(char c: map.keySet()) {
			if(map.get(c) == 1) {
				System.out.println("Remaining Chars of the String::" + c);
			}
		}
		return s1;

	}

}
