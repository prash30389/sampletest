package stringManipulations;
import java.util.*;
public class practice {
	
	public static void main(String[] args) {
		String str = "Prashant Sharma";
		
		Map<Character,Integer> mp = new HashMap<>();
		
		for(char c:str.toCharArray()) {
			
			if(c!=' ') {
				
				if(mp.containsKey(c)) {
					mp.put(c, mp.getOrDefault(c, 0)+1);		
				}
				else
				{
				mp.put(c, 1);	
				}
				
			}
			
		}
		
		for(Map.Entry<Character,Integer> entry : mp.entrySet()) {
			
			System.out.println(entry.getKey() +" : appeared"+ entry.getValue() +"times");
		}
	}

}
