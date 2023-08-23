package stringManipulations;

public class countCharInString {
	
	public static void main(String[] args) {
		String input = "Prashant";
	
		int length = input.length();
		
		int times =0;
		
		char count ='a';
		
		for(int i =0;i<length;i++) {
			
			if(input.charAt(i)==count) {
				times++;
			}
			
		}
		
		System.out.println("Occurance of " +count + " : " + times);
		
		
		
	}

}
