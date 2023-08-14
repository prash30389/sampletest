package stringManipulations;

import java.util.*;

public class removeSpecialCharsAndNumbersfromstring {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		
		
				try (Scanner s = new Scanner(System.in)) {
					System.out.println("please enter the input String : ");
					String input = s.nextLine();
					String withoutSpecialCharsAndNumbers = removeSpecialCharsAndNumbers(input);
					System.out.println("Original: " + input);
					System.out.println("Without Special Chars and Numbers: " + withoutSpecialCharsAndNumbers);
				}
		    }

		    public static String removeSpecialCharsAndNumbers(String input) {
		        StringBuilder resultone = new StringBuilder();

		        for (char ch : input.toCharArray()) {
		            if (Character.isLetter(ch)) {
		                resultone.append(ch);
		            }
		        }
		        
		        Map<Character, Integer> charIndexMap = new HashMap<>();
		        int currentIndex = 0;
		        
		        for (int i = 0; i < input.length(); i++) {
		            char ch = input.charAt(i);
		            if (isLetter(ch)) {
		                if (!charIndexMap.containsKey(ch)) {
		                    charIndexMap.put(ch, currentIndex++);
		                }
		            }
		        }
		        
		        char[] resultArray = new char[charIndexMap.size()];
		        
		        for (Map.Entry<Character, Integer> entry : charIndexMap.entrySet()) {
		            resultArray[entry.getValue()] = entry.getKey();
		        }

		        return new String(resultArray);
		      
		        //return resultone.toString();
		    }
		    public static boolean isLetter(char ch) {
		        return (ch >= 'a' && ch <= 'z') || (ch >= 'A' && ch <= 'Z');
		    }
}
