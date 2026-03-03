package com.addressbook;

import java.util.HashMap;
import java.util.Map;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();

    public void addAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book with this name already exists!");
        } else {
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book created successfully!");
        }
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public Map<String, AddressBook> getAllAddressBooks() {
        return addressBookMap;
    }
}