package stringManipulations;

import java.util.ArrayList;

public class seggregateArray {
	    public static void main(String[] args) {
	        int[] inputArray = {0, 1, 0, 1, 1, 0, 1, 0};
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
	        ArrayList<Integer> segregatedList = new ArrayList<>();
	        for (int num : arr) {
	            if (num == 0) {
	                segregatedList.add(0);
	            }
	        }
	        for (int num : arr) {
	            if (num == 1) {
	                segregatedList.add(1);
	            }
	        }
	        return segregatedList;
	    }
	}
