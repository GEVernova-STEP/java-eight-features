package com.gevernova.javaeightfeatures.methodreference.p4_constructormethodreference;

@FunctionalInterface
interface ShapeCreator {
    Shape create(double height, double width);
}
