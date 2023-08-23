package AssignmentQspiders;

import java.util.HashSet;

public class DuplicateNoInAnArray {
	
	static int findRepeating(int arr[], int n)  
	{  
	    HashSet<Integer> s = new HashSet<Integer>(); 
	    for (int i = 0; i < n; i++)  
	    {  
	        if (s.contains(arr[i]))  
	        	return arr[i];  
	            
	        s.add(arr[i]);
	        
	    }
		return -1;// Return -1 if no duplicate is found
	  
	}  

	public static void main(String[] args) {
		
		 int arr[] = { 9, 8, 9, 9, 3, 3, 0, 3, 9, 9 };  
		    int n = arr.length; 
		    System.out.println("Duplicate: " + findRepeating(arr, n));
		} 
		

	}


