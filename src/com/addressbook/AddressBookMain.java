package com.addressbook;

import java.util.Scanner;

public class AddressBookMain {

    public static void main(String[] args) {

        System.out.println("Welcome to Address Book Program");

        Scanner scanner = new Scanner(System.in);
        AddressBookSystem system = new AddressBookSystem();

        boolean exit = false;

        while (!exit) {

            System.out.println("1. Create New Address Book");
            System.out.println("2. Select Address Book");
            System.out.println("3. Search by City");
            System.out.println("4. Search by State");
            System.out.println("5. View by City");
            System.out.println("6. View by State");
            System.out.println("7. Exit");

            int choice = Integer.parseInt(scanner.nextLine());

            switch (choice) {

                case 1:
                    System.out.println("Enter Address Book Name:");
                    String bookName = scanner.nextLine();
                    system.addAddressBook(bookName);
                    break;

                case 2:
                    System.out.println("Enter Address Book Name to Access:");
                    String name = scanner.nextLine();
                    AddressBook addressBook = system.getAddressBook(name);

                    if (addressBook == null) {
                        System.out.println("Address Book not found!");
                        break;
                    }

                    boolean back = false;

                    while (!back) {

                        System.out.println("\nAddress Book Menu:");
                        System.out.println("1. Add Contact");
                        System.out.println("2. Edit Contact");
                        System.out.println("3. Delete Contact");
                        System.out.println("4. Back");

                        int option = Integer.parseInt(scanner.nextLine());

                        switch (option) {

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
                                system.addContactToCityStateMap(contact);
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
                                back = true;
                                break;

                            default:
                                System.out.println("Invalid option!");
                        }
                    }
                    break;

                case 3:
                    System.out.println("Enter City to search:");
                    String city = scanner.nextLine();
                    system.searchByCity(city)
                            .forEach(contact -> System.out.println(contact.getFirstName() + " " + contact.getLastName()));
                    break;

                case 4:
                    System.out.println("Enter State to search:");
                    String state = scanner.nextLine();
                    system.searchByState(state)
                            .forEach(contact -> System.out.println(contact.getFirstName() + " " + contact.getLastName()));
                    break;

                case 5:
                    System.out.println("Enter City:");
                    String cityView = scanner.nextLine();
                    system.viewByCity(cityView);
                    break;

                case 6:
                    System.out.println("Enter State:");
                    String stateView = scanner.nextLine();
                    system.viewByState(stateView);
                    break;

                case 7:
                    exit = true;
                    System.out.println("Exiting Address Book System...");
                    break;

                default:
                    System.out.println("Invalid choice!");
            }
        }

        scanner.close();
    }
}