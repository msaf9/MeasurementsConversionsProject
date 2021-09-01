package conversion.project;

import java.util.Scanner;

public class Mole extends PartsPer {

	protected static void molesm() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of moles :");
		double mg = sc.nextDouble();
		double gm;
		gm = (mg * 6.023 * Math.pow(10, 23));

		System.out.println("The given moles is equal to ");
		System.out.println("   ");
		System.out.println(" " + gm + " grams.");
	}

	protected static void molesg() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of grams :");
		double mg = sc.nextDouble();
		double mol;
		mol = mg / (6.023 * Math.pow(10, 23));

		System.out.println("The given grams is equal to ");
		System.out.println("   ");
		System.out.println(" " + mol + " moles. ");
	}

	protected static void molarity() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the molarity :");
		double m = sc.nextDouble();
		System.out.print("Enter the Equivalen weight: ");
		double e = sc.nextDouble();
		double normality = (m * e);

		System.out.println("The given molarity is equal to ");
		System.out.println("   ");
		System.out.println(" " + normality + " N ");
	}

	protected static void normality() {
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);
		System.out.print("Enter the molarity :");
		double n = sc.nextDouble();
		System.out.print("Enter the Equivalen weight: ");
		double e = sc.nextDouble();
		double molarity;
		molarity = (n / e);

		System.out.println("The given normality is equal to ");
		System.out.println("   ");
		System.out.println(" " + molarity + " M ");
	}

	public Mole() {
		super();
	}

}