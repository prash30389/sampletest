package stringManipulations;

import java.util.HashMap;
import java.util.Map;

public class CountDuplicatesInArray {
    public static void main(String[] args) {
        int[] array = {1, 2, 3, 2, 4, 5, 3, 6};
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        
        for (int num : array) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }
        
        for (Map.Entry<Integer, Integer> entry : frequencyMap.entrySet()) {
            if (entry.getValue() > 1) {
                System.out.println("Element: " + entry.getKey() + ", Count: " + entry.getValue());
            }
        }
    }
}

