package stringManipulations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class segregatetwo {
    public static void main(String[] args) {
        int[] inputArray = {0, 1, 0, 3, 1, 2, 3, 0};
        ArrayList<Integer> segregatedList = segregateAndToList(inputArray);

        System.out.println("Original Array: ");
        for (int num : inputArray) {
            System.out.print(num + " ");
        }

        System.out.println("\nSegregated ArrayList: ");
        for (int num : segregatedList) {
            System.out.print(num + " ");
        }
    }

    public static ArrayList<Integer> segregateAndToList(int[] arr) {
        Map<Integer, List<Integer>> map = new HashMap<>();

        for (int num : arr) {
            if (!map.containsKey(num)) {
                map.put(num, new ArrayList<>());
            }
            map.get(num).add(num);
        }

        ArrayList<Integer> segregatedList = new ArrayList<>();
        for (Map.Entry<Integer, List<Integer>> entry : map.entrySet()) {
            segregatedList.addAll(entry.getValue());
        }

        return segregatedList;
    }
}
