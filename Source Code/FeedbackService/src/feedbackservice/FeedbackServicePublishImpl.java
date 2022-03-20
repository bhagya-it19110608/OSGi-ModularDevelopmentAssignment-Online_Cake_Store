package feedbackservice;

import java.util.Scanner;
import java.time.format.DateTimeFormatter;
import java.time.LocalDateTime;

public class FeedbackServicePublishImpl implements FeedbackService {

	public void FeedbackServicePublish() {
		
		Scanner sc = new Scanner(System.in);
		
		String orderNo;
		String CustomerName;
		String review;
		String suggestions;
		String question;
		String test; 
		
		int Services;
		int rates;
		
		String email;
		
		DateTimeFormatter dft = DateTimeFormatter.ofPattern("yyyy/MM/dd HH:mm:ss");
		LocalDateTime now = LocalDateTime.now();
		
		int selection = 1;
		while (selection == 1) {

		System.out.println("Welcome to Feedback Service");
		System.out.println();
		
		System.out.print("Please Enter Your Name: ");
		String Name = sc.nextLine();
		System.out.println();
		
		System.out.println("Welcome : "+ Name);
		System.out.println();
		
		System.out.println("***************Please Follow our instructions***************");
		System.out.println();
		
		System.out.println();
		System.out.println("Types of feedback");
		System.out.println();
		System.out.println("	1 - Ask Questions		");
		System.out.println("	2 - Add Reviews			");
		System.out.println();
		
		System.out.print("Please Select Your Feedback type [1/2]? : ");
		int type = sc.nextInt();
		System.out.println();
		
		if (type == 1 || type == 2)
		{
			if (type == 2)
			{
				System.out.print("");
				test = sc.nextLine();
				System.out.println();
				
				System.out.print("Full Name : ");
				CustomerName = sc.nextLine();
				System.out.println();
				
				System.out.print("Order Number : ");
				orderNo = sc.nextLine();
				System.out.println();
				
				System.out.print("Email : ");
				email = sc.nextLine();
				System.out.println();
				
				System.out.print("Review : ");
				review = sc.nextLine();
				System.out.println();
				
				System.out.print("Overall Satisfaction [ 1-10 ( 1 - Terrible / 10 - Excellent)] : ");
				suggestions = sc.nextLine();
				System.out.println();
				
				System.out.println();
				
				System.out.println("|---Feedback submitted Successfully-----------");
		        System.out.println("|	Customer Name: "+ CustomerName);
		        System.out.println("|	Email: " + email );
		        System.out.println("| 	"+dft.format(now));
		        System.out.println("|---------------------------------------------");
			}
			else if (type == 1)
			{
				System.out.print("");
				test = sc.nextLine();
				System.out.println();
				
				System.out.print("Full Name : ");
				CustomerName = sc.nextLine();
				System.out.println();
				
				System.out.print("Email : ");
				email = sc.nextLine();
				System.out.println("");
				
				System.out.print("Questions : ");
				question = sc.nextLine();
				System.out.println("");
				
				System.out.print("How Can We Improve To Serve You Better? : ");
				suggestions = sc.nextLine();
				System.out.println("");
				
				System.out.println("");
				

				System.out.println("|---Feedback submitted Successfully-----------");
		        System.out.println("|	Customer Name: "+ CustomerName);
		        System.out.println("|	Email: " + email );
		        System.out.println("| 	"+dft.format(now));
		        System.out.println("|---------------------------------------------");
		        

			}
			else
			{
				System.out.println("");
				System.out.println("Invalid Input.!!Do you want to continue.? [1-Yes | 2-No ](1/2) : ");
				Services = sc.nextInt();
				
				if (Services == 2) {
					System.out.println("");
					System.out.println("Thank You");
					System.out.println();
				}
			}
					
			System.out.println("");
			System.out.println("Thank You For The Feedback");
			System.out.println("Have A Nice Day !!!");
			System.out.println();
			return;
			}
		}
	}
}

