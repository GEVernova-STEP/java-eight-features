package com.gevernova.javaeightfeatures.addressbook;


public class Person {
    //Basic details of person
    private String firstName;
    private String lastName;
    private String city;
    private String state;
    private String zip;

    //Constructor
    public Person(String firstName, String lastName, String city, String state, String zip) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.city = city;
        this.state = state;
        this.zip = zip;
    }

    //Getters
    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public String getCity() {
        return city;
    }

    public String getState() {
        return state;
    }

    public String getZip() {
        return zip;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) return true;
        if (!(obj instanceof Person)) return false;
        Person p = (Person)obj;
        return firstName.equalsIgnoreCase(p.firstName) &&
                lastName.equalsIgnoreCase(p.lastName) &&
                city.equalsIgnoreCase(p.city) &&
                state.equalsIgnoreCase(p.state) &&
                zip.equalsIgnoreCase(p.zip);
    }

    @Override
    public String toString() {
        return "Person{" +
                "firstName='" + firstName + '\'' +
                ", lastName='" + lastName + '\'' +
                ", city='" + city + '\'' +
                ", state='" + state + '\'' +
                ", zip='" + zip + '\'' +
                '}';
    }
}
