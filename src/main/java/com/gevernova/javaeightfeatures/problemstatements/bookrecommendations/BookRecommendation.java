package com.gevernova.javaeightfeatures.problemstatements.bookrecommendations;

public class BookRecommendation {
    private String title;
    private double rating;

    public BookRecommendation(String title, double rating) {
        this.title = title;
        this.rating = rating;
    }

    public String getTitle() {
        return title;
    }

    public double getRating() {
        return rating;
    }

    @Override
    public String toString() {
        return "\nBookRecommendation{" +
                "title='" + title + '\'' +
                ", rating=" + rating +
                '}';
    }
}

