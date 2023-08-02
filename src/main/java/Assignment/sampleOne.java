package Assignment;

public class sampleOne {
	
	public static void countvowel() {
		String name ="Prashant";
		for(int i =0; i<name.length();i++ ){
		
		if (name.charAt(i)=='a' || name.charAt(i)=='e'|| name.charAt(i)=='i' || name.charAt(i)=='o' || name.charAt(i)=='u'){
			System.out.println("character "+ i + "is vowels in String");
		}
		else
		{	
			System.out.println("character "+ i + " is not vowels in String");
		}
	}
	}
	public static void main(String[] args) {
		
		sampleOne.countvowel();
}
}
