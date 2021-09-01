package conversion.project;

import java.util.Scanner;

public class Atmosphere extends Temperature {

	protected static void atmospherea() {
		double h;
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pressure in atm :");
		double a = sc.nextDouble();
		h = (760 * a);

		System.out.print("The given Atm is equal to ");
		System.out.println("   ");
		System.out.print(" " + h + "mm of Hg. (or) Torr.");
	}

	protected static void atmospheret() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the pressure in Torr :");
		double a = sc.nextDouble();
		double atm;
		atm = (0.0013157 * a);

		System.out.print("The given Torr is equal to ");
		System.out.println("   ");
		System.out.print(" " + atm + " atm (atmospheric pressure). ");
	}

	public Atmosphere() {
		super();
	}

}