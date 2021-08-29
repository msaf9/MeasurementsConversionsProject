package conversion.project;

import java.util.Scanner;

public class Measurements {
	int d = 0;

	void measure() {
		while (d != 1) {
			@SuppressWarnings("resource")
			Scanner sc = new Scanner(System.in);
			System.out.println("1.To convert kilo watt hour to gigajoule\n" + "2.kilo joule to British thermal units\n"
					+ "3. Horse power to kilo joules per second\n" + "4.British thermal unit to Kilo watthour \n"
					+ "5.horse power to watt.\n6.Exit ");
			System.out.println("Enter your choice: ");
			int ch = sc.nextInt();
			if (ch == 1) {
				System.out.println("Enter the value in kilo watt hour");
				int kwh1 = sc.nextInt();
				int gj = 278 * kwh1;
				System.out.println(" Giga joule= " + gj);
			}
			if (ch == 2) {
				System.out.println("Enter the value in kilo joule");
				int kj = sc.nextInt();
				double btu = 1.05 * kj;
				System.out.println("British thermal Unit =" + btu);
			}
			if (ch == 3) {
				System.out.println("Enter the value in kilo joule per second");
				int kj = sc.nextInt();
				double hp = 0.7457 * kj;
				System.out.println("Horsepower = " + hp);
			}
			if (ch == 4) {
				System.out.println("Enter value in British thermal unit");
				int btu = sc.nextInt();
				double kwh = 3412 * btu;
				System.out.println("Kilo watt hour= " + kwh);
			}
			if (ch == 5) {
				System.out.println("Enter value in Horsepower");
				int hp = sc.nextInt();
				int watt = hp * 746;
				System.out.println("Watt= " + watt);
			}
			if (ch == 6) {
				d = 1;
			}
		}
	}

}
