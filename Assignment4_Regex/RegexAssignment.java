package regex;

public class RegexAssignment {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("isSSN()");
		RegexAssignment.isSSN("111-11-1111");
		RegexAssignment.isSSN("1332-212-122");
		System.out.println();

		System.out.println("isDriversLicense()");
		RegexAssignment.isDriversLicense("12345678");
		RegexAssignment.isDriversLicense("A2124521");
		System.out.println();

		System.out.println("isAreaCode()");
		RegexAssignment.isAreaCode("76548");
		RegexAssignment.isAreaCode("23123@");
		System.out.println();

		System.out.println("isCarPlate()");
		RegexAssignment.isCarPlate("A1W-CB90");
		RegexAssignment.isCarPlate("AAA-C-CAS");
		System.out.println();

	}

	public static void isSSN(String dl) {

		if (dl.matches("[0-9]{3}-[0-9]{2}-[0-9]{4}")) {
			System.out.print(dl.toString() + " ");
			System.out.println("Social Security Matches!");

		}

		else {
			System.out.print(dl.toString() + " ");
			System.out.println("Social Security DOES NOT Matches!");

		}

	}

	public static void isDriversLicense(String dl) {

		if (dl.matches("[0-9]{8}")) {
			System.out.print(dl.toString() + " ");
			System.out.println("Drivers License Matches!");

		} else {
			System.out.print(dl.toString() + " ");

			System.out.println("Drivers License Does Not Matches!");

		}

	}

	public static void isAreaCode(String dl) {

		if (dl.matches("[0-9]{5}")) {
			System.out.print(dl.toString() + " ");

			System.out.println("Area Code Matches!");

		} else {
			System.out.print(dl.toString() + " ");

			System.out.println("Area Code DOES NOT Matches!");

		}

	}

	public static void isCarPlate(String dl) {

		if (dl.matches("[A-Z0-9]{3}-[A-Z0-9]{4}")) {

			System.out.print(dl.toString() + " ");
			System.out.println("Car Plate Matches!");

		} else {

			System.out.print(dl.toString() + " ");
			System.out.println("Car Plate DOES NOT Matches!");

		}

	}

}
