package com.gevernova.javaeightfeatures.methodreference.p4_constructormethodreference;

public class Main {
    public static void main(String[] args) {
        ShapeCreator creator = Rectangle::new;

        Shape rectangle = creator.create(10, 5);

        rectangle.draw();
    }

}
