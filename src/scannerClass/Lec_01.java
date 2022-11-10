package scannerClass;

import java.util.Scanner;

public class Lec_01 {

	public static void main(String[] args) {
		System.out.println("My info below: ");
		Scanner scanner = new Scanner(System.in);
		String name = scanner.nextLine();
		int age = scanner.nextInt();
		double grade = scanner.nextDouble();
		System.out.println("My name: " + name + "\nMy age: " + age + "\nMy grade: " + grade);
		System.out.println("\n---------------------------------------------------------------\n");
		int a = scanner.nextInt();
		int b = scanner.nextInt();
		int c = scanner.nextInt();
		int total1 = a + b + c;
		System.out.println("Sum of a,b,c: " + total1);
		System.out.println("\n-----------------------------------------------------------------\n");
		float hwGrade = scanner.nextFloat();
		float quizGrade = scanner.nextFloat();
		float averageGrade = (hwGrade + quizGrade)/2;
		System.out.println("Final grade: " + averageGrade);
		scanner.close();
		

	}

}
