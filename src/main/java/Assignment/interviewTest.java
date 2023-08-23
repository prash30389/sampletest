package Assignment;

import java.util.HashMap;
import java.util.Map;

public class interviewTest {
	
	public static void main(String[] args) {
		
	
	String input = "Prashant sharma";

	Map<Character,Integer> countchar = new HashMap<>();
	
	for(char c : input.toCharArray()) {
		
		if(Character.isLetterOrDigit(c)) {
			
			countchar.put(c,countchar.getOrDefault(c, 0)+1);	
		}
	}
		
		for(Map.Entry<Character,Integer> entry:countchar.entrySet()) {
			
			System.out.println("character :" +entry.getKey() + ", count :" + entry.getValue());
			
		}
		
	}
}
