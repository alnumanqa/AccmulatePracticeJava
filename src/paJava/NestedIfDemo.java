package paJava;

public class NestedIfDemo {
	// can write multiple if condition

	public static void main(String[] args) {
		int i = 50;

		if (i == 50) {
			System.out.println("i is 50");
			if (i < 65) {
				System.out.println("i is smaller than 65");
				if (i < 55) {
					System.out.println("i is smaller than 55");
				}
			}
		}

	}

}
