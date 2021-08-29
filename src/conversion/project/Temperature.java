package conversion.project;

import java.util.Scanner;

public class Temperature extends Measurements {

	protected static void temperaturec() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("   ");
		System.out.print("Enter the temperature in celcius:");
		double t = in.nextDouble();
		double far, kel;
		far = (1.8 * t) + 32;
		kel = t + 273.5;

		System.out.print("The given temperature is :");
		System.out.println("   ");
		System.out.print(" " + far + "Fahreinheit.");
		System.out.println("   ");
		System.out.print(" " + kel + "Kelvin's.");
	}

	protected static void temperaturef() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in Fahreinheit:");
		double t = in.nextDouble();
		double cel, kel;
		cel = (t - 32) * 5 / 9;
		kel = cel + 273.5;

		System.out.print("The given temperature is :");
		System.out.println("   ");
		System.out.print(" " + cel + "Celcius");
		System.out.println("   ");
		System.out.print(" " + kel + "Kelvin's");
	}

	protected static void temperaturek() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.print("Enter the temperature in Kelvin :");
		double t = in.nextDouble();
		double cel;
		double far;
		cel = t - 273.5;
		far = (1.8 * cel) + 32;

		System.out.print("The given temperature is :");
		System.out.println("   ");
		System.out.print(" " + cel + "Celcius");
		System.out.println("   ");
		System.out.print(" " + far + "Fahreinheit.");
	}

	public Temperature() {
		super();
	}

}