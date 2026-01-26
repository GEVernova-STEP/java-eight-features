package com.gevernova.javaeightfeatures.methodreference.constructormethodreference_stream;

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
