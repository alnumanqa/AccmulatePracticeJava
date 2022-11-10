package voidMethodDemo;

public class Bangladesh {
	int i = 33;
	int j = 67;
	byte a = 10;
	byte b = 20;

	public void addition() {
		int add = i + j;
		System.out.println("Addition of i and j: " + add);
	}

	public void substruction() {
		int substriction = i + j;
		System.out.println("Substriction of i and j: " + substriction);

	}

	public int add() {
		int total1 = i + j;
		System.out.println("Addition of i and j: " + total1);
		return total1;
	}

	public byte multipilication() {
		byte total2 = (byte) (a * b);
		System.out.println("Multipilication of i and j: " + total2);
		return total2;
	}

}
