package ControlFlow;

import java.util.Scanner;
public class MovieDiscount {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the number of tickets you wish to buy:");
		int noOfTickets = sc.nextInt();
		System.out.println("Enter your Age:");
		int age = sc.nextInt();
		
		double normalPrice=7.0;
		double ticketPrice = 0;
		if(age<=0) {
			System.out.println("Invalid Age.");
			
		}
		else if(age<5) {
			ticketPrice=normalPrice * 0.4 * noOfTickets;
		}
		else if(age>60) {
			ticketPrice=normalPrice * 0.45 * noOfTickets;
		}
		else {
			if(noOfTickets>=2) {
				ticketPrice=normalPrice * 0.7 * noOfTickets;
			}
			else {
				ticketPrice=normalPrice * noOfTickets;
			}
		}
		System.out.println("Ticket Price: " + ticketPrice + " Euros");
		sc.close();
	}
}

