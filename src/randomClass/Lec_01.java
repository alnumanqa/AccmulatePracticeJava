package randomClass;

import java.util.Random;

public class Lec_01 {
	// comment out multiple line by shift+control+c
	//

	public static void main(String[] args) {
		Random random = new Random();
		int a = random.nextInt();
		int b = random.nextInt();
		System.out.println("Randomly choose number 1: " + a + "\nRandomly choose number 2: " + b
				+ "\nRandomly choose number 3: " + random.nextInt());
		System.out.println("\nUse next line with limit\n");
		int c = random.nextInt(30);
		int d = random.nextInt(20);
		System.out.println(
				"Randomly choose number 4: " + c + "\nRandomly choose number 5:" + d + "\nRandomly choose number 6:"
						+ random.nextInt(10) + "\nRandomly choose number 7:" + random.nextInt(5));
		System.out.println("Choose 8: " + random.nextDouble() + "\nChoose 9: " + random.nextFloat() );

	}

}
