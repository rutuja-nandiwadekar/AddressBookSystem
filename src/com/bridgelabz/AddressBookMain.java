package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	Scanner sc = new Scanner(System.in);
	// creation of arraylist
	ArrayList<Contacts> personDetails = new ArrayList<>();

	/*
	 * This is the method to add a new Contact to Address Book
	 */
	public void newContact() {
		Contacts add = new Contacts();
		System.out.println("Enter your First Name");
		add.firstName = sc.nextLine();
		System.out.println("Enter your Last Name");
		add.lastName = sc.nextLine();
		System.out.println("Enter your City");
		add.city = sc.nextLine();
		System.out.println("Enter your state");
		add.state = sc.nextLine();
		System.out.println("Enter your Zip");
		add.zip = sc.nextInt();
		System.out.println("Enter your Phone Number");
		add.phNo = sc.nextInt();
		System.out.println("Enter your email ID");
		add.email = sc.next();
		System.out.println("Added Successfully");

		// Add the above list to to person array list
		personDetails.add(add);
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");
		Scanner sc = new Scanner(System.in);

		AddressBookMain addPerson = new AddressBookMain();
		System.out.println("Enter Number of persons you want to add : ");
		int person_count = sc.nextInt();
		for (int i = 0; i < person_count; i++) {
			addPerson.newContact();
		}
		sc.close();

	}

}
