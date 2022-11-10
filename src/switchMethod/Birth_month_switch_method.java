package switchMethod;

import java.util.Scanner;

public class Birth_month_switch_method {

	public static void main(String[] args) {
		System.out.println("Print your birth month");
		Scanner scanner = new Scanner(System.in);
		int month = scanner.nextInt();
		String birthMonth = null;

		switch (month) {
		case 1:
			birthMonth = "January";
			break;

		case 2:
			birthMonth = "February";
			break;

		case 3:
			birthMonth = "March";
			break;
		case 4:
			birthMonth = "April";
			break;
		case 5:
			birthMonth = "May";
			break;
		case 6:
			birthMonth = "June";
			break;
		case 7:
			birthMonth = "July";
			break;
		case 8:
			birthMonth = "August";
			break;
		case 9:
			birthMonth = "September";
			break;
		case 10:
			birthMonth = "October";
			break;
		case 11:
			birthMonth = "November";
			break;
		case 12:
			birthMonth = "December";
			break;
		default:
			birthMonth = "Invalid";
			break;
		}
		System.out.println(birthMonth);
		scanner.close();

	}

}
