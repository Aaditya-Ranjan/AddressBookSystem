package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        System.out.println("Enter First Name:");
        String firstName = scanner.nextLine();

        System.out.println("Enter Last Name:");
        String lastName = scanner.nextLine();

        System.out.println("Enter Address:");
        String address = scanner.nextLine();

        System.out.println("Enter City:");
        String city = scanner.nextLine();

        System.out.println("Enter State:");
        String state = scanner.nextLine();

        System.out.println("Enter Zip:");
        String zip = scanner.nextLine();

        System.out.println("Enter Phone Number:");
        String phoneNumber = scanner.nextLine();

        System.out.println("Enter Email:");
        String email = scanner.nextLine();

        Contact contact = new Contact(firstName, lastName, address,
                city, state, zip, phoneNumber, email);

        addressBook.addContact(contact);

        System.out.println("Do you want to edit a contact? (yes/no)");
        String choice = scanner.nextLine();

        if (choice.equalsIgnoreCase("yes")) {
            System.out.println("Enter First Name of contact to edit:");
            String nameToEdit = scanner.nextLine();
            addressBook.editContact(nameToEdit, scanner);
        }

        System.out.println("Do you want to delete a contact? (yes/no)");
        String deleteChoice = scanner.nextLine();

        if (deleteChoice.equalsIgnoreCase("yes")) {
            System.out.println("Enter First Name of contact to delete:");
            String nameToDelete = scanner.nextLine();
            addressBook.deleteContact(nameToDelete);
        }

        scanner.close();
    }
}