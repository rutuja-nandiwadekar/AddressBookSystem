/*
 *Ability to add multiple person to Address Book
 */
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
		add.setFirstName(sc.next());
		System.out.println("Enter your Last Name");
		add.setLastName(sc.next());
		System.out.println("Enter your City");
		add.setCity(sc.next());
		System.out.println("Enter your state");
		add.setState(sc.next());
		System.out.println("Enter your Zip");
		add.setZip(sc.nextInt());
		System.out.println("Enter your Phone Number");
		add.setPhNo(sc.next());
		System.out.println("Enter your email ID");
		add.setEmail(sc.next());
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

				System.out.print(
						"Enter what to update(1.first name/ 2.last name/ 3.city/ 4.state/ 5.phone/ 6.zip/ 7.email): ");
				int choice = sc.nextInt();
				switch (choice) {
				case 1:
					System.out.println("Enter your first name to update:");
					p.setFirstName(sc.next());
					break;
				case 2:
					System.out.println("Enter your last name to update:");
					p.setLastName(sc.next());
					break;
				case 3:
					System.out.println("Enter your city name to update:");
					p.setCity(sc.next());
					break;
				case 4:
					System.out.println("Enter your state name to update:");
					p.setState(sc.next());
					break;
				case 5:
					System.out.println("Enter Your phone no to update:");
					p.setPhNo(sc.next());
					break;
				case 6:
					System.out.println("Enter Your zip to update:");
					p.setZip(sc.nextInt());
					break;
				case 7:
					System.out.println("Enter Your email to update:");
					p.setEmail(sc.next());
					break;
				default:
					System.out.println("invalid choice");
					break;
				}
				personDetails.set(i, p);
				System.out.println("Contacts Edited Successfully\n" + personDetails);
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
				personDetails.remove(i);
				System.out.println("Contacts deleted Successfully\n" + personDetails);
			}
		}
	}

	/*
	 * This is the method to view existing contact details
	 */
	public void viewPerson() {
		for (Contacts p : personDetails) {
			System.out.println(p);
		}
	}

	// main method
	public static void main(String args[]) {
		int choice = 1, person_count, i;
		// Creating the object of the class
		AddressBookMain addPerson = new AddressBookMain();
		while (choice != 0) {
			System.out.println("1.Add Person\n2.Edit Person\n3.Delete Person\n4.Display Person\nEnter your choice:\n");
			choice = sc.nextInt();
			switch (choice) {
			case 1:
				System.out.println("Enter Number of persons you want to add :");
				person_count = sc.nextInt();
				for (i = 0; i < person_count; i++) {
					addPerson.newContact();
				}
				break;
			case 2:
				addPerson.editPerson();
				break;
			case 3:
				addPerson.deletePerson();
				break;
			case 4:
				addPerson.viewPerson();
				break;
			default:
				break;
			}
		}
	}
}
