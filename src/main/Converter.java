package main;

import java.util.Scanner;

public class Converter {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);

		int menu;

		int secondMenu;

		menu = topMenu(in);

		while (menu != 4) {

			switch (menu) {
			case 1:
				secondMenu = lengthMenu(in);
				switch (secondMenu) {
				case 1:
					System.out.println("Equals " + feetToMeters(in) + " meters");
					break;
				case 2:
					System.out.println("Equals " + inchesToCentimeters(in) + " centimeters");
					;
					break;
				case 3:

					break;
				}
				break;
			case 2:
				secondMenu = volumeMenu(in);
				switch (secondMenu) {
				case 1:
					System.out.println("Equals " + cupToLiter(in) + " liters");
					break;
				case 2:
					System.out.println("Equals " + gallonToLiters(in) + " liters");
					;
					break;
				case 3:

					break;

				}
			case 3:
				secondMenu = weightMenu(in);
				switch (secondMenu) {
				case 1:
					System.out.println("Equals " + ounceToGrams(in) + " grams");
					break;
				case 2:
					System.out.println("Equals " + poundToStone(in) + " stone");
					;
					break;
				case 3:

					break;

				}
			case 4:
				break;
				
			default:
				System.out.println("Not a valid option.  Please select a valid option.");

			}
			menu = topMenu(in);

		}
		System.out.println("GoodBye");
		in.close();

	}

	public static int menuValidator(String in) {
		int menu;
		try {
			menu = Integer.parseInt(in);
			return menu;
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid input.");
			return 0;
		}

	}

	public static double conversionValidator(String in) {
		double result;
		try {
			result = Double.parseDouble(in);
			return result;
		} catch (NumberFormatException e) {
			System.out.println("Please enter a valid input");
			return 0;
		}

	}

	public static int topMenu(Scanner in) {
		System.out.println("Select a conversion to make please enter the menu number:");
		System.out.println("1. Distance");
		System.out.println("2. Volume");
		System.out.println("3. Weight");
		System.out.println("4. Quit");
		String request = in.next();
		int result = menuValidator(request);
		return result;

	}

	public static int lengthMenu(Scanner in) {
		System.out.println("1. Feet to Meters");
		System.out.println("2. Inches to Centimeters");
		System.out.println("3. Return to top.");
		String request = in.next();
		int result = menuValidator(request);
		return result;
	}

	public static int volumeMenu(Scanner in) {
		System.out.println("1. Cups to Liters");
		System.out.println("2. Gallons to Liters");
		System.out.println("3. Return to top.");
		String request = in.next();
		int result = menuValidator(request);
		return result;
	}

	public static int weightMenu(Scanner in) {
		System.out.println("1. Ounces to Grams");
		System.out.println("2. Pounds to Stone");
		System.out.println("3. Return to top.");
		String request = in.next();
		int result = menuValidator(request);
		return result;
	}

	public static double ounceToGrams(Scanner in) {
		System.out.println("Enter your weight in ounces:");
		String query = in.next();
		double ounce = conversionValidator(query);
		double result = ounce * 28.3459;
		return result;
	}

	public static double poundToStone(Scanner in) {
		System.out.println("Enter your weight in pounds:");
		String query = in.next();
		double pound = conversionValidator(query);
		double result = pound * 0.0714286;
		return result;
	}

	public static double feetToMeters(Scanner in) {
		System.out.println("Enter your length in feet:");
		String query = in.next();
		double feet = conversionValidator(query);
		double result = feet * 0.3048;
		return result;
	}

	public static double inchesToCentimeters(Scanner in) {
		System.out.println("Enter your length in inches: ");
		String query = in.next();
		double inches = conversionValidator(query);
		double result = inches * 2.54;
		return result;
	}

	public static double cupToLiter(Scanner in) {
		System.out.println("Enter your volume in cups: ");
		String query = in.next();
		double cups = conversionValidator(query);
		double result = cups * .236588;
		return result;
	}

	public static double gallonToLiters(Scanner in) {
		System.out.println("Enter your volume in gallons: ");
		String query = in.next();
		double gallons = conversionValidator(query);
		double result = gallons * 3.78541;
		return result;
	}

}
