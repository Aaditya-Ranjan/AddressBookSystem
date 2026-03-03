package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;

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

    public List<Contact> searchByCity(String city) {

        return addressBookMap.values().stream()
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .filter(contact -> contact.getCity().equalsIgnoreCase(city))
                .collect(Collectors.toList());
    }

    public List<Contact> searchByState(String state) {

        return addressBookMap.values().stream()
                .flatMap(addressBook -> addressBook.getContactList().stream())
                .filter(contact -> contact.getState().equalsIgnoreCase(state))
                .collect(Collectors.toList());
    }

    public AddressBook getAddressBook(String name) {
        return addressBookMap.get(name);
    }

    public Map<String, AddressBook> getAllAddressBooks() {
        return addressBookMap;
    }
}