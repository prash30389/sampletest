package StringOperation;

public class outputtwo {

	

	public static void method(Object o) {
		System.out.println("Object method");
	}

	public static void method(Integer i) {
		System.out.println("Integer method");
	}

	public static void method(String s) {
		System.out.println("String method");

	}
	// ans : both method method(Integer) in Code and method method(String) in Code
	// match
	
	
	public static void main(String[] args) {
		/*
		 * method(null); } public static void method(Object o) {
		 * System.out.println("Object method"); } public static void method(String s) {
		 * System.out.println("String method");
		 */

		// method(null);
		StringBuffer str1 = new StringBuffer("open");
		StringBuffer str2 = str1;
		str1.append("genus");
		System.out.println(str1 + " " + str2 + " " + (str1 == str2));
		
		/* int y = 08;
	        y = y + 2;
	        System.out.println(y);
	        Any number starting with 0 is considered an octal number which has digits from 0 to 7. So, 08 is invalid and hence, the code will fail to compile.
	        */
			
		}
		
	}

