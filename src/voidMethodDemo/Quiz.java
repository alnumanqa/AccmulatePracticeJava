package voidMethodDemo;

public class Quiz {
	public static int p(int temp) {
		System.out.println("B");
		return temp + 3;

	}

	public static void main(String[] args) {
		int z = 6;
		int x = p(z);
		System.out.println(x);
	}
}
