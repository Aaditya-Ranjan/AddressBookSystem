package com.addressbook;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.Comparator;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {

        boolean duplicateExists = contactList.stream()
                .anyMatch(existingContact -> existingContact.equals(contact));

        if (duplicateExists) {
            System.out.println("Duplicate contact found! Cannot add.");
        } else {
            contactList.add(contact);
            System.out.println("Contact added successfully!");
        }
    }

    public List<Contact> getContactList() {
        return contactList;
    }

    public void sortByName() {

        contactList.stream()
                .sorted(Comparator.comparing(Contact::getFirstName)
                        .thenComparing(Contact::getLastName))
                .forEach(System.out::println);
    }

    public void sortByCity() {

        contactList.stream()
                .sorted(Comparator.comparing(Contact::getCity))
                .forEach(System.out::println);
    }

    public void sortByState() {

        contactList.stream()
                .sorted(Comparator.comparing(Contact::getState))
                .forEach(System.out::println);
    }

    public void sortByZip() {

        contactList.stream()
                .sorted(Comparator.comparing(Contact::getZip))
                .forEach(System.out::println);
    }

    public void deleteContact(String firstName) {

        Contact contactToRemove = null;

        for (Contact contact : contactList) {
            if (contact.getFirstName().equalsIgnoreCase(firstName)) {
                contactToRemove = contact;
                break;
            }
        }

        if (contactToRemove != null) {
            contactList.remove(contactToRemove);
            System.out.println("Contact deleted successfully!");
        } else {
            System.out.println("Contact not found!");
        }
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