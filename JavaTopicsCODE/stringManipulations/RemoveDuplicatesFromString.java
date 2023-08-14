package stringManipulations;

import java.util.HashSet;

public class RemoveDuplicatesFromString {
    public static void main(String[] args) {
        String input = "Hello, World!";
        String withoutDuplicates = removeDuplicates(input);
        System.out.println("Original: " + input);
        System.out.println("Without Duplicates: " + withoutDuplicates);
    }

    public static String removeDuplicates(String input) {
        StringBuilder result = new StringBuilder();
        HashSet<Character> uniqueSet = new HashSet<>();

        for (char ch : input.toCharArray()) {
            if (Character.isLetter(ch) && uniqueSet.add(ch)) {
                result.append(ch);
            }
        }

        return result.toString();
    }
}

