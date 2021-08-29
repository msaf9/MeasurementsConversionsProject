package conversion.project;

import java.util.Scanner;

class Chemical extends Mole {

	public static void main(String args[]) {
		int l = 0, s;
		Chemical obj = new Chemical();
		System.out.println("Conversion Program");
		@SuppressWarnings("resource")
		Scanner in = new Scanner(System.in);
		int o = 0;
		while (o != 1) {
			System.out.println("1. Chemical");
			System.out.println("2. Electrical");
			System.out.println("3. Exit");
			System.out.print("Enter your choice (Only 1 or 2):");
			int oc = in.nextInt();
			System.out.println("");
			switch (oc) {
			case 1:
				while (l != 1) {
					System.out.println("1. Temperature");
					System.out.println("2. atm to Torr");
					System.out.println("3. Moles and Grams");
					System.out.println("4. Molarity and Normality");
					System.out.println("5. ppm & mg/Liter");
					System.out.println("6. Exit");
					System.out.print("Enter your choice (Only 1/ 2/ 3/ 4):");
					s = in.nextInt();
					System.out.println("");
					switch (s) {
					case 1:
						int ch1 = 0;
						while (ch1 != 1) {
							System.out.println("1. Celsius");
							System.out.println("2. Fahrenheit");
							System.out.println("3. Kelvin");
							System.out.println("4. Exit");
							System.out.println("Enter your choice (Only 1/ 2/ 3/ 4):");
							int c = in.nextInt();
							System.out.println("");
							switch (c) {
							case 1: {
								temperaturec();
								break;
							}
							case 2: {
								temperaturef();
								break;
							}
							case 3: {
								temperaturek();
								break;
							}
							case 4: {
								ch1 = 1;
								break;
							}
							}
						}
						break;
					case 2:
						int ch8 = 0;
						while (ch8 != 1) {
							System.out.println("1. atm");
							System.out.println("2. Torr");
							System.out.println("3. Exit");
							System.out.println("Enter your choice (Only 1/ 2/ 3):");
							int c = in.nextInt();
							System.out.println("");
							switch (c) {
							case 1: {
								atmospherea();
								break;
							}
							case 2: {
								atmospheret();
								break;
							}
							case 3: {
								ch8 = 1;
								break;
							}
							}
						}
						break;
					case 3:
						int ch2 = 0;
						while (ch2 != 1) {
							System.out.println("1. Moles");
							System.out.println("2. Grams");
							System.out.println("3. Exit");
							System.out.println("Enter your choice (Only 1/ 2/ 3):");
							int c = in.nextInt();
							System.out.println("");
							switch (c) {
							case 1: {
								molesm();
								break;
							}
							case 2: {
								molesg();
								break;
							}
							case 3: {
								ch2 = 1;
								break;
							}
							}
						}
						break;

					case 4:
						int ch3 = 0;
						while (ch3 != 1) {
							System.out.println("1. Molarity");
							System.out.println("2. Normality");
							System.out.println("3. Exit");
							System.out.println("Enter your choice (Only 1/ 2/ 3):");
							int c = in.nextInt();
							System.out.println("");
							switch (c) {
							case 1: {
								molarity();
								break;
							}
							case 2: {
								normality();
								break;
							}
							case 3: {
								ch3 = 1;
								break;
							}
							}
						}
						break;
					case 5:
						int ch4 = 0;
						while (ch4 != 1) {
							System.out.println("1. mg/Liter");
							System.out.println("2. ppm");
							System.out.println("3. Exit");
							System.out.println("Enter your choice (Only 1/ 2/ 3):");
							int c = in.nextInt();
							System.out.println("");
							switch (c) {
							case 1: {
								ppmp();
								break;
							}
							case 2: {
								ppm();
								break;
							}
							case 3: {
								ch4 = 1;
								break;
							}
							}
						}
						break;
					case 6:
						l = 1;
						break;

					default:
						System.out.println("Invalid Selection");
					}
				}
				break;
			case 2:
				obj.measure();
				break;
			case 3:
				o = 1;
				break;
			}
		}
	}
}