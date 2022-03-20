package ordering_service;

import java.util.Random;
import java.util.Scanner;

public class OrderingServicePublisherImpl implements OrderingServicePublisher {
	
	public void orderingService() {
		
		Scanner scanner = new Scanner(System.in);

		System.out.print("Please Enter Your Name : ");
		String name = scanner.nextLine();

		System.out.println("");
		System.out.println("Hello!.." + name);
		System.out.println("");

		int cake = 1;
		while (cake == 1) {

			System.out.println("\t\t    ****************Cake A la Carte****************");
			System.out.println("");
			System.out.println("\t\t    	Cake Type		" + "Price (Per 1kg)");
			System.out.println("\t\t    =========================================");
			System.out.println("\t\t    1. Butter			" +  "550.00");
			System.out.println("\t\t    2. Chocolate		" +  "655.00");
			System.out.println("\t\t    3. Black Forest		" + "1250.00");
			System.out.println("\t\t    4. Gateau			" + "1350.00");
			System.out.println("\t\t    0. Exit");
			System.out.println("");

			System.out.print("Please Select Cake Type:  ");
			int optNo = scanner.nextInt();

			if (optNo == 1 || optNo == 2 || optNo == 3 || optNo == 4) {

				System.out.print("Enter Requesting weight for cake: ");
				double weight = scanner.nextInt();
				System.out.println();

				Random random = new Random();
				int orderNo = random.nextInt(1000);

				if (weight > 0 && weight <= 10) {

					if (optNo == 1) {
						double amount = (550.00 * weight);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Butter Cake");
						System.out.println("Weight \t: " + weight);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if (optNo == 2) {
						double amount = (655.00 * weight);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Chocolate Cake");
						System.out.println("Weight \t: " + weight);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 3){
						double amount = (1250.00 * weight);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Black Foresr Cake");
						System.out.println("Weight \t: " + weight);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else if(optNo == 4){
						double amount = (1350.00 * weight);
						System.out.println("Order No \t: " + orderNo);
						System.out.println("Cake Type \t: " + "Gateau Cake");
						System.out.println("Weight \t: " + weight);
						System.out.println("Amount\t: " + amount);
						System.out.println("");

					} else {
						System.out.println("Unavailable Cake Type");
					
					}					

					System.out.println("Do you want to continue ? (1/2) : ");
					cake = scanner.nextInt();

					if (cake == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
					}

				} else {

					System.out.println("Sorry!!! Maximum requesting weight for cake is 10kg at once..!");
					System.out.println("Do you want to continue ? (1/2) : ");
					cake = scanner.nextInt();

					if (cake == 2) {
						System.out.println("");
						System.out.println("Thank You!!!...");
						System.out.println();
						return;
					}

				}

			} else if (optNo == 0) {

				System.out.println("");
				System.out.println("Thank You!!!...");
				System.out.println();
				return;

			} else {

				System.out.println("");
				System.out.println("Sorry, Invalid Operation No. Do you want to continue.? (1/2) : ");
				cake = scanner.nextInt();

				if (cake == 2) {
					System.out.println("");
					System.out.println("Thank You!!!...");
					System.out.println();
				}

			}

			while (cake != 1 && cake != 2) {
				System.out.println("");
				System.out.println("Sorry, Invalid Operation No.");
				System.out.println("Type 1 = Continue Ordering / Type 2 = Exit  ");
				cake = scanner.nextInt();

				if (cake == 2) {
					System.out.println();
					System.out.println("Thank You!!!...");
					System.out.println();
				}
			}

		}
		
	}

}

