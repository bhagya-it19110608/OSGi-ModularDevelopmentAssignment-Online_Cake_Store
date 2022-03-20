package cakedeliverysubscriber;

import java.util.Scanner;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;
import cakedeliverypublisher.DeliveryCake;


public class CakeDeliActivator implements BundleActivator {
	
	ServiceReference deliveryServiceRef;

	
	public void start(BundleContext context) throws Exception {
		
			System.out.println("Start Online Cake  Delivery Subscriber !");
		
			deliveryServiceRef= context.getServiceReference(DeliveryCake.class.getName());
			DeliveryCake cakeDeliveryPublisher = (DeliveryCake) context.getService(deliveryServiceRef);
			
			//CakeDeliActivator.context = bundleContext;
			
			Scanner sc = new Scanner(System.in);

			int opt1 = 1;
			while (opt1 == 1) {

				System.out.println("");
				System.out.println("                         Welcome to Our Online Cake Store                       ");
				System.out.println("");

				System.out.println("\t\t                    Service                 ");
				System.out.println("\t\t    ----------------------------------------");
				System.out.println("");
				System.out.println("\t\t\t    1. Cake Store Service");
				System.out.println("\t\t\t    2. Cake Order Service");
				System.out.println("\t\t\t    3. Cake Delivery Service");
				System.out.println("\t\t\t    4. Feedback Services");
				System.out.println("\t\t\t    0. Exit");
				System.out.println("");
				System.out.println("\t\t    ----------------------------------------");
				System.out.println("");

				System.out.print("Please Enter Your Option(1/2/3/4/0) :");
				int opt2 = sc.nextInt();

				if (opt2 == 1) {
					System.out.println("");
					//CakeStorePublisher.publishService();
					System.out.println("");

					System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					
					}
				}else if (opt2 == 2) {
					System.out.println("");
					//OrderingService.orderingService();
					System.out.println("");

					System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					
					}
				}else if (opt2 == 3) {
					System.out.println("");
					cakeDeliveryPublisher.DeliveryCake();
					System.out.println("");

					System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					
					}
				}else if (opt2 == 4) {
					System.out.println("");
					//FeedbackService.FeedbackServicePublish();
					System.out.println("");

					System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println("");
						System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * *");
						System.out.println("");
					
					}
				}else if (opt2 == 0) {

					System.out.println("");
					System.out.println("                                THANK YOU                                 ");
					System.out.println("");
					return;

				} else {
					System.out.println("");
					System.out.println("Invalid Input.!!Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println("");
						System.out.println("                            THANK YOU                               ");
						System.out.println("");
					}
				}

				while (opt1 != 1 && opt1 != 2) {
					System.out.println("");
					System.out.println("Invalid Input.");
					System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
					opt1 = sc.nextInt();

					if (opt1 == 2) {
						System.out.println();
						System.out.println("**********************************THANK YOU********************************************");
						System.out.println("");
					}
				}

			}

		}
			
		

			

	public void stop(BundleContext context) throws Exception {
		
		System.out.println("Stop Online Cake Delivery subscriber !");
		context.ungetService(deliveryServiceRef);
		//CakeDeliActivator.context = null;
	}

}
