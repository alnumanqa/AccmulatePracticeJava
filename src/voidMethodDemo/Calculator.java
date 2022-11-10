package voidMethodDemo;

public class Calculator {
	
	
	
	// Parameterized method is declared here
	public int addition(int f, int k) {
		int total1 = f + k;
		System.out.println("Addition of f & k: " + total1);
		return total1;
	}
	// Convert string to int
	public int substraction (int h, String k) {
		int total2 = h + Integer.parseInt(k);
		System.out.println("\nSubstraction of h & k: " + total2);
		return total2;
	}
	public double multipilication (double l, String m) {
		double total3 = l * Double.parseDouble(m);
		System.out.println("\nMultipilication of h & k: " + total3);
		return total3;
	}
	public int division (int l, double m) {
		int total4 = l / (int) m;
		System.out.println("\nDivision of h & k: " + total4);
		return total4;
	}
	public float addition(float n, int m) {
		float total5 = n + m;
		System.out.println("Addition of n & m: " + total5);
		return 0;
	}

	public static void main(String[] args) {
		Calculator calculator1 = new Calculator();
		calculator1.addition(15, 20); // Parameterized method is initialized here
		calculator1.substraction(20, "15");
		calculator1.multipilication(2, "3.0");
		calculator1.division(6, 3.0);
		calculator1.addition(2.0f, 3);
		calculator1.addition(25, 30);

	}

}
