package stringManipulations;

import java.util.HashSet;
import java.util.Set;

public class duplicateremovefromstring {
	
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
