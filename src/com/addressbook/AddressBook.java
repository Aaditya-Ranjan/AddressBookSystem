package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void editContact(String firstName, Scanner scanner) {

        for (Contact contact : contactList) {

            if (contact.getFirstName().equalsIgnoreCase(firstName)) {

                System.out.println("Enter new Address:");
                contact.setAddress(scanner.nextLine());

                System.out.println("Enter new City:");
                contact.setCity(scanner.nextLine());

                System.out.println("Enter new State:");
                contact.setState(scanner.nextLine());

                System.out.println("Enter new Zip:");
                contact.setZip(scanner.nextLine());

                System.out.println("Enter new Phone Number:");
                contact.setPhoneNumber(scanner.nextLine());

                System.out.println("Enter new Email:");
                contact.setEmail(scanner.nextLine());

                System.out.println("Contact updated successfully!");
                return;
            }
        }

        System.out.println("Contact not found!");
    }
}