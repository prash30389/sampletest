package stringManipulations;

import java.util.HashSet;
import java.util.Arrays;

public class RemoveDuplicatesFromArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6};
        int[] withoutDuplicates = removeDuplicates(array);
        System.out.println("Original Array: " + Arrays.toString(array));
        System.out.println("Array without Duplicates: " + Arrays.toString(withoutDuplicates));
    }

    public static int[] removeDuplicates(int[] arr) {
        HashSet<Integer> uniqueSet = new HashSet<>();
        int[] result = new int[arr.length];
        int index = 0;

        for (int num : arr) {
            if (uniqueSet.add(num)) {
                result[index++] = num;
            }
        }

        return Arrays.copyOf(result, index);
    }
}
