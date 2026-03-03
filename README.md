# 📘 AddressBookSystem

A Java Console-Based Address Book Application developed using Object-Oriented Programming principles and GitFlow branching strategy.

---

## 🚀 Features Implemented (UC1 – UC13)

### 🔹 UC1 – Create Contact
- Created `Contact` class with fields:
    - First Name
    - Last Name
    - Address
    - City
    - State
    - Zip
    - Phone Number
    - Email

### 🔹 UC2 – Add Contact
- Console-based contact addition
- OOP relationship between `AddressBook` and `Contact`

### 🔹 UC3 – Edit Contact
- Edit contact using first name

### 🔹 UC4 – Delete Contact
- Delete contact using first name

### 🔹 UC5 – Multiple Contacts
- Menu-driven system
- Used `ArrayList` to store contacts

### 🔹 UC6 – Multiple Address Books
- Implemented `AddressBookSystem`
- Used `Map<String, AddressBook>`

### 🔹 UC7 – Prevent Duplicate Entry
- Overrode `equals()` and `hashCode()`
- Used Java Streams for duplicate detection

### 🔹 UC8 – Search by City or State
- Stream-based search across multiple address books

### 🔹 UC9 – View by City or State
- Maintained:
    - `City → List<Contact>`
    - `State → List<Contact>`

### 🔹 UC10 – Count by City or State
- Used Stream `.count()`

### 🔹 UC11 – Sort by Name
- Used `Comparator`
- Overrode `toString()`

### 🔹 UC12 – Sort by City, State, Zip
- Stream-based sorting

### 🔹 UC13 – File IO
- Write contacts to file
- Read contacts from file
- Used Java File IO

---

## 🛠 Technologies Used

- Java 17
- OOP Concepts
- Collections Framework
- Java Streams API
- File IO
- Git & GitFlow

---


## 🌳 Branch Strategy

- `main` → README only
- `develop` → All working code
- `feature/*` → Separate branch per UC

---

## 🧠 Concepts Covered

- Encapsulation
- Abstraction
- Collections
- Maps
- Streams
- Comparator
- File Handling
- Clean Git workflow

---

## 👨‍💻 Author

**Aaditya Ranjan**