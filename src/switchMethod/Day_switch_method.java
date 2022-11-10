package switchMethod;

import java.util.Scanner;

public class Day_switch_method {

	public static void main(String[] args) {
		System.out.println("Print seven days");
		Scanner scanner = new Scanner(System.in);
		String day = scanner.nextLine();

		switch (day) {

		case "Monday":
			System.out.println(day);
			break;

		case "Tuesday":
			System.out.println(day);
			break;

		case "Wednesday":
			System.out.println(day);
			break;

		case "Thursday":
			System.out.println(day);
			break;

		case "Friday":
			System.out.println(day);
			break;

		case "Saturday":
			System.out.println(day);
			break;

		case "Sunday":
			System.out.println(day);
			break;

		default:
			System.out.println("Not found");

		}
		scanner.close();

	}

}
