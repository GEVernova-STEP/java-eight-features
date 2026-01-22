package com.gevernova.javaeightfeatures.addressbook;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;



public class AddressBook {
    private List<Person> book;

    //Constructor
    public AddressBook() {
        this.book = new ArrayList<>();
    }

    //Getter
    public List<Person> getBook() {
        return book;
    }

    public void display()
    {
        book.stream().forEach((p)-> System.out.println(p));
    };

    //UC7
    public Boolean addPerson(Person person)
    {
        Boolean alreadyExist = book.stream().anyMatch((p)->p.equals(person));
        if (!alreadyExist)
        {
            book.add(person);
            return true;
        }
        return false;
    }

    //UC8
    public List<Person> searchByCity(String city)
    {
        return book.stream().filter((p)->p.getCity().equalsIgnoreCase(city)).toList();
    }
    public List<Person> searchByState(String state)
    {
        return book.stream().filter((p)->p.getState().equalsIgnoreCase(state)).toList();
    }

    //UC9
    public Map<String, List<Person>> viewByCity(){
        return book.stream().collect(Collectors.groupingBy((p)->p.getCity()));
    }
    public Map<String, List<Person>> viewByState(){
        return book.stream().collect(Collectors.groupingBy(Person::getState));
    }

    //UC10
    public  Map<String, Long> countByCity(){
        return book.stream().collect(Collectors.groupingBy((p)->p.getCity(),Collectors.counting()));
    }
    public  Map<String, Long> countByState(){
        return book.stream().collect(Collectors.groupingBy((p)->p.getState(),Collectors.counting()));
    }

    //UC11
    public List<Person> sortByName(){
        return book.stream().sorted(Comparator.comparing(Person::getFirstName, String.CASE_INSENSITIVE_ORDER).thenComparing(Person::getLastName, String.CASE_INSENSITIVE_ORDER)).collect(Collectors.toList());
    }

    //UC12
    public List<Person> sortByCity(){
        return book.stream().sorted(Comparator.comparing(Person::getCity,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
    public List<Person> sortByState(){
        return book.stream().sorted(Comparator.comparing(Person::getState,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
    public List<Person> sortByZip(){
        return book.stream().sorted(Comparator.comparing(Person::getZip,String.CASE_INSENSITIVE_ORDER))
                .collect(Collectors.toList());
    }
}
