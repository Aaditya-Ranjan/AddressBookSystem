package com.addressbook;

import java.util.HashMap;
import java.util.Map;
import java.util.List;
import java.util.stream.Collectors;
import java.util.ArrayList;

public class AddressBookSystem {

    private Map<String, AddressBook> addressBookMap = new HashMap<>();
    private Map<String, List<Contact>> cityMap = new HashMap<>();
    private Map<String, List<Contact>> stateMap = new HashMap<>();

    public void addAddressBook(String name) {
        if (addressBookMap.containsKey(name)) {
            System.out.println("Address Book with this name already exists!");
        } else {
            addressBookMap.put(name, new AddressBook());
            System.out.println("Address Book created successfully!");
        }
    }

    public void countByCity(String city) {

        long count = cityMap.getOrDefault(city, new java.util.ArrayList<>())
                .stream()
                .count();

        System.out.println("Number of contacts in city " + city + ": " + count);
    }

    public void countByState(String state) {

        long count = stateMap.getOrDefault(state, new java.util.ArrayList<>())
                .stream()
                .count();

        System.out.println("Number of contacts in state " + state + ": " + count);
    }

    public void addContactToCityStateMap(Contact contact) {

        cityMap.computeIfAbsent(contact.getCity(), k -> new ArrayList<>())
                .add(contact);

        stateMap.computeIfAbsent(contact.getState(), k -> new ArrayList<>())
                .add(contact);
    }

    public void viewByCity(String city) {

        cityMap.getOrDefault(city, new ArrayList<>())
                .forEach(contact ->
                        System.out.println(contact.getFirstName() + " " + contact.getLastName()));
    }

    public void viewByState(String state) {

        stateMap.getOrDefault(state, new ArrayList<>())
                .forEach(contact ->
                        System.out.println(contact.getFirstName() + " " + contact.getLastName()));
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