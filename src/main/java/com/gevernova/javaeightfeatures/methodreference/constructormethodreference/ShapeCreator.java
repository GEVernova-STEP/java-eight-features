package com.gevernova.javaeightfeatures.methodreference.constructormethodreference;

@FunctionalInterface
interface ShapeCreator {
    Shape create(double height, double width);
}
