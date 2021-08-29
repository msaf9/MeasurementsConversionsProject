package conversion.project;

import java.util.Scanner;

public class PartsPer extends Atmosphere {

	protected static void ppmp() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the mg/liter :");
		double p = in.nextDouble();
		double ppp;
		ppp = (0.001 * p);
	
		System.out.println("The given ppm is equal to ");
		System.out.println("   ");
		System.out.println(" " + ppp + " gram per liter.");
	
	}

	protected static void ppm() {
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		System.out.println("Enter the number of ppm :");
		double p = in.nextDouble();
		double fff;
		fff = (p / 0.001);
		System.out.println("   ");
		System.out.println("The given mg per liter is equal to");
		System.out.println("   ");
		System.out.println(" " + fff + " ppm (parts per million). ");
	}

	public PartsPer() {
		super();
	}

}