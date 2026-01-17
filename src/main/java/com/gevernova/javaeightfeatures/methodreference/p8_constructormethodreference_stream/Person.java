package com.gevernova.javaeightfeatures.methodreference.p8_constructormethodreference_stream;

public class Person {
    Integer n;

    public Person(int n)
    {
        this.n = n;
    }

    @Override
    public String toString() {
        return "Person{" +
                "n=" + n +
                '}';
    }
}
