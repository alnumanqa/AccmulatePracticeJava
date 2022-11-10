package conditionalStatement;

import java.util.Scanner;

public class Lec_01 {

	public static void main(String[] args) {
		System.out.println("Put your value in the consol");
		Scanner scanner = new Scanner(System.in);
		int a = scanner.nextInt();
		int b = scanner.nextInt();

		if (a % 2 == 0 && a < b) {
			System.out.println(a + " is an even number and " + a + " less than " + b);
		} else if (a % 2 == 1 || a > b) {
			System.out.println(a + " is an odd number " + a + " grater than " + b);
		} else if (!(a % 2 == 1 && a > b)) {  
			System.out.println(a + " is not an odd number " + a + " is not greater than " + b);

		}

	}

}
