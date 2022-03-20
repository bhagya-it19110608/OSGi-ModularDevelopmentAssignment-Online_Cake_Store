package dashboard;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import ordering_service.OrderingServicePublisher;

public class DashboardActivator implements BundleActivator {

	ServiceReference OrderRef;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Welcome to Online Cake Store!!!...");
		

		OrderRef = context.getServiceReference(OrderingServicePublisher.class.getName());
		OrderingServicePublisher OrderingServicePublisher = (OrderingServicePublisher) context.getService(OrderRef);

		Scanner scn = new Scanner(System.in);

		int opt = 1;
		while (opt == 1) {

			System.out.println("");
			System.out.println("                         Welcome to Online Cake Store                         ");
			System.out.println("");

			System.out.println("\t\t                    Service                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Cake Order Service");
			System.out.println("\t\t\t    2. Equipment Order Service");
			System.out.println("\t\t\t    3. Delivery Service");
			System.out.println("\t\t\t    4. Feedback Services");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");

			System.out.print("Please Enter Your Prefer Service(1/2/3/4/0) :");
			int option = scn.nextInt();

			if (option == 1) {
				System.out.println("");
				OrderingServicePublisher.orderingService();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}
			}else {
				System.out.println("");
				System.out.println("Unavailable Service!!!...Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (opt != 1 && opt != 2) {
				System.out.println("");
				System.out.println("Unavailable Service!!!...");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				opt = scn.nextInt();

				if (opt == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Dashboard!!!...");
		context.ungetService(OrderRef);
		
	}
}
