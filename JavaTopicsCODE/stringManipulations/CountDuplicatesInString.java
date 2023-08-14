package stringManipulations;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesInString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        Map<Character, Integer> frequencyMap = new HashMap<>();
        
        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch)) {
                frequencyMap.put(ch, frequencyMap.getOrDefault(ch, 0) + 1);
            }
        }
        
        for (Map.Entry<Character, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Character: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}
