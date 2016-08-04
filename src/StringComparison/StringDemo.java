package StringComparison;

public class StringDemo {

	public static void main(String[] args) {
		//----Creating a String
		
		//String literal
		String str1 = "Welcome to Java!";
		String str2 = "Welcome to Java!";
		//Using new keyword
		String str3 = new String("Welcome to Java!");
		String str4 = new String("Welcome to Java!");
		//test
		System.out.println(str1 == str2);
		System.out.println(str3 == str4);
		
		//---Methods of String
		System.out.println(str1.charAt(0));
		
		
//		System.out.println(str1.compareTo(str2));
//		System.out.println(str1.equals(str2));
//		
//		
//		System.out.println(str3.compareTo(str4));
//		System.out.println(str3.equals(str4));
//		
//		
//		System.out.println(str1.codePointAt(0));

	}

}
