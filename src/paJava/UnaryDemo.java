package paJava;

public class UnaryDemo {
	// + - ++ -- !

	public static void main(String[] args) {
		int result = + 1;
		// result is now 1
		System.out.println(result);
		
		result--;
		// result is now 0
		System.out.println(result);
		
		result++;
		// result is now 1
		System.out.println(result);
		
		result = -result;
		System.out.println(result);
		
		boolean success = true;
		//true 
		System.out.println(success);
		//false
		System.out.println(!success);
		

	}

}
