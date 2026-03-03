package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBook addressBook = new AddressBook();

        boolean exit = false;

        while (!exit) {

            System.out.println("\nChoose an option:");
            System.out.println("1. Add Contact");
            System.out.println("2. Edit Contact");
            System.out.println("3. Delete Contact");
            System.out.println("4. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
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
                    break;

                case 2:
                    System.out.println("Enter First Name of contact to edit:");
                    String nameToEdit = scanner.nextLine();
                    addressBook.editContact(nameToEdit, scanner);
                    break;

                case 3:
                    System.out.println("Enter First Name of contact to delete:");
                    String nameToDelete = scanner.nextLine();
                    addressBook.deleteContact(nameToDelete);
                    break;

                case 4:
                    exit = true;
                    System.out.println("Exiting Address Book...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}