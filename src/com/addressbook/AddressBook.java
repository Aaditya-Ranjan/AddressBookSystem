package com.addressbook;

import java.util.ArrayList;
import java.util.List;

public class AddressBook {

    private List<Contact> contactList = new ArrayList<>();

    public void addContact(Contact contact) {
        contactList.add(contact);
        System.out.println("Contact added successfully!");
    }

    public List<Contact> getContactList() {
        return contactList;
    }
}