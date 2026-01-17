package com.gevernova.javaeightfeatures.methodreference.p4_constructormethodreference;

public class Rectangle implements Shape{
    private double height;
    private double width;

    public Rectangle(double height, double width) {
        this.height = height;
        this.width = width;
    }

    @Override
    public void draw() {
        System.out.println("Rectangle created with width = " + width + " and height = " + height);
    }
}
