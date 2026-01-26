package com.gevernova.javaeightfeatures.problemstatements.employeedataprocessing;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {
        List<Employee> employees = new ArrayList<>(List.of(
                new Employee(1, "Ashutosh", "Engineering", 100000),
                new Employee(2, "Ram", "Hr", 200000),
                new Employee(3, "Atul", "Manufacturing", 400000),
                new Employee(4, "Amit", "Engineering", 10000)
        ));

        //Filter
        List<Employee> filteredEmployee = employees.stream()
                .filter(e-> Objects.equals(e.getDept(), "Engineering") && e.getSalary().compareTo(80000) > 0)
                .toList();
        System.out.println("Filtered employee list: " + filteredEmployee);

        //Sort
        List<Employee> sortedEmployee = employees.stream()
                .sorted(Comparator.comparing(Employee::getSalary).reversed())
                .toList();
        System.out.println("\nSorted employee list by their salary in reverse order: " + sortedEmployee);

        //Group
        Map<String , List<Employee>> empgorup = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept));
        System.out.println("\nEmployee groups by department: " + empgorup);

        //Aggregate
        Map<String, Double> avgSalary = employees.stream()
                .collect(Collectors.groupingBy(Employee::getDept, Collectors.averagingDouble(Employee::getSalary)));
        System.out.println("\nAverage salary by group: " + avgSalary);
    }
}
