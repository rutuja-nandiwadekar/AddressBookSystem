package com.bridgelabz;

import java.util.ArrayList;
import java.util.Scanner;

public class AddressBookMain {

	static Scanner sc = new Scanner(System.in);
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

		// Add the above list to personDetails array list
		personDetails.add(add);
		System.out.println(add);
	}

	/*
	 * This is the method to edit existing contact person using their name
	 */
	public void editPerson() {
		System.out.println("Enter name to Edit");
		String name = sc.next();

		for (int i = 0; i < personDetails.size(); i++) {
			Contacts p = (Contacts) personDetails.get(i);

			if (name.equals(p.getFirstName())) {
				System.out.println(p);

				System.out.print(
						"Enter what to update(1.first name/ 2.last name/ 3.city/ 4.state/ 5.phone/ 6.zip/ 7.email): ");
				sc.nextLine();
				Integer choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your first name to update:");
					p.firstName = sc.next();
					break;
				case 2:
					System.out.println("Enter your last name to update:");
					p.lastName = sc.next();
					break;
				case 3:
					System.out.println("Enter your city name to update:");
					p.city = sc.next();
					break;
				case 4:
					System.out.println("Enter your state name to update:");
					p.state = sc.next();
					break;
				case 5:
					System.out.println("Enter Your phone no to update:");
					p.phNo = sc.nextInt();
					break;
				case 6:
					System.out.println("Enter Your zip to update:");
					p.zip = sc.nextInt();
					break;
				case 7:
					System.out.println("Enter Your email to update:");
					p.email = sc.next();
					break;
				}
				// updated personDetails array list
				personDetails.set(i, p);
				System.out.println(p);
			}
		}
	}

	/*
	 * This is the method to delete existing contact person using their name
	 */
	public void deletePerson() {

		System.out.println("Enter name to Delete");
		String name = sc.next();

		for (int i = 0; i < personDetails.size(); i++) {
			Contacts p = (Contacts) personDetails.get(i);
			if (name.equals(p.getFirstName())) {
				System.out.println(p);
				personDetails.remove(i);
				System.out.println(personDetails.isEmpty());
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("Welcome to Address Book Program ");

		AddressBookMain addPerson = new AddressBookMain();
		// to add a new Contact
		addPerson.newContact();
		// to edit existing contact
		addPerson.editPerson();
		// to delete existing contact
		addPerson.deletePerson();
	}
}