package stringManipulations;

public class memoryAllocationInString {

	public static void main(String[] args) {
		String s1 = "Prashant";
		String s2="Prashant";

		String str = new String("Prashant");

		System.out.println(s1.equals(str));

		System.out.println(s1.equals(s2));
		
		System.out.println(s1==s2);
		
		System.out.println(s1==str);
	}
}
