package com.manthan.hotel_billing;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class HotelBillingMain {
	
	public static void main(String[] args) {
		
		//Taking Input Through Scanner class
		Scanner sc=new Scanner(System.in);
		
		System.out.println("******Hotel Bill********");
		System.out.println("****Enter Your Choice****");
		System.out.println("Press 1: See all Food Items");
		System.out.println("----------------------------");
		System.out.println("Press 2: Add Orders");
		System.out.println("----------------------------");
		System.out.println("Press 3: Do Various Other Opeartions");
		System.out.println("----------------------------");
		System.out.println("Press 4: Get total bill ");
		
		//Choice declaration
		int choice;
		choice=sc.nextInt();
		
		//Switch Case Starts
		switch (choice) {
		case 1:
			HotelBillingShowAll showAll=new HotelBillingShowAll();
			showAll.showAll();
			break;
		case 2:
			HotelBillingAddOrder addOrder=new HotelBillingAddOrder();
			addOrder.addOrder();
			break;
		case 3:
			System.out.println("Enter choice again");
			System.out.println("Press A For Adding new Food Items");
			System.out.println("Press B to remove  Food Items");
			System.out.println("Press C to modify Food Items");
			char choice2=sc.next().charAt(0);
			
			//Internal Switch Case
			switch (choice2) {
			case 'A':
				HotelBillingAddNew addNew=new HotelBillingAddNew();
				addNew.addNewOrder();
				break;
			case 'B':
				HotelBillingRemoveItem removeItem=new HotelBillingRemoveItem();
				removeItem.removeItem();
				break;
			case 'C':
				HotelBillingModifyItems modifyItems=new HotelBillingModifyItems();
				modifyItems.modifyItems();
				break;

			default:
				System.out.println("Sorry You Have Enterd a wrong choice");
				break;
			}//End of internal switch case
			break;
		case 4:
			HotelBillingTotal billingTotal=new HotelBillingTotal();
			billingTotal.totalPrice();
			break;
		default:
			System.out.println("Sorry You Have Enterd a wrong choice");
			break;
		}//End of Switch Case
		
	}//End Of main

}//End Of Class
