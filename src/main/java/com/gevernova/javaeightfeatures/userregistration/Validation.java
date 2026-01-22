package com.gevernova.javaeightfeatures.userregistration;

public interface Validation<T, R> {
    R validate(T t);
}
