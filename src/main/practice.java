import java.lang.reflect.Array;
import java.util.HashMap;
import java.util.Map;

public class practice {

	static int[] arr ={12,14,12,34,35,23}; 
	
	public static void main(String[] args) {
		public static void main(String[] args) {
	        String str = "Hello";
	        
	       char[] characters = str.toCharArray();
	        Set<Character> seenCharacters = new HashSet<>();
	        StringBuilder result = new StringBuilder();

	        for (char ch : characters) {
	            if (!seenCharacters.contains(ch)) {
	                seenCharacters.add(ch);
	                result.append(ch);
	            }
	        }
	       String newstr = result.toString();
	       System.out.println("String after remove duplicate char" + newstr );
	    }
	}
		
		
	}
}
