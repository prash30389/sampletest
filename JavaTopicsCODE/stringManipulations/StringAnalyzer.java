package stringManipulations;

import java.util.ArrayList;
import java.util.List;

public class StringAnalyzer {
    public static void main(String[] args) {
        String inputString = "Hello123!@#456World";
        List<Character> numbers = new ArrayList<>();
        List<Character> specialChars = new ArrayList<>();

        for (char c : inputString.toCharArray()) {
            if (Character.isDigit(c)) {
                numbers.add(c);
            } else if (!Character.isLetterOrDigit(c)) {
                specialChars.add(c);
            }
        }

        System.out.println("Numbers: " + numbers);
        System.out.println("Special characters: " + specialChars);
        System.out.println("Number count: " + numbers.size());
        System.out.println("Special character count: " + specialChars.size());
    }
}

