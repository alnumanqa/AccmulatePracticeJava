package paJava;

public class ComparisonOperator {
	// == equal to, > greater than, < less than, >= greater than or equal to, <=
	// less than or equal to, != not

	public static void main(String[] args) {
		int value1 = 1;
		int value2 = 2;

		if (value1 == value2) {
			System.out.println("value1 == value2");
		}
		if (value1 != value2) {
			System.out.println("value1 != value2");
		}
		if (value1 >= value2) {
			System.out.println("value1 >= value2");

		}
		if (value1 <= value2) {
			System.out.println("value1 <= value2");

		}
		if (value1 > value2) {
			System.out.println("value1 > value2");
		}
		if (value1 < value2) {
			System.out.println("value1 < value2");
		}
	}
}
