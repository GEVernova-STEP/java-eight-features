package com.gevernova.javaeightfeatures.addressbook;

public class Main {
    public static void main(String[] args) {
        System.out.println("AddressBook");

        AddressBook addressBook = new AddressBook();

        addressBook.addPerson(new Person("Ashutosh", "Mishra", "Basti", "UP", "272302"));
        addressBook.addPerson(new Person("Ram", "Pandey", "Agra", "UP", "1"));
        addressBook.addPerson(new Person("Shyam", "Sukla", "Lucknow", "UP", "2"));
        addressBook.addPerson(new Person("Ankit", "Tiwari", "Patna", "Bihar", "3"));
        addressBook.addPerson(new Person("Ravi", "Mishra", "Hyd", "Telengana", "4"));
        addressBook.addPerson(new Person("Santosh", "Jay", "Blr", "Karanataka", "5"));

        addressBook.display();
        System.out.println();

        //UC8
        System.out.println("Search by city");
        addressBook.searchByCity("Basti").forEach(System.out::println);
        System.out.println();

        System.out.println("Search by state");
        addressBook.searchByState("UP").forEach(System.out::println);
        System.out.println();

        //UC9
        System.out.println("View by city");
        System.out.println(addressBook.viewByCity());
        System.out.println();

        System.out.println("View by state");
        System.out.println(addressBook.viewByState());
        System.out.println();

        //UC10
        System.out.println("Count by city");
        System.out.println(addressBook.countByCity());
        System.out.println();

        System.out.println("Count by state");
        System.out.println(addressBook.countByState());
        System.out.println();

        //UC11
        System.out.println("Sorting by names");
        addressBook.sortByName().forEach(System.out::println);
        System.out.println();
        addressBook.display();
        System.out.println();

        //UC12
        System.out.println("Sorting by city");
        addressBook.sortByCity().forEach(System.out::println);
        System.out.println();
    }
}
