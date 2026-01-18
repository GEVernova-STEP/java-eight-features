package com.gevernova.javaeightfeatures.problemstatements.p3_bookrecommendations;

import java.util.*;
import java.util.stream.Collectors;

public class Main {

    public static void main(String[] args) {
        List<Book> books = Arrays.asList(
                new Book("AA", "AuthX1", "Science Fiction", 4.8),
                new Book("BB", "AuthX2", "Science Fiction", 4.2),
                new Book("CC", "AuthX3", "Science Fiction", 4.5),
                new Book("DD", "AuthX4", "Dystopian", 4.6),
                new Book("EE", "AuthX5", "Science Fiction", 4.3),
                new Book("FF", "AuthX6", "Fantasy", 4.7),
                new Book("GG", "AuthX7", "Science Fiction", 4.1),
                new Book("HH", "AuthX8", "Science Fiction", 4.4)
        );

        //Filter
        List<Book> filteredBooks = books.stream()
                .filter(b -> (b.getGenre().equals("Science Fiction") && b.getRating() > 4.0))
                .toList();
        System.out.println("Filtered Books: " + filteredBooks);

        //Transform
        List<BookRecommendation> recommendations = books.stream()
                .map(b -> new BookRecommendation(b.getTitle(), b.getRating()))
                .toList();
        System.out.println("\nBook Recommendations: " + recommendations);

        //Sort
        List<BookRecommendation> sortedByRating = recommendations.stream()
                .sorted(Comparator.comparing(BookRecommendation::getRating).reversed())
                .toList();
        System.out.println("\nSorted by Rating (Descending): " + sortedByRating);

        //Paginate
        int pageSize = 5;
        int pageNumber = 1;

        List<BookRecommendation> paginatedResult = sortedByRating.stream()
                .skip(pageNumber * pageSize).limit(pageSize)
                .toList();
        System.out.println("\nPaginated Result (Page " + (pageNumber + 1) + "): " + paginatedResult);
    }
}

