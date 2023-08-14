package interviewPrograms;

import java.util.Scanner;

public class StringReversal {
    public static void main(String[] args) {
    	Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter a string: ");
        String input = scanner.nextLine();
        String reversed = reverseString(input);
        System.out.println("Original: " + input);
        System.out.println("Reversed: " + reversed);
    }

    public static String reverseString(String input) {
        int length = input.length();
        char[] charArray = new char[length];

        for (int i = 0; i < length; i++) {
            charArray[i] = input.charAt(length - 1 - i);
        }

        // Convert the character array back to a string
        return new String(charArray);
    }
   /* public static String reverseString(String input) {
        char[] charArray = input.toCharArray();
        int left = 0;
        int right = input.length() - 1;

        while (left < right) {
            // Swap characters at left and right pointers
            char temp = charArray[left];
            charArray[left] = charArray[right];
            charArray[right] = temp;

            // Move pointers towards the center of the string
            left++;
            right--;
        }

        // Convert the character array back to a string
        return new String(charArray);
    }*/
}