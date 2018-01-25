
public class javaBasics {

	public static void main(String[] args) {
		final String TEST = "hello";
		
		final int TESTINT = 4;
		
		//primitive type declarations
		byte b = 12;
		short s = 32767;
		int i = 13333;
		float fl = 6.7f; //can use lower or upper case
		double d = 5.6667;
		char c = 'c';
		boolean bool = true;
		long l = 123443123123L; //can use lower or upper case
		
		//implicit conversion examples
		int numOfItems = 5;
		System.out.println(3.0/1.5);
		System.out.println(3.0/2);
		System.out.println((numOfItems + 10) / 2);
		System.out.println((numOfItems + 10) / 2.0);
		
		//explicit casting
		double x = (double) 3/ (double) 5;
		double x1 = (double) (3/5); // prints 0.0 because division is done before double casting
		System.out.println(x); 
		System.out.println(x1);
		
		//example 2 -- common error forgetting to cast
		int kidsInFamily1 = 3;
		int kidsInFamily2 = 4;
		int numOfFamilies = 2;
		
		double avgKidsPerFamily = (double)(kidsInFamily1 + kidsInFamily2) / numOfFamilies;
		
		System.out.println(avgKidsPerFamily);
	}

}
