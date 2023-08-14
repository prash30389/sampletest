package interviewPrograms;
import java.util.Scanner;
import java.util.HashMap;
import java.util.Map;

public class CharInStringOccurance {
	

	     public static void main(String []args){
	    	         Scanner scanner = new Scanner(System.in);
	    	         
	    	         System.out.print("Enter a string: ");
	    	         String inputString = scanner.nextLine();
	    	         
	    	         Map<Character, Integer> charCountMap = countOccurrences(inputString);
	    	         
	    	         System.out.println("Character Count:");
	    	        
	    	         for (Map.Entry<Character, Integer> entry : charCountMap.entrySet()) {
	    	             System.out.println(entry.getKey() + ": " + entry.getValue());
	    	         }
	    	         
	    	         scanner.close();
	    	     }
	    	     
	    	     private static Map<Character, Integer> countOccurrences(String str) {
	    	         Map<Character, Integer> charCountMap = new HashMap<>();
	    	         
	    	         for (char c : str.toCharArray()) {
	    	             charCountMap.put(c, charCountMap.getOrDefault(c, 0) + 1);
	    	         }
	    	         
	    	         return charCountMap;
	    	     }
	    	 }

