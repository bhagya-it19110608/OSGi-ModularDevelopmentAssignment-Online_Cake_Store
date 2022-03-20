package feedbackservicesubscriber;

import java.util.Scanner;

import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.framework.ServiceReference;

import feedbackservice.FeedbackService;

public class Activator implements BundleActivator {

	ServiceReference FeedbackServiceRef;

	@Override
	public void start(BundleContext context) throws Exception {
		System.out.println("Start Service Subscriber.!");
		

		FeedbackServiceRef = context.getServiceReference(FeedbackService.class.getName());
		FeedbackService FeedbackService = (FeedbackService) context.getService(FeedbackServiceRef);
		
		Scanner sc = new Scanner(System.in);

		int options1 = 1;
		while (options1 == 1) {

			System.out.println("");
			System.out.println("                       Welcome to Online Cake Store                         ");
			System.out.println("");

			System.out.println("\t\t               Our Services                 ");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");
			System.out.println("\t\t\t    1. Equipment Order Service");
			System.out.println("\t\t\t    2. Cake Order Service");
			System.out.println("\t\t\t    3. Delivery Service");
			System.out.println("\t\t\t    4. Feedback Services");
			System.out.println("\t\t\t    0. Exit");
			System.out.println("");
			System.out.println("\t\t    ----------------------------------------");
			System.out.println("");

			System.out.print("Please Enter Your Option(1/2/3/4/0) : ");
			int options2 = sc.nextInt();

			if (options2 == 4) {
				System.out.println("");
				FeedbackService.FeedbackServicePublish();
				System.out.println("");

				System.out.println("Do you want to get another service ? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("* * * * * * * * * * * * * * * * * THANK YOU * * * * * * * * * * * * * * * * * * * * *");
					System.out.println("");
				
				}

			}else if (options2 == 0) {

				System.out.println("");
				System.out.println("                                THANK YOU                                 ");
				System.out.println("");
				return;

			} else {
				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? [Type 1 = Yes | Type 2 = No] : ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println("");
					System.out.println("                            THANK YOU                               ");
					System.out.println("");
				}
			}

			while (options1 != 1 && options1 != 2) {
				System.out.println("");
				System.out.println("Invalid Input.");
				System.out.println("Type 1 = Continue Services | Type 2 = Exit ");
				options1 = sc.nextInt();

				if (options1 == 2) {
					System.out.println();
					System.out.println("**********************************THANK YOU********************************************");
					System.out.println("");
				}
			}

		}

	}

	@Override
	public void stop(BundleContext context) throws Exception {
		System.out.println("Stop Subscriber.!");
		context.ungetService(FeedbackServiceRef);

	}

}
